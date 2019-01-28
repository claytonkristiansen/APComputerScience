//Clayton Kristiansen
//Goal Sheet 9 "MaxLength"
//01-25-2018
//AP Computer Science P.1

import java.util.*;

public class SetAnalyzer 
{		
	public static int MaxLength(TreeSet<String> mySet)
	{
		if(mySet.size() <= 0)
		{
			return 0;
		}
		String currentString = mySet.first();
		for(String it : mySet)
		{
			if(it.length() > currentString.length())
			{
				currentString = it;
			}
		}
		return currentString.length();
	}
	
	public static void main(String[] args) 
	{
		TreeSet<String> stringSet = new TreeSet<String>();
		stringSet.add("This string is 33 characters long");
		stringSet.add("Hello, my name is Georgio");
		stringSet.add("It'sa me Mario!");
		stringSet.add("Inconcievable                               !");
		stringSet.add("This string is 44 characters in total length");
		stringSet.add("No more jokes I mean it!");
		stringSet.add("Anybody want a peanut?");
		System.out.println(MaxLength(stringSet));
	}

}
