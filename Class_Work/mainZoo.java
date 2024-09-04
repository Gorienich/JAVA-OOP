package Class_Work;
import java.util.Scanner;
import java.util.Random;
public class mainZoo {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		// variables for animal		
		String name;
		int id;
		int age;
		Animal [] arr = new Animal [3]; // by the question needed 100. Created 5 places only for check
		
	    // test animal
		Animal lion = new Animal("lion", 10, 1);
		Animal lion2 = new Animal("lion2", 14, 5);
		System.out.println(Animal.getCounter());
		System.out.println(lion.toString());
			
		//insert animals into array
		for(int i =0; i<arr.length; i++)
		{
			System.out.println("enter a name of animal " + (i+1));
			arr[i] = new Animal(in.next(), rnd.nextInt(35)+1, rnd.nextInt(899) + 100);  // name => input     age, id => random
			
		}
		//check count in class Animal
		//System.out.println(Animal.getCounter());
		
		// test class Zoo
		Zoo zoo = new Zoo(arr);
		//System.out.println(zoo.toString());
		
		//add animal
		zoo.addAnimal(lion);
		//System.out.println(zoo.toString());
		//zoo.zooStatus();
		//System.out.println(Animal.getCounter());
		
		//delete animal
		zoo.assertdAnimal(1);
		//zoo.zooStatus();
		//System.out.println(Animal.getCounter());
		
		//check sorting from null
		Animal [] allZoo = zoo.getZoo();
		for(int i=0; i<allZoo.length; i++) 
		{
			if(allZoo[i] == null)
				System.out.println("null");
			else
				System.out.print(allZoo[i].toString());
		}
		//.out.println(Animal.getCounter());
		//zoo.zooStatus();
	}

}
