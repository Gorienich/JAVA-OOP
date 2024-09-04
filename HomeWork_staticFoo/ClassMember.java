package HomeWork_staticFoo;

public class ClassMember {
	private String name; 
	private int myAmount;   // counter of disks for each student
	private static int classDiscBox = 0;  // var to collect all disks of students in one library
	public static final int INITIAL_AMOUNTS_OF_DISCS = 3;   // Definite included quantity of disks for each student 'final' can't change his length
	
	public ClassMember(String name)  //  student ctor
	{
	this.name = name;                // create student name
	this.myAmount = INITIAL_AMOUNTS_OF_DISCS;  // include 3 disks to new student
	classDiscBox += INITIAL_AMOUNTS_OF_DISCS;  // upload included disks to class library that means although student didn't upload any disk he have at least 3 disks
	}
	
	public String getName()  
	{
	return this.name;  // output name of student
	}
	public int getStudentAmount()
	{
	return this.myAmount;  // output current amount of disks student uploaded
	}
	
	public static int getClassDiscBox()
	{
	return ClassMember.classDiscBox;      // output all disks in library
	}
	
	public void enterDiscs (int amount)   // amount of disks student want to import to the library
	{
	ClassMember.classDiscBox += amount;   // collect disks to local library
	this.myAmount += amount;              // collect amount to counter of student
	} 
/*
 * classDiscBox created static because we need to collect in local library disks from each student
 */
}
