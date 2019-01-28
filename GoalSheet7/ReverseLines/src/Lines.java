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
		StringBuilder reverseStringBuilder = new StringBuilder("");
		int beginIndex = 1;
		int endIndex = array.indexOf('\n', beginIndex);
		for(;endIndex > 0;)
		{
			reverseStringBuilder.insert(0, array.substring(beginIndex, endIndex) + " \n");
			beginIndex = endIndex + 1;
			endIndex = array.indexOf('\n', beginIndex);
		}
		return reverseStringBuilder.toString();
	}
	
	public static String ReverseWords(String array)
	{
		StringBuilder reverseWordsBuilder = new StringBuilder("");
		int beginIndex = 0;
		int endIndex = array.indexOf(' ', beginIndex);
		for(;endIndex < array.length() && beginIndex < array.length();)
		{
			reverseWordsBuilder.insert(0, array.substring(beginIndex, endIndex) + ' ');
			if(array.charAt(endIndex) == '\n')
			{
				reverseWordsBuilder.insert(0, '\n');
			}
			beginIndex = endIndex + 1;
			if(beginIndex + 1 < array.length())
			{
				endIndex = array.indexOf(' ', beginIndex);
				if(array.indexOf('\n', beginIndex) < endIndex || endIndex == -1)
				{
					endIndex = array.indexOf('\n', beginIndex);
					
				}
			}
			
		}
		
		
		return reverseWordsBuilder.toString();
	}
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		PrintStream output = new PrintStream(System.out);
		String result = "";
		try
		{
			reader = new Scanner(new File("Assets/Input.txt"));
			output = new PrintStream(new File("Assets/Output.txt"));
			output.write(0);
		}
		catch (FileNotFoundException e) 
		{
	        e.printStackTrace();
	    }
		
		for(;reader.hasNext();)
		{
			result = result + reader.nextLine() + '\n';
		}
		//output.println(result);
		result = ReverseWords(result);
		//result = ReverseLine(result);
		output.println(result);
		reader.close();
		output.close();
		
	}

}
