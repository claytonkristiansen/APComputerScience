import java.util.*;



public class MergeSortAlgorithm 
{
	public static LinkedList<Character> SplitLinkedList(LinkedList<Character> originalList, 
														LinkedList<Character> firstHalfOutput, 
														LinkedList<Character> secondHalfOutput)
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
	
	public static LinkedList<Character> MergeLinkedLists(LinkedList<Character> first, LinkedList<Character> second)
	{
		LinkedList<Character> result = new LinkedList<Character>();
		for(int k = first.size() - 1; k >= 0; --k)
		{
			for(int i = second.size() - 1; i >= 0 && k >=0;) //THEN CHECK FOR SIZE > 0 HERE
			{
				if(first.get(k) > second.get(i)) //CAN TOTALLY USE GET LAST YOU IDIOT --Future Clayton
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
	
	
	public static LinkedList<Character> MergeSortString(LinkedList<Character> charArray)
	{
		int length = charArray.size();
//		if(length == 2)
//		{
//			if(charArray.get(0) > charArray.get(1))
//			{
//				char tempInt = charArray.get(0);
//				charArray.set(0, charArray.get(1));
//				charArray.set(1, tempInt);
//			
//			}
//			
//			return charArray;
//		}
		
		
		if(length >= 2)
		{
			LinkedList<Character> firstArray = new LinkedList<Character>();
			LinkedList<Character> secondArray = new LinkedList<Character>();
			SplitLinkedList(charArray, firstArray, secondArray);
			//System.out.print(firstArray); System.out.print(secondArray + "\n");
			return MergeLinkedLists(MergeSortString(firstArray), (MergeSortString(secondArray)));
		}
		else
		{
			System.out.print(charArray + "\n");
			return charArray;
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		LinkedList<Character> characters = new LinkedList<Character>();
		characters.add('c');
		characters.add('g');
		characters.add('t');
		characters.add('p');
		characters.add('a');
		characters.add('b');
		characters.add('r');
		System.out.println(characters);
		System.out.println(MergeSortString(characters));
	}

}
