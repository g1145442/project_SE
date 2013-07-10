package Forest;

/**
 *ForestのView
 */
import java.awt.Point;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import java.awt.Color;

public class ForestView extends mvc.View{
    /**
     *情報を握っているModelのインスタンスを束縛する
     *未定（2013年07月05日）
     */
    private ForestModel forestModel;
    /**
     *制御を司るControllerのインスタンスを束縛する
     *未定（2013年07月05日）
     */
    private ForestController forestController;
    /**
     * スクロール量としてPointのインスタンスを束縛する。
     * 未定（2013年07月05日）
     */
    private Point offset;
    /**
     *コンストラクタ
     *未定（2013年07月05日）
     */
    public ForestView(ForestModel aModel,ForestController aController){
    	super(aModel,aController);
	
	}
    /**
     *ペイン（パネル）内に描画する内容を書く
     *コンポーネント
     *未定（2013年07月05日）
     */
    public void paintComponent(Graphics aGraphics){
	int width = this.getWidth();
	int height = this.getHeight();
	aGraphics.setColor(Color.white);
	aGraphics.fillRect(0, 0, width, height);	
    }

    /**
     *paintComponentを呼び出す
     *未定（2013年07月05日）
     */
    public void update(){
	this.repaint(0, 0, this.getWidth(), this.getHeight());
	return;
    }
}
