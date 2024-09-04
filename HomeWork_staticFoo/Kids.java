package HomeWork_staticFoo;

public class Kids {
private String name;
private int age;
private char gender;
private static int numChild = 0;

public Kids(String name,int age, char gender) {
	this.name =name;
	this.age = age;
	numChild++;
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

public String getGender() {
	if(this.gender == 'f')
	return "girl";
	return "boy";
}

public void setGender(char gender) {
	this.gender = gender;
}

public static int getNumChild() {
	return numChild;
}
public String toString() {
	return this.name + " " + getGender() + " " + this.age;
}


}
