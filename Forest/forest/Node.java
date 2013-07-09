package Forest;

import java.awt.Point;
import java.util.ArrayList;

/**
 * 基本的なデータを管理するクラス。
 * 良好（2013年7月5日）
 */
class Node{
	
	/**
	 * 自分の深さを束縛する。
	 * 良好（2013年7月5日）
	 */
	private int myDepth;
	
	/**
	 * 自分の文字を束縛する。
	 * 良好（2013年7月5日）
	 */
	private String myString;

	/**
	 * 親のNodeを束縛する。
	 * 良好（2013年7月5日）
	 */
	private ArrayList<Node> parentNode;

	/**
	 * 子のNodeを束縛する。
	 * 良好（2013年7月5日）
	 */
	private ArrayList<Node> childNode;

	/**
	 * 自分の番号を束縛する。
	 * 良好（2013年7月5日）
	 */
	private int myNum;

	/**
	 * 自分の座標を束縛する。
	 * 良好（2013年7月5日）
	 */
	private Point myPoint;

	/**
	 * インスタンスを生成して初期化して応答する。
	 * 良好（2013年7月5日）
	 */
	public Node(){
		myDepth=0;
		myString=null;
		parentNode = new ArrayList<Node>();
		childNode = new ArrayList<Node>();
		myNum=0;
		myPoint = new Point();
	}

	/**
	 * 自分の深さを束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setMyDepth(int aDepth){
		myDepth=aDepth;	
	}

	/**
	 * 自分の深さを応答する。
	 * 良好（2013年7月5日）
	 */
	public int getMyDepth(){
		return myDepth;	
	}

	/**
	 * 自分の文字を束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setMyString(String aStr){
		myString = aStr;	
	}

	/**
	 * 自分の文字を応答する。
	 * 良好（2013年7月5日）
	 */
	public String getMyString(){
		return myString;
	}

	/**
	 * 親ノードを束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setParentNode(Node aNode){
			parentNode.add(aNode);
	}

	/**
	 * 親ノードを返す。
	 * 良好（2013年7月5日）
	 */
	public ArrayList<Node> getParentNode(){
		return parentNode;
	}

	/**
	 * 子ノードを束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setChildNode(Node aNode){
		childNode.add(aNode);	
	}

	/**
	 * 子ノードを応答する。
	 * 良好（2013年7月5日）
	 */
	public ArrayList<Node> getChildNode(){
		return childNode;
	}

	/**
	 * 自分の番号を束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setMyNum(int aNum){
			myNum = aNum;	
	}

	/**
	 * 自分の番号を応答する。
	 * 良好（2013年7月5日）
	 */
	public int getMyNum(){
		return myNum;
	}

	/**
	 * 自分の座標を束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setMyPoint(Point aPoint){
		myPoint = aPoint;	
	}

	/**
	 * 自分の座標を応答する。
	 * 良好（2013年7月5日）
	 */
	public Point getMyPoint(){
		return myPoint;
	}
}
