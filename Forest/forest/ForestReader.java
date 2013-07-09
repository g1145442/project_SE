package Forest;

import java.util.*; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.StringBuilder;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;

class ForestReader{

	private ForestModel forestModel;

	private HashMap<Integer,String> nodeMap;

	private HashMap<String,Integer> treeMap;

	private ArrayList<SmallBranch> branchList;

	private ArrayList<Node> rootList;

	public ForestReader(){
		rootList= new ArrayList<Node>();
		nodeMap = new HashMap<Integer,String> ();
		treeMap = new HashMap<String,Integer>();
		branchList = new ArrayList<SmallBranch> ();		
	}

	public void fileRead(){
		try{
			FileReader file = new FileReader("text/forest.txt");
			BufferedReader bf = new BufferedReader(file);
			StringBuilder strBuilder = new StringBuilder();
			String text;
			while((text=bf.readLine())!=null){
				strBuilder.append(text+"\n");
			}
			text = strBuilder.toString();

			bf.close();
			file.close();

			String[] splitText = text.split("branches:\n|trees:\n|nodes:\n");
			System.out.println(splitText[1]);
			TreeReader treeReader = new TreeReader(splitText[1],treeMap,rootList);
			NodeReader nodeReader = new NodeReader(splitText[2],nodeMap);
			BranchReader branchReader = new BranchReader(splitText[3],branchList);
			//System.out.println(splitText[3]);
			branchReader.start();
			nodeReader.start();
			treeReader.start();
			Thread.sleep(100);

		}catch(Exception e){
			System.out.println(e);
		}
	}

	public void setModel(ForestModel aModel){
	
	}

}

