package Forest;

/**
 *Forestのコントローラー
 */

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.event.MouseInputAdapter;

public class ForestController extends mvc.Controller implements ActionListener{
    /**
     *情報を握っているModelのインスタンスを束縛する
     *未定（2013年07月05日）
     */
    private ForestModel forestModel;
    /**
     *描画を司るViewのインスタンスを束縛する
     *未定（2013年07月05日）
     */
    private ForestView forestView;
    /**
     *ForestModelとForestViewを代入してやる
     *コンストラクタ
     *未定（2013年07月05日）
     */
    public ForestController(){
    
    }
    /**
     *オーバーロード
     *未定（2013年07月05日）
     */
    public ForestController(ForestModel aForestModel){
	
    }
    /**
     *オーバーロード
     *未定（2013年07月05日）
     */
    public ForestController(ForestModel aForestModel,ForestView aForestView){
	
    }
    /**
     *アクションが発生すると呼び出されます。
     *未定（2013年07月05日）
     */
    public void actionPerformed(ActionEvent aActionEvent){
	
    }
    /**
     * マウスカーサの形状を移動の形に変化させ、指定されたマウスイベントからマウスカーサの位置を獲得して、
     * インスタンス変数currentに設定すると共に、以前のマウスカーサの位置からの差分を計算する。
     * そして、その差分だけビューに対してスクロールを依頼し、その後にビューの再描画を依頼する。
     * 最後にインスタンス変数previousをインスタンス変数currentに更新する。
     *未定（2013年07月05日）
     */
    public void mouseDragged(MouseEvent aMouseEvent){
	
    }
    /**
     *マウスホイールが回転すると呼び出されます
     *スクロール処理に使う
     *未定（2013年07月05日）
     */
    public void mouseWheelMoved(MouseEvent aMouseEvent){
	
    }
    /**
     *指定されたマウスイベントからマウスカーサの位置を獲得して、モデル座標系でのクリック位置を割り出して標準出力に出力する。
     *未定（2013年07月05日）
     */
    public void mouseClicked(MouseEvent aMouseEvent){
	
    }
}
