//Clayton Kristiansen
//Goal Sheet 4 "Stair String"
//10-26-2018
//AP Computer Science P.1

import java.util.*;

public class StairString 
{
	
	public static void StairString(String inputString, int numSubStrings)
	{
		int stringLength = inputString.length();
		int subStringLength = stringLength / numSubStrings;
		if(numSubStrings > stringLength)
		{
			System.out.println("\nToo many substrings");
			return;
		}
		if(subStringLength * numSubStrings < stringLength)
		{
			subStringLength++;
		}
		int k = 0;
		for(int i = 0; i < numSubStrings; i++)
		{
			subStringLength = (stringLength - k) / (numSubStrings - i);
			if(subStringLength * (numSubStrings - i) < (stringLength - k))
			{
				subStringLength++;
			}
			for(int c = 0; c < k; c++)
			{
				System.out.print(" ");
			}
			if(k + subStringLength > stringLength)
			{
				System.out.println(inputString.substring(k));
				break;
			}
			System.out.println(inputString.substring(k, k + subStringLength));
			k += subStringLength;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Input a string: ");
		String inputString = reader.nextLine();
		System.out.print("Input the number of substrings: ");
		int inputInt = reader.nextInt();
		StairString(inputString, inputInt);
	}

}
