package Forest;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import mvc.Model;

/**
* 木構造そのものを管理するクラス。
*/
class ForestModel extends mvc.Model{

	/**
	 * 樹状整列の木のインスタンスたちを束縛する。
	 * 良好（2013年7月5日）
	 */
	private ArrayList<Node> rootList;

	/**
	 * Nodeに帯する座標たちを束縛する。
	 * 良好（2013年7月5日）
	 */
	private HashMap<Node,Point> pointMap;

	
	/**
	 * インスタンスを生成して初期化して応答する。
	 * 良好（2013年7月5日）
	 */
	public ForestModel(){
		super();
	}
	
	/**
	 * ノードの座標を計算する。
	 * 良好（2013年7月5日）
	 */
	public HashMap<Node,Point> pointCalculate(){
		return null;	
	}
	
	/**
	 * 
	 * 良好（2013年7月5日）
	 */
	public void changed(){
		super.changed();
	}
	
	/**
	 * 座標が変わったので再計算する。
	 * 良好（2013年7月5日）
	 */
	public void changedCalculate(Point point,Node node){
	
	}
	
	/**
	 * 深さ探索を実行する。
	 * 良好（2013年7月5日）
	 */
	public void depthSearch(Node aNode){
		ArrayList<Node> a =aNode.getChildNode();
		for(Node node:a){
			this.depthSearch(node);	
		}
		System.out.println("番号:"+aNode.getMyNum()+",文字:"+aNode.getMyString()+",深さ:"+aNode.getMyDepth());
	}

	/**
	 * rootをインスタンスに束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setRootList(ArrayList<Node> aList){
		rootList = aList;	
	}

	/**
	 * 束縛しているrootの値を返す。
	 * 良好（2013年7月5日）
	 */
	public ArrayList<Node> getRootList(){
		return rootList;
	}
	
	/**
	 * Nodeと座標の対応をインスタンスに束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setPointMap(HashMap<Node,Point> aMap){
		pointMap = aMap;	
	}

	/**
	 * 束縛しているMapの値を返す
	 * 良好（2013年7月5日）
	 */
	public HashMap<Node,Point> getPointMap(){
		return pointMap;
	}
}
