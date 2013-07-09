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
		forestModel = new ForestModel();
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
			TreeReader treeReader = new TreeReader(splitText[1],treeMap);
			NodeReader nodeReader = new NodeReader(splitText[2],nodeMap);
			BranchReader branchReader = new BranchReader(splitText[3],branchList);
			//System.out.println(splitText[3]);
			branchReader.start();
			nodeReader.start();
			treeReader.start();
			Thread.sleep(100);
			setModel();
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public void setModel(){
		HashMap<Integer,Node> nodeAllMap = new HashMap<Integer,Node>();
		forestModel.setRootList(rootList);
		for(int i=1;i<=nodeMap.size();i++){
			Node node = new Node();
			node.setMyNum(i);
			node.setMyString(nodeMap.get(i));
			node.setMyDepth(treeMap.get(nodeMap.get(i)));
			if(treeMap.get(nodeMap.get(i))==0){
				rootList.add(node);
			}

			nodeAllMap.put(i,node);
		}
		for(SmallBranch aBranch:branchList){	
			if(aBranch!=null){
			int parent = aBranch.getParentNum();
			int child = aBranch.getChildNum();
			System.out.println(parent+","+child);	
			nodeAllMap.get(parent).setChildNode(nodeAllMap.get(child));
			}
		}
			
		for(Node aNode:rootList){
		forestModel.depthSearch(aNode);
		}
	}
}
