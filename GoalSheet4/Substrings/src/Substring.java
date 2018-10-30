//Clayton Kristiansen
//Goal Sheet 4 "Substring"
//10-26-2018
//AP Computer Science P.1

import java.util.*;

public class Substring 
{
	
	public static void SubString(String string, int substringLength)
	{
		for(int index = 0; index < string.length();)
		{
			if(index + substringLength < string.length())
			{
				System.out.println(string.substring(index, index + substringLength));
				index += substringLength;
			}
			else
			{
;				System.out.println(string.substring(index));
				break;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter string: ");
		String inputString = reader.nextLine();
		System.out.print("Enter substring length: ");
		int inputInt = reader.nextInt();
		SubString(inputString, inputInt);
	}
}
