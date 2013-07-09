package Forest;

/**
 * 一時的にBranchの内容を束縛するクラス
 * 良好（2013年7月5日）
 */

class SmallBranch{

	/**
	 * 親のノード番号を束縛。
	 * 良好（2013年7月5日）
	 */
	private int parentNum;

	/**
	 * 子のノード番号を束縛。
	 * 良好（2013年7月5日）
	 */
	private int childNum;

	/**
	 * インスタンスを生成して初期化して応答する。
	 * 良好（2013年7月5日）
	 */
	public SmallBranch(int pNum,int cNum){
		parentNum = pNum;
		childNum = cNum;	
	}


	/**
	 * 親のノード番号を束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setParentNum(int aNum){
		parentNum = aNum;	
	}

	/**
	 * 親のノード番号を応答する。
	 * 良好（2013年7月5日）
	 */
	public int getParentNum(){
		return parentNum;
	}

	/**
	 * 子のノード番号を束縛する。
	 * 良好（2013年7月5日）
	 */
	public void setChildNum(int aNum){
		childNum = aNum;
	}
	
	/**
	 * 子のノード番号を応答する。
	 * 良好（2013年7月5日）
	 */
	public int getChildNum(){
		return childNum;
	}

}



