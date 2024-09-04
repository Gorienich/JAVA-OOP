package Busses;

public class BusLine extends Line{
private int numPass;

public BusLine (int Lnum,String first, String last, int passengers) {
	super(Lnum,first,last);
	this.numPass = passengers;
}
public int getNumPass() {
	return this.numPass;
}

/*
 * in question1 was private toString incorrect, because needed visibility to all classes
*/
public String toString() {
	return "NumLine# " + this.LineNum + " From: " + this.firstStation + 
			" To: " + this.lastStation + " Max num Passengers: " + this.numPass;
}
}
