package Forest;

/**
 *文字列表示のView
 */
import java.awt.Point;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import java.awt.Color;

public class StringView extends JPanel{
    /**
     *情報を握っているForestModelのインスタンスを束縛する
     *未定(2013年7月5日)
     */
    private ForestModel forestModel;
    /**
     *表示を司るForestViewのインスタンス束縛する
     *未定(2013年7月5日)
     */
    private ForestView forestView;
    /**
     *マウス操作を感知するForestControllerのインスタンス束縛する
     *未定(2013年7月5日)
     */
    private ForestController forestController;
    /**
     *文字の情報をNodeのインスタンスとして束縛する
     *未定(2013年7月5日)
     */
    private Node node;
    /**
     *Nodeのセッター
     *未定(2013年7月5日)
     */
    public void setNode(Node aNode){
	node = aNode;
    }
    /**
     *Nodeのゲッター
     *未定(2013年7月5日)
     */
    public Node getNode(){
	return node;
    }
    /**
     *ForestModelから受け取ったNodeをフィールドのNodeに記憶しておく
     *未定(2013年7月5日)
     */
    public StringView(Node aNode){
		setNode(aNode);
    }
    /**
     *Nodeの位置情報(x,y)を受け取り、updateを呼び出す。
     *未定(2013年7月5日)
     */
    public void printString(Point aPoint){
	return;
    }
    /**
     *updateで呼び出される内容を書く
     *未定(2013年7月5日)
     */
    protected void paintComponent(){
	return;
    }
    /**
     *repaintメソッドでpaintComponentを呼び出し再描画する
     *未定(2013年7月5日)
     */
    public void update(){
	return;
    }
}
