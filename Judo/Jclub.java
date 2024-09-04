package Judo;
/*
 * no option to change quantity of jades in club
 */
public class Jclub {
private String name;
private final int numW;
private Judai [] JUarr;
private int lastposition;

//Actor 
public Jclub(String name, int num) {
	if(num <= 50)
	   this.numW = num;
	else
		this.numW = 50;
	this.JUarr = new Judai[numW];
	this.name = name;
	this.lastposition =0;
}

//methodology
public String getName() {
	return this.name;
}

//return jade
public Judai getWo(int id) {
	Judai temp = null;
	for(int i=0; i<JUarr.length; i++)
		if(id == JUarr[i].getId())
			temp = JUarr[i];
	return temp;	
}

//out: quantity of jades in club
public int getNum() {
	return this.numW;
}

//out: array of worries weight > w1 && weight < w2
public Judai[] getWoArray(int w2, int w1) {
	int temp =0;
	Judai [] arr = new Judai[numW];
	for(int i=0; i<this.JUarr.length; i++)
		if(JUarr[i].getWeight() < w2 && JUarr[i].getWeight() > w1)
			arr[temp++] = JUarr[i];
	return arr;
}
 
//in: id, name ,weight
//foo: collect other to the club
public void addWo(int id, String name, double weight) {
	//int id, String name, double weight
	if(lastposition < 51)
		JUarr[lastposition++] = new Judai(id, name, weight);
	else
		System.out.println("max limit for session");
}
//overloading
public void addWo(Judai other) {
	JUarr[lastposition++] = new Judai(other);
}


}
