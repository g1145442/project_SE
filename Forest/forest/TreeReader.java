package Forest;

import java.lang.Thread;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.HashMap;

class TreeReader extends Thread{

	private String text;	
	private enum TreeState{INIT,INWORD,MADENODE,INBRANCH,ONEHYPHEN,TWOHYPHEN,ERROR,ENDSTATE}; 
	private HashMap<String,Integer> treeMap;
//	private ArrayList<Node> rootList;

	public TreeReader(String str,HashMap<String,Integer> aMap){
			treeMap = aMap;
//			rootList = root;
			text =str;
		}

	public void run(){
		int depth=0,count=0,textLength = text.length();
		Pattern hyphen = Pattern.compile("-");
		Pattern space = Pattern.compile("[ ]");
		Pattern vertical = Pattern.compile("\\|");
		Pattern enter = Pattern.compile("[\n]");
		Pattern str = Pattern.compile("[[a-z]+|[A-Z]+]");
		TreeState state = TreeState.INIT;

		StringBuilder wordBuilder = new StringBuilder();

		while(state != TreeState.ENDSTATE&&textLength>count){
			char word = text.charAt(count);
			Matcher h = hyphen.matcher(""+word);
			Matcher s = space.matcher(""+word);
			Matcher e = enter.matcher(""+word);
			Matcher w = str.matcher(""+word);
			Matcher v = vertical.matcher(""+word);
			count++;
			switch(state){
				case INIT:
					if(w.find()){
						wordBuilder.append(word);
						state = TreeState.INWORD;
					}
					else{
						System.out.println("INIT:"+word);
					}
					break;
				case INWORD:
					if(w.find()){
						wordBuilder.append(word);
					}
					else if(e.find()){
						if(depth==0){
							treeMap.put(wordBuilder.toString(),depth);
							//System.out.println(wordBuilder.toString()+":"+depth);
							wordBuilder = new StringBuilder();
							state = TreeState.MADENODE;
						}
						else{
							treeMap.put(wordBuilder.toString(),depth);
							//System.out.println(wordBuilder.toString()+":"+depth);
							wordBuilder = new StringBuilder();
							depth=0;
							state = TreeState.MADENODE;		
						}
					}
					/*else if(e.find()&&depth==0){
						Node node = new Node();					
						rootList.add(node);
						treeMap.put(wordBuilder.toString(),depth);
						System.out.println(wordBuilder.toString()+":"+depth);
						wordBuilder = new StringBuilder();
						state = TreeState.MADENODE;
					}
					else if(e.find()&&depth>0){
						Node node = new Node();
						treeMap.put(wordBuilder.toString(),depth);
						System.out.println(wordBuilder.toString()+":"+depth);
						wordBuilder = new StringBuilder();
						depth=0;
						state = TreeState.MADENODE;
					}
					*/
					else{
						System.out.println("INWORD");
						state = TreeState.ERROR;
					}
					break;
				case MADENODE:
					if(count == textLength){
						state = TreeState.ENDSTATE;
					}
					else if(v.find()){
						state = TreeState.INBRANCH;
					}
					else if(w.find()){
						wordBuilder.append(word);
						state = TreeState.INWORD;
					}
					
					else{
						System.out.println("MADENODE:"+ word);
						state = TreeState.ERROR;
					}
					break;
				case INBRANCH:
					if(h.find()){
						state = TreeState.ONEHYPHEN;
					}
					else{
						state = TreeState.ERROR;
					}
					break;
				case ONEHYPHEN:
					if(h.find()){
						depth++;
						state = TreeState.TWOHYPHEN;	
					}
					else{
						System.out.println("ONEHYPHEN:"+word);
						state = TreeState.ERROR;
					}
					break;
				case TWOHYPHEN:
					if(v.find()){
						state = TreeState.INBRANCH;
					}

					else if(w.find()){
						wordBuilder.append(word);
						state = TreeState.INWORD;
					}	
					else if(s.find()){
						//何もしない
					}
					else{
						System.out.println("TWOHYPHEN:"+word);
						state = TreeState.ERROR;
					}
					break;
				case ERROR:
					System.out.println("error");
					state = TreeState.ENDSTATE;
					break;
			}

		}

	}
}
