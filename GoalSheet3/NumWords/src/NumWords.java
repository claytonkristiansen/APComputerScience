//Clayton Kristiansen
//Goal Sheet 3 "Paper Analysis"
//9-26-2018
//AP Computer Science P.3

import java.io.*; //For File
import java.util.*; //For Scanner



public class NumWords 
{
	public static int WordCount(File input)
			throws FileNotFoundException
	{
		int count = 0;
		Scanner reader = new Scanner(input);
		while(reader.hasNext())
		{
			reader.next();
			count++;
		}
		return count;
	}
	public static int LineCount(File input)
			throws FileNotFoundException
	{
		int count = 0;
		Scanner reader = new Scanner(input);
		while(reader.hasNext())
		{
			reader.nextLine();
			count++;
		}
		return count;
	}
	public static int CharacterCount(File input)
			throws FileNotFoundException
	{
		int count = 0;
		Scanner reader = new Scanner(input);
		while(reader.hasNext())
		{
			String word = reader.next();
			count += word.length();
		}
		return count;
	}	
	
	public static void main(String[] args) 
	throws FileNotFoundException
	{
		//Scanner reader;
		//reader = new Scanner(new File("Assets/Paper.txt"));
		//System.out.println("length returns: " + paper.length());
		System.out.println("Number of words: " + WordCount(new File("Assets/Paper.txt")));
		System.out.println("Number of lines: " + LineCount(new File("Assets/Paper.txt")));
		System.out.println("Number of characters: " + CharacterCount(new File("Assets/Paper.txt")));
		
	}
	
}
