
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
		int index = 0;
		int left = 0;
		int right = stringArray.size();
		int midpoint = right / 2;
		for(;midpoint != left && midpoint != right;)
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
				midpoint = midpoint - ((midpoint - left) / 2);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		PrintStream writer = new PrintStream(System.out);
		try
		{
			File inputFile = new File("Assets/dictionary.txt");
			File outputFile = new File("Assets/output.txt");
			reader = new Scanner(inputFile);
			writer = new PrintStream(outputFile);
			String searchWord = "impregnation";
			System.out.println("Index of " + searchWord + " is: " + SearchStringArray(searchWord, FileToArrayList(reader)));
			reader.close();
			writer.close();
		}
		catch (FileNotFoundException e) 
		{
	        e.printStackTrace();
	    }
		
		
		
		System.out.println("Done");
	}
}
