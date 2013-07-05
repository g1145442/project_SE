/**
 *StringViewのController
 */
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseEvent;

public class StringController extends MouseListener{
    /**
     *文字描画に必要なStringViewのインスタンスを束縛する
     *未定（2013年07月05日）
     */
    private StringView stringView;
    /**
     *前の座標位置を記憶しておく
     *未定（2013年07月05日)
     */
    private Point previous;
    /**
     *今の座標位置を記憶しておく
     *未定（2013年07月05日)
     */
    private Point current;
    /**
     *コンストラクタ
     *未定（2013年07月05日)
     */
    public StringController(){
	super();
    }
    /**
     *引数によって渡されたStringViewのコントローラーを生成する。
     *未定（2013年07月05日)
     */
    public StringController(StringView aStringView){
	stringView = aStringView;
    }
    /**
     *コンポーネント上でマウスボタンが離されると呼び出されます。
     *何もしない
     *未定（2013年07月05日)
     */
    public void mouseReleased(MouseEvent aMouseEvent){
	return;
    }
    /**
     *何もしない
     *未定（2013年07月05日)
     */
    public void mousePressed(MouseEvent aMouseEvent){
	
    }
    /**
     *コンポーネントからマウスが出ると呼び出されます。
     *何もしない
     *未定（2013年07月05日)
     */
    public void mouseExited(MouseEvent aMouseEvent){
	return;
    }
    /**
     *コンポーネントにマウスが入ると呼び出されます。
     *何もしない
     *未定（2013年07月05日)
     */
    public void mouseEntered(MouseEvent aMouseEvent){
	return;
    }
    /**
     *コンポーネント上でマウスボタンをクリック (押してから離す) したときに呼び出されます。
     *クリックされた時にその文字をコンソールに出力する
     *未定（2013年07月05日)
     */
    public void mouseClicked(MouseEvent aMouseEvent){
	return;
    }
}