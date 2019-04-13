//Clayton Kristiansen
//Goal Sheet 12 "DictionaryBinarySearch"
//03-29-2019
//AP Computer Science P.1

import java.util.*;
import java.io.*;

public class Dictionary implements BinarySearch
{
	
	public static ArrayList<String> FileToArrayList(Scanner fileReader)
	{
		ArrayList<String> fileStringArray = new ArrayList<String>();
		while(fileReader.hasNext())
		{
			fileStringArray.add(fileReader.next());
		}
		
		return fileStringArray;
	}
	
	public static int SearchStringArray(String target, ArrayList<String> stringArray)
	{
		int left = 0;
		int right = stringArray.size();
		int midpoint = right / 2;
		for(;midpoint >= left && midpoint <= right;)
		{
			if(target.compareTo(stringArray.get(midpoint)) == 0)
			{
				return midpoint;
			}
			else if(target.compareTo(stringArray.get(midpoint)) > 0)
			{
				left = midpoint;
				midpoint = midpoint + ((right - midpoint) / 2);
			}
			else if(target.compareTo(stringArray.get(midpoint)) < 0)
			{
			
				right = midpoint;
				midpoint = left + ((midpoint - left) / 2);
			
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		Scanner userReader = new Scanner(System.in);
		PrintStream writer = new PrintStream(System.out);
		try
		{
			File inputFile = new File("Assets/dictionary.txt");
			Scanner reader = new Scanner(inputFile);
			System.out.print("First word: ");
			String searchWord1 = userReader.next();
			System.out.print("Seond word: ");
			String searchWord2 = userReader.next();
			ArrayList<String> stringArray = FileToArrayList(reader);
			int searchWordIndex1 = SearchStringArray(searchWord1, stringArray);
			int searchWordIndex2 = SearchStringArray(searchWord2, stringArray);
			System.out.println("There are " + 
					(searchWordIndex2 - searchWordIndex1 - 1) +
					" words between " + searchWord1 + " and " + searchWord2
					);
			reader.close();
			writer.close();
		}
		catch (FileNotFoundException e) 
		{
	        e.printStackTrace();
	    }
		
		userReader.close();
		
		System.out.println("Done");
	}
}
