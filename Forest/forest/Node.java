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
	
	}

	/**
	 * 自分の深さを束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setMyDepth(int aDepth){
		
	}

	/**
	 * 自分の深さを応答する。
	 * 良好（2013年7月5日）
	 */
	public int getMyDepth(){
		return 0;	
	}

	/**
	 * 自分の文字を束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setMyString(String aStr){
		
	}

	/**
	 * 自分の文字を応答する。
	 * 良好（2013年7月5日）
	 */
	public String getMyString(){
		return null;
	}

	/**
	 * 親ノードを束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setParentNode(ArrayList<Node> aList){
	
	}

	/**
	 * 親ノードを返す。
	 * 良好（2013年7月5日）
	 */
	public ArrayList<Node> getParentNode(){
		return null;
	}

	/**
	 * 子ノードを束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setChildNode(ArrayList<Node> aList){
	
	}

	/**
	 * 子ノードを応答する。
	 * 良好（2013年7月5日）
	 */
	public ArrayList<Node> getChildNode(){
		return null;
	}

	/**
	 * 自分の番号を束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setMyNum(int aNum){
			
	}

	/**
	 * 自分の番号を応答する。
	 * 良好（2013年7月5日）
	 */
	public int getMyNum(){
		return 0;
	}

	/**
	 * 自分の座標を束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setMyPoint(Point aPoint){
	
	}

	/**
	 * 自分の座標を応答する。
	 * 良好（2013年7月5日）
	 */
	public Point getMyPoint(){
		return null;
	}
}
