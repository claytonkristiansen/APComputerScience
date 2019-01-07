//Clayton Kristiansen
//Goal Sheet 7 "Elevens"
//12-05-2018
//AP Computer Science P.1

public class Elevens 
{

	public static void main(String[] args) 
	{
		Card card1 = new Card("Ace", "Spades", 13);
		Card card2 = new Card("Ace", "Spades", 13);
		Card card3 = new Card("Three", "Diamonds", 3);
		System.out.println(card1.toString());
		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card3));
		

	}

}
