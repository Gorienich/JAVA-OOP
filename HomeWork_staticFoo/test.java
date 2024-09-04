package HomeWork_staticFoo;

public class test {

	public static void main(String[] args) {
	MyClass a = new MyClass(1,"first");
	a.setNum(20);
	a.print("printing");
	MyClass.print();
	System.out.println(a.getName() + " " + a.getNum());
	System.out.println(MyClass.found());
	}

}
