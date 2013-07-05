/**
 *ForestのView
 */
import java.awt.Point;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import java.awt.Color;

public class ForestView extends MVC.View{
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
    public ForestView(){
    }
    /**
     *スクロール量（offset）を考慮してモデル画像（picture）をペイン（パネル）内に描画することである
     *多分何もしない
     *未定（2013年07月05日）
     */
    protected void paintComponent(){
    }

    /**
     *何もしない
     *未定（2013年07月05日）
     */
    public void update(){
    }
}