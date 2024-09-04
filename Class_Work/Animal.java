package Class_Work;
/**
 *  function toString() => all fields in class
 *  function getCount() => all created animals
 * 
 */
public class Animal {
private int id;
private String name;
private int age;
private static int counter =0; // count all created anmals

//ctor by fields
public Animal(String name, int age, int id) {
	this.name = name;
	this.age = age;
	this.id = id;
	counter++;
}

//@ overloading ctor by object
public Animal(Animal any) {
	this.name = any.name;
	this.age = any.age;
	this.id = any.id;
	counter++;
}
// methodology
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
// return all created animals
public static int getCounter() {
	return counter;
}

public static void setCounter() {
	Animal.counter--;
}

//@overWriting
//out: all fields
public  String toString() {
	return "name: " + this.name + "\n" + "age: " + this.age + "\n" + "id: " + this.id + "\n";
}


}
