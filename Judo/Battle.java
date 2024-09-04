package Judo;

public class Battle {
private Judai wo1;
private Judai wo2;
private Date bDate;
private int idWin;


//ctor no validation
public Battle(Judai wo1, Judai wo2, Date date, int idWin) {
	this.wo1 = new Judai(wo1);
	this.wo2 = new Judai(wo2);
	this.bDate = new Date(date);
	this.idWin = idWin;
}

public int getIdWin() {
	return this.idWin;
}
public Date getDate() {
	return this.bDate;
}
}
