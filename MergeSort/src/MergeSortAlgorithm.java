//Clayton Kristiansen
//Goal Sheet 10 "MergeSort"
//03-01-2018
//AP Computer Science P.1

import java.util.*;

public class MergeSortAlgorithm 
{
	public static LinkedList<String> SplitLinkedList(LinkedList<String> originalList, 
													 LinkedList<String> firstHalfOutput, 
													 LinkedList<String> secondHalfOutput)
	{
		int length = originalList.size();
		int firstHalfLength = length / 2;
		int secondHalfLength = length - firstHalfLength;
		for(int i = 0; i < firstHalfLength; ++i)
		{
			firstHalfOutput.add(originalList.get(i));
		}
		for(int i = firstHalfLength; i < length; ++i)
		{
			secondHalfOutput.add(originalList.get(i));
		}
		
		//System.out.print(firstHalfOutput); System.out.print(secondHalfOutput + "\n");
		
		return originalList;
	} 
	
	public static LinkedList<String> MergeLinkedLists(LinkedList<String> first, 
													  LinkedList<String> second)
	{
		LinkedList<String> result = new LinkedList<String>();
		for(int k = first.size() - 1; k >= 0; --k)
		{
			for(int i = second.size() - 1; i >= 0 && k >=0;) //THEN CHECK FOR SIZE > 0 HERE
			{
				if(first.get(k).toLowerCase().charAt(0) > second.get(i).toLowerCase().charAt(0)) //CAN TOTALLY USE GET LAST YOU IDIOT --Future Clayton
				{
					result.add(0, first.get(k));
					first.remove(k);
					--k;
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
			result.add(0, first.getLast());
			first.removeLast();
		}
		while(second.size() > 0)
		{
			result.add(0, second.getLast());
			second.removeLast();
		}
		
		
		return result;
	}
	
	
	public static LinkedList<String> MergeSortString(LinkedList<String> StringArray)
	{
		int length = StringArray.size();
//		if(length == 2)
//		{
//			if(StringArray.get(0) > StringArray.get(1))
//			{
//				char tempInt = StringArray.get(0);
//				StringArray.set(0, StringArray.get(1));
//				StringArray.set(1, tempInt);
//			
//			}
//			
//			return StringArray;
//		}
		
		
		if(length >= 2)
		{
			LinkedList<String> firstArray = new LinkedList<String>();
			LinkedList<String> secondArray = new LinkedList<String>();
			SplitLinkedList(StringArray, firstArray, secondArray);
			//System.out.print(firstArray); System.out.print(secondArray + "\n");
			return MergeLinkedLists(MergeSortString(firstArray), (MergeSortString(secondArray)));
		}
		else
		{
			System.out.print(StringArray + "\n");
			return StringArray;
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		LinkedList<String> Strings = new LinkedList<String>();
		Strings.add("Capitalism");
		Strings.add("goats");
		Strings.add("treachery");
		Strings.add("Pineapple");
		Strings.add("Apple");
		Strings.add("bunker");
		Strings.add("Ryzan");
		Strings.add("I want to eat some chicken");
		Strings.add("Doughnuts are food that makes me feel good");
		Strings.add("Carrots are food that makes me feel bad");
		Strings.add("Why do people have to bruch their teeth? Shouldn't evolution have solved that problem?");
		Strings.add("I'll just wander around and help folks out!");
		
		System.out.println(Strings);
		System.out.println(MergeSortString(Strings));
	}

}
