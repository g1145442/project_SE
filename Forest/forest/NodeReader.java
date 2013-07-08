package Forest;

import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.StringBuilder;

class NodeReader extends Thread{
	
	private String text;	
	private enum NodeState{INIT,INNUM,ENDNUM,INWORD,ERROR,END}; 
	private HashMap<Integer,String> nodeMap;

	public NodeReader(String str,HashMap<Integer,String> map){
		text = str;
		nodeMap = map;
	}

	public void run(){
		int count=0,num=0,textLength = text.length();
		String nodeWord;
		Pattern number = Pattern.compile("[0-9]+");	
		Pattern comma = Pattern.compile("[,]");	
		Pattern space = Pattern.compile("[ ]");
		Pattern enter = Pattern.compile("[\n]");
		Pattern str = Pattern.compile("[[a-z]+|[A-Z]+]");
		NodeState state = NodeState.INIT;

		StringBuilder numBuilder = new StringBuilder();
		StringBuilder wordBuilder = new StringBuilder();
		
		while(state != NodeState.END&&textLength>count){
			char word = text.charAt(count);
			Matcher n = number.matcher(""+word);
			Matcher c = comma.matcher(""+word);
			Matcher s = space.matcher(""+word);
			Matcher e = enter.matcher(""+word);
			Matcher w = str.matcher(""+word);
			count++;
			switch(state){
				case INIT:
					if(n.find()){
						numBuilder.append(word);
						state = NodeState.INNUM;
					}
					else{
						System.out.println("INIT:"+word);
						state = NodeState.ERROR;
					}
					break;
				case INNUM:
					if(count==textLength){
						state = NodeState.END;
					}
					else if(n.find()){
						numBuilder.append(word);
					}
					else if(c.find()){
						num = toInteger(numBuilder.toString());
						state = NodeState.ENDNUM;
					}
					else{
						state = NodeState.ERROR;
						System.out.println("INNUM:"+word);
					}
					break;
				case ENDNUM:
					if(s.find()){
						//何もしない
					}
					else if(w.find()){
						wordBuilder.append(word);
						state = NodeState.INWORD;
					}
					else{
						state = NodeState.ERROR;
						System.out.println("ENDNUM:"+word);
					}
					break;
				case INWORD:
					if(w.find()){
						wordBuilder.append(word);
					}
					else if(e.find()){
						nodeWord = wordBuilder.toString();						
						nodeMap.put(num,nodeWord);
						//System.out.println(num+","+nodeWord);//でバッグ用
						num=0;
						nodeWord=null;
						numBuilder = new StringBuilder();
						wordBuilder = new StringBuilder();
						state = NodeState.INNUM;
						
					}
					else{
						state = NodeState.ERROR;
						System.out.println("INWORD:"+word);
					}
					break;
				case ERROR:
					System.out.println("error");
					state = NodeState.END;
					break;

			}
		}
	}

	int toInteger(String a){
		return Integer.parseInt(a);
	}
}
