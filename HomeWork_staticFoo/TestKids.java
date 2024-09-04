package HomeWork_staticFoo;
public class TestKids {

	public static void main(String[] args) {

/* if we want to know place of each child we must show output before creating new child
 * numChild is static field so each time we build new child numChild++ it is general field of each child
 */
		
		
Kids tal = new Kids("Tal cohen",16, 'f');
System.out.println(tal.toString()  + "  place:  " + tal.getNumChild());  
 
Kids gil = new Kids("Gil cohen",13, 'm');
System.out.println(gil.toString()  + "  place:  " + gil.getNumChild());

Kids dina = new Kids("Dia cohen",11, 'f');
System.out.println(dina.toString() + "  place:  " + dina.getNumChild() + "\n");

System.out.println("total count of childrns of cohen's family: " + Kids.getNumChild());    // show all children's
	}

}
