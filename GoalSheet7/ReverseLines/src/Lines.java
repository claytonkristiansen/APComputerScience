//Clayton Kristiansen
//Goal Sheet 7 "Lines"
//12-05-2018
//AP Computer Science P.1

import java.util.*;
import java.io.*;

public class Lines 
{
	public static String ReverseLine(String array)
	{
		StringBuilder reverseStringBuilder = new StringBuilder(array);
		for(int i = array.length() - 1, k = 0; i >= 0; i--, k++)
		{
			reverseStringBuilder.setCharAt(k, array.charAt(i));
		}
		return reverseStringBuilder.toString();
	}
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		String result;
		try
		{
			reader = new Scanner(new File("Assets/Input.txt"));
			output = new PrintStream(new File("Assets/Output.txt"));
		}
		catch (FileNotFoundException e) 
		{
	        e.printStackTrace();
	    }
		result = reader.nextLine();
		output.println(ReverseLine(result));
		
	}

}
