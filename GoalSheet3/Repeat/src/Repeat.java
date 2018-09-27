//Clayton Kristiansen
//Goal Sheet 3 "Roman Numerals"
//9-26-2018
//AP Computer Science P.3

import java.util.*;


public class Repeat 
{
	
	public static void repl(String string, int numberOfRepititions)
	{
		for(int i = 0; i < numberOfRepititions; i++)
		{
			System.out.print(string);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String stringInput = reader.nextLine();
		System.out.print("Enter the number of repititions: ");
		int repititionsInput = reader.nextInt();
		repl(stringInput, repititionsInput);
	}
}
