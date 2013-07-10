package Forest;

/**
 *文字列表示のView
 */
import java.awt.Point;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
     *Nodeから受け取った座標位置を記憶しておくための変数
     *未定(2013年7月10日)
     */
    private Point point;
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
     *Pointのセッター
     *未定(2013年7月5日)
     */
    public void setPoint(Point aPoint){
	point = aPoint;
    }
    /**
     *Pointのゲッター
     *未定(2013年7月5日)
     */
    public Point getPoint(){
	return point;
    }
    /**
     *ForestModelから受け取ったNodeをフィールドのNodeに記憶しておく
     *未定(2013年7月5日)
     */
    public StringView(Node aNode){
	this.setNode(aNode);
	
    }
    /**
     *Nodeの位置情報(x,y)を受け取り、updateを呼び出し再描画する
     *未定(2013年7月5日)
     */
    public void printString(Point aPoint){
	setPoint(getNode().getMyPoint());
	this.update();
	return;
    }
    /**
     *update、コンストラクタを実行する事で呼ばれる
     *スクロール量（offset）を考慮して、Nodeから渡される文字を表示する
     *未定(2013年7月5日)
     */
    public void paintComponent(Graphics aGraphics){
	Graphics2D aGraphics2D = (Graphics2D)aGraphics;
	int width = getPoint().x;
	int height = getPoint().y;
	String word = getNode().getMyString(); 
	//aGraphics2D.drawRect()
	aGraphics2D.drawString(word, width, height);
	return;
    }
    /**
     *RepaintメソッドでpaintComponentを呼び出し再描画する
     *未定(2013年7月5日)
     */
    public void update(){
	this.repaint(0,0,this.getWidth(),this.getHeight());
	return;
    }
}
