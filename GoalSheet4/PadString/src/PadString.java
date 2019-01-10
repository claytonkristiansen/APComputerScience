//Clayton Kristiansen
//Goal Sheet 4 "Pad String"
//10-26-2018
//AP Computer Science P.1

import java.util.*;
import java.awt.*;

public class PadString 
{
	public static String StringPad(String string, int padLength)
	{
		String resultString = "";
		if(string.length() <= padLength)
		{
			int strLength = string.length();
			int numTotalSpaces = padLength - strLength;
			int index = 0;
			for(int i = 0; i < numTotalSpaces;)
			{
				resultString = resultString.concat(Character.toString(string.charAt(index)));
				int numSpaces = (((numTotalSpaces - i) / (strLength - 1 - index)));
				if((numTotalSpaces - i) > (numSpaces) * (strLength - 1 - index))
				{
					numSpaces++;
				}
				for(int k = 0; k < numSpaces &&  i < numTotalSpaces; k++)
				{
					resultString = resultString.concat(" ");
					i++;
				}
				index++;
			}
			if(index < strLength)
			{
				resultString = resultString.concat(string.substring(index));
			}
			return resultString;
		}
		else
		{
			System.out.println("Error: pad length must be greater than the length of the string");
			return "";
		}
	}

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("String: ");
		String toProcess = reader.nextLine();
		System.out.print("Pad Length: ");
		int padLength = reader.nextInt();
		System.out.println(StringPad(toProcess, padLength));
		reader.close();
	}

}
