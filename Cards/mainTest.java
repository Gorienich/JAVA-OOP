package Cards;

public class mainTest {

	public static void main(String[] args) {
		int ind = 1; // index for cards
		Card [] arr = new Card [54];
		int countBlue =0, countRed =0;
		//1 half cards
		for(int i =1; i<=arr.length/2; i++)
			arr[i-1] = new Card(i , "blue");
		
		
		//2 half cards
		for(int i =arr.length/2+1; i<=arr.length; i++)
			arr[i-1] = new Card(ind++, "red");
		
		Playing_Cards AllCards = new Playing_Cards( arr, "ProPlastic");
		System.out.println(AllCards.toString());
	
		AllCards.getCounts();
		
		
	}

}
