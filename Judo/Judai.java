package Judo;

public class Judai {
private int id;
private String woName;
private double weight;
private int [] win;

//ctor
public Judai(int id, String name, double weight) {
	this.win = new int [20];
	for(int i =0; i<win.length; i++) 
		win[i] = 0;
	
	this.id = id;
	this.woName = name;
	this.weight = weight;
		
}
// copy ctor
public Judai(Judai ather) {
	this.win = new int [20];
	for(int i =0; i<win.length; i++) 
		win[i] = 0;
	
	this.id = ather.id;
	this.woName = ather.woName;
	this.weight = ather.weight;
}

//methodology
public int getId() {
	return id;
}
public String getWoName() {
	return woName;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}

// ret: array of all wins in all sessions
public int[] getWin() {
	int [] arr = new int[20];
	for(int i=0; i<arr.length; i++)
		arr[i] = this.win[i];
	return arr;
}

// in: number of sission
// foo: count win in array by index
public void moreWin(int session) {
	win[session-1]++;
}

//overwriting
public String toString() {
	return "name: " + this.woName + "\n weight: " + this.weight + "\n id" + 
			this.id + "\n";
}


}
