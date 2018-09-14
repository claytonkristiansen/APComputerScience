
//Clayton Kristiansen
//Goal Sheet 1 "There was an old lady who swallowed a fly"
//9-14-2018
//AP Computer Science P.3


public class Fly 
{	

	public static void V1(String object) //There was an old lady who swallowed a fly, also repeats often
	{
		System.out.print("\nThere was an old lady who swallowed a " + object);
	}
	public static void SecondLine() //Second line of the poem, repeated often
	{
		System.out.print("\nI don't know why she swallowed a fly perhaps she'll die!");
	}
	public static void SheSwallowed(String object1, String object2) //Function to be overloaded
	{
		System.out.print("\nShe swallowed the " + object1 + " to catch the " + object2);
	}
	public static void SheSwallowed(String object1, String object2, String object3) //First overloaded function
	{
		System.out.print("\nShe swallowed the " + object1 + " to catch the " + object2 + ",");
		System.out.print("\nShe swallowed the " + object2 + " to catch the " + object3);
	}
	public static void SheSwallowed(String object1, String object2, String object3, String object4) //Second overloaded function
	{
		System.out.print("\nShe swallowed the " + object1 + " to catch the " + object2 + ",");
		System.out.print("\nShe swallowed the " + object2 + " to catch the " + object3 + ",");
		System.out.print("\nShe swallowed the " + object3 + " to catch the " + object4);
	}
	public static void SheSwallowed(String object1, String object2, String object3, String object4, String object5) //Third overloaded function
	{
		System.out.print("\nShe swallowed the " + object1 + " to catch the " + object2 + ",");
		System.out.print("\nShe swallowed the " + object2 + " to catch the " + object3 + ",");
		System.out.print("\nShe swallowed the " + object3 + " to catch the " + object4 + ",");
		System.out.print("\nShe swallowed the " + object4 + " to catch the " + object5);
	}
	public static void SheSwallowed(String object1, String object2, String object3, String object4, String object5, String object6) //Fourth overloaded function
	{
		System.out.print("\nShe swallowed the " + object1 + " to catch the " + object2 + ",");
		System.out.print("\nShe swallowed the " + object2 + " to catch the " + object3 + ",");
		System.out.print("\nShe swallowed the " + object3 + " to catch the " + object4 + ",");
		System.out.print("\nShe swallowed the " + object4 + " to catch the " + object5 + ",");
		System.out.print("\nShe swallowed the " + object5 + " to catch the " + object6);
	}
	public static void ToSwallow(String adjective, String object) //Describes the activity in the preceding line
	{
		System.out.print("\n" + adjective + " to swallow a " + object);
	}
	
	
	
	public static void main(String[] args) 
	{
		V1("fly");
		SecondLine();
		V1("spider");
		System.out.print("\nThat wriggled and wiggled and tiggled inside her");
		SheSwallowed("spider", "fly");
		SecondLine();
		V1("bird");
		ToSwallow("How absurd", "bird");
		SheSwallowed("bird", "spider", "fly");
		SecondLine();
		V1("cat");
		ToSwallow("Fancy that", "cat");
		SheSwallowed("cat", "bird", "spider", "fly");
		SecondLine();
		V1("dog");
		ToSwallow("What a hog", "dog");
		SheSwallowed("dog", "cat", "bird", "spider", "fly");
		SecondLine();
		V1("cow");
		System.out.print("\nI don't know how she swallowed a cow");
		SheSwallowed("cow", "dog", "cat", "bird", "spider", "fly");
		SecondLine();
		V1("horse...");
		System.out.print("\nShe's dead, of course!");
	}

}
