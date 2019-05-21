//Clayton Kristiansen
//Goal Sheet 14 "Levenshtein Distance"
//05-21-2019
//AP Computer Science P.1

import java.util.*;

public class MergeSort 
{
	public static ArrayList<String> SplitLinkedList(ArrayList<String> originalList, 
			 ArrayList<String> firstHalfOutput, 
			 ArrayList<String> secondHalfOutput)
	{
		int length = originalList.size();
		int firstHalfLength = length / 2;
		int secondHalfLength = length - firstHalfLength;
		for(int i = 0; i < firstHalfLength; ++i)
		{
			firstHalfOutput.add(originalList.get(i));
			System.out.print("1: ");
			System.out.println(i);
		}
		for(int i = firstHalfLength; i < length; ++i)
		{
			secondHalfOutput.add(originalList.get(i));
			System.out.print("2: ");
			System.out.println(i);
		}

		//System.out.print(firstHalfOutput); System.out.print(secondHalfOutput + "\n");

		return originalList;
	} 

	public static ArrayList<String> MergeLinkedLists(ArrayList<String> first, 
			  ArrayList<String> second)
	{
		ArrayList<String> result = new ArrayList<String>();
		for(int k = first.size() - 1; k >= 0; --k)
		{
			for(int i = second.size() - 1; i >= 0 && k >=0;) //THEN CHECK FOR SIZE > 0 HERE
			{
				if(first.get(k).length() > second.get(i).length()) //CAN TOTALLY USE GET LAST YOU IDIOT --Future Clayton
				{
					result.add(0, first.get(k));
					first.remove(k);
					--k;
					System.out.println(k);
				}
				else
				{
					result.add(0, second.get(i));
					second.remove(i);
					--i;
				}
			}
		}
		while(first.size() > 0)
		{
			result.add(0, first.get(first.size() - 1));
			first.remove(first.size() - 1);
		}
		while(second.size() > 0)
		{
			result.add(0, second.get(second.size() - 1));	
			second.remove(second.size() - 1);
		}
		return result;
	}


	public static ArrayList<String> MergeSortString(ArrayList<String> StringArray)
	{
		int length = StringArray.size();


		if(length >= 2)
		{
			ArrayList<String> firstArray = new ArrayList<String>();
			ArrayList<String> secondArray = new ArrayList<String>();
			SplitLinkedList(StringArray, firstArray, secondArray);
			//System.out.print(firstArray); System.out.print(secondArray + "\n");
			return MergeLinkedLists(MergeSortString(firstArray), (MergeSortString(secondArray)));
		}
		else
		{
			//System.out.print(StringArray + "\n");
			return StringArray;
		}
	}
}
