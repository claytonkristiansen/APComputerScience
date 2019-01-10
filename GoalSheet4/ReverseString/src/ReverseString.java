//Clayton Kristiansen
//Goal Sheet 4 "Reverse String"
//10-26-2018
//AP Computer Science P.1

import java.util.*;

public class ReverseString 
{

	public static void PrintReverse(String string)
	{
		int strLength = string.length();
		char[] reverseString = new char[strLength];
		int k = 0;
		for(int i = strLength - 1; i >= 0; i--)
		{
			reverseString[k] = string.charAt(i);
			k++;
		}
		System.out.print("Reversed String: " + String.valueOf(reverseString) + "\n\n");
	}
	public static void main(String[] args) 
	{
		String input = "";
		while(!input.matches("q"))
		{
			Scanner reader = new Scanner(System.in);
			System.out.print("Enter string: ");
			input = reader.nextLine();
			PrintReverse(input);
		}
	}

}
