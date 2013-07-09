package Forest;

import java.lang.Thread;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.lang.StringBuilder;

class BranchReader extends Thread{

	private String text;	
	private enum BranchState{INIT,INNUM1,ENDNUM1,INNUM2,ERROR,END};
	private ArrayList<SmallBranch> branchList;

	public BranchReader(String str,ArrayList<SmallBranch> list){
		branchList = list;
		text=str;

	}

	public void run(){
		int num1=0,num2=0,count=0,textLength=text.length();	
		Pattern number = Pattern.compile("[0-9]+");
		Pattern comma = Pattern.compile("[,]");
		Pattern space = Pattern.compile("[ ]");
		Pattern enter = Pattern.compile("[\n]");
		BranchState state = BranchState.INIT;

		StringBuilder num1Builder = new StringBuilder();
		StringBuilder num2Builder = new StringBuilder();
		while(state != BranchState.END&&textLength>count){
			char word = text.charAt(count);
			//System.out.print(word);
			Matcher n = number.matcher(""+word);
			Matcher c = comma.matcher(""+word);
			Matcher s = space.matcher(""+word);
			Matcher e = enter.matcher(""+word);
			count++;
			switch(state){
				case INIT:
					if(n.find()){
						num1Builder.append(word);
						state = BranchState.INNUM1;
					}
					else{
						System.out.println("INIT:"+word);
						state = BranchState.ERROR;
					}
					break;
				case INNUM1:
					if(count==textLength){
						state = BranchState.END;
					}
					else if(n.find()){
						num1Builder.append(word);
						//System.out.println("ok");
					}
					else if(e.find()){
						//何もしない	
					}
					else if(c.find()){
						num1 = toInteger(num1Builder.toString());
						state = BranchState.ENDNUM1;
					}
					else{
						state = BranchState.ERROR;
						System.out.println("INNUM1:"+word);
					}
					break;
				case ENDNUM1:
					if(s.find()){
						//state = BranchState.INNUM2;
						//System.out.print(word);
						//num2+=toInteger(word);
						//rank++;
					}
					else if(n.find()){
						num2Builder.append(word);
						state = BranchState.INNUM2;
					}
					else{
						state = BranchState.ERROR;
						System.out.println("ENDNUM1:"+word);	
					}
					break;
				case INNUM2:
					if(n.find()){
						num2Builder.append(word);
					}
					else if(e.find()){
						num2 = toInteger(num2Builder.toString());
						SmallBranch smallBranch = new SmallBranch(num1,num2);
						branchList.add(smallBranch);
						num1=0;
						num2=0;
						num1Builder = new StringBuilder();
						num2Builder = new StringBuilder();
						state = BranchState.INNUM1;
					}
					else{
						System.out.println("INNUM2:"+word);	
						state = BranchState.ERROR;
					}
					break;
				case ERROR:
					System.out.println("error");
					state = BranchState.END;
					break;
			}
		}
		//forestReader.setBranch(branchList);	
	}

	int toInteger(String a){
		return Integer.parseInt(a);
	}

}

