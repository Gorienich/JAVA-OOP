package HomeWork_staticFoo;

public class MyClass {
private int num;
private String name;
private static int count =0; // count all students in school

	public MyClass(int number, String st) {
		this.num = number;
		this.name = st;
	    
		count++;
	}

	public int getNum() {return num;}

	public void setNum(int num) {this.num = num;}

	public String getName() {return name;}

	public void setName(String str) {this.name = str;}

	public String print(String st) {return st;} // ??? what to do?
	//@overwrite
	public String toPrint() {return "name " + name + "\n" + "num " + num;}
	
	public static boolean found() {    // ??? what to do?
		
		return false;
	}
    
	public static void print() {   // print amount of all students
		System.out.println("there is  " + count + ", students in school...");
	}
	
}

