package Class_Work;

import carCenter.Car;

/*
 * max count of animals in zoo => 100 animals
 * 
 * methodology:
 * toString() => show all animals in zoo
 * addAnimal() => collect animal to zoo
 * assertAnimal() => delete animal from zoo by knowing animal id, correct array and replace null space
 * zooStatus() => show number of created animals in zoo and empty places
 */
public class Zoo {
private Animal [] animals;  //  in case we need  array of 100 animals
private int lastposition;   //  save index


//ctor
public Zoo(Animal [] arr) { // without protection of null or checking length array

	this.animals = new Animal[20]; 
	this.lastposition =0;
	//this.someAnimal = new Animal(arr[0]);
		// insert animals in zoo 
		for(int i =0; i<arr.length; i++)
			if(arr[i] != null)
			animals[lastposition++] = new Animal(arr[i]);  
}

//return all zoo
public Animal[] getZoo() {
	return animals;
}

//in: Animal
//foo: insert animal into array of zoo if it has empty place
public void addAnimal(Animal other) { 
	if(lastposition < animals.length)
		animals[lastposition++] = new Animal(other);
	else
		System.out.println("zoo is full");	
}

//in: id of Animal
//foo: remove animal from array sort array by obj
public  void assertdAnimal(int id) {	
	boolean check = false;

	// find animal by id and remove from array
	for(int i=0; i<this.animals.length; i++)
		if(this.animals[i] != null && this.animals[i].getId() == id)
		{
			this.animals[i] = null;
			nullClear();   // callback to remove null in the end of array
			check = true;		
		}
	// can't find the car				
	if(!check)
		System.out.println("can't find such an animal in zoo");
	
}

//helper to remove null to the end of array 
private void nullClear() {
	 Animal temp = null;
	 boolean flag = true;
	 
	 for(int i=0; i<this.animals.length; i++)
	 {
		 // find null
		 if(animals[i] == null)
		 {
			 //search for the object 
			 for(int j=i+1; j<this.animals.length && flag; j++)
			 {
				 if(animals[j] != null && animals[j] != temp)
				 {
					 animals[i] = animals[j];
					 temp = animals[j];
					 flag = false;	// stop checking				 
				 }
			 }
		 }
	 }
	 	// correct array place after remove car and animal counter
	 	lastposition--; 
	 	Animal.setCounter();
}

//overwriting
//out: zoo status => how many animals it has and how many places empty
public void zooStatus() {
	System.out.println("zoo has: " + (lastposition) + ", animals and " + (animals.length-lastposition) + " empty places");
}

// out: string with all fields of animals in zoo
public  String toString() {
    String st = "";
	for(int i=0; i<lastposition; i++)
			st += animals[i].toString();
	return st;

}
}
