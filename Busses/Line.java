package Busses;

public class Line {
	protected int LineNum;
	protected String firstStation;
	protected String lastStation;

	public Line(int lineNum, String fstat, String lstat) {
		this.LineNum = LineNum;
		this.firstStation = fstat;
		this.lastStation = lstat;
		
	}
	
	public int getLineNum() {
		return this.LineNum;
	}
	
	public String getFirst() {
		return this.firstStation;
	}
	
	public String getLast() {
		return this.lastStation;
	}
}
