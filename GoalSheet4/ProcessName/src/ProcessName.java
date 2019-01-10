//Clayton Kristiansen
//Goal Sheet 4 "Process Name"
//10-26-2018
//AP Computer Science P.1

import java.util.*;

public class ProcessName 
{
	public static void PrintReverse(String string)
	{
		int strLength = string.length();
		char[] reverseString = string.toCharArray();
		int spacePlace = 0;
		for(;spacePlace < strLength; spacePlace++)
		{
			if(reverseString[spacePlace] == ' ')
			{
				break;
			}
		}
		
		System.out.print("Your name backwards is: " + string.substring(spacePlace + 1) + ", " + string.substring(0, spacePlace) + "\n\n");
	}
	
	public static void ProcessName(Scanner inputObject)
	{
		System.out.print("Please enter your full name: ");
		String nameString = inputObject.nextLine();
		PrintReverse(nameString);
	}
	
	public static void main(String[] args) 
	{
		ProcessName(new Scanner(System.in));
	}

}
