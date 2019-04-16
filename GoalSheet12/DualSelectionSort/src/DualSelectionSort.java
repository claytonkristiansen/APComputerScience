//Clayton Kristiansen
//Goal Sheet 12 "DualSelectionSort"
//03-29-2019
//AP Computer Science P.1

import java.util.*;

public class DualSelectionSort 
{
	
	public static <T extends Comparable<T>> ArrayList<T> DualSort(ArrayList<T> list)
	{
		int size = list.size();
		for(int left = 0, right = size - 1; left < size; left++, right--)
		{
			for(int compare = left; compare <= right; compare++)
			{
				if(list.get(compare).compareTo(list.get(left)) < 0)
				{
					T leftValue = list.get(left);
					list.set(left, list.get(compare));
					list.set(compare, leftValue);
				}
				else if(list.get(compare).compareTo(list.get(right)) > 0)
				{
					T rightValue = list.get(right);
					list.set(right, list.get(compare));
					list.set(compare, rightValue);
				}
			}
			System.out.print("*");
		}
		return list;
	}
	
	public static ArrayList<Integer> SortLargestFirst(ArrayList<Integer> integerArray)
	{
		int arrayLength = integerArray.size();
		//int[] sortedArray = new int[arrayLength];
		
		for(int anchor = 0; anchor < arrayLength; ++anchor)
		{
			for(int compare = anchor + 1; compare < arrayLength; ++compare)
			{
				if(integerArray.get(compare) < integerArray.get(anchor))
				{  
					
					int compareVal = integerArray.get(compare);
					int anchorVal = integerArray.get(anchor);
					integerArray.set(compare, anchorVal);
					integerArray.set(anchor, compareVal);
				}
				System.out.print("*");
			}
		}
		
		return integerArray;
	}

	public static void main(String[] args) 
	{
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		myArray.add(87);
		myArray.add(3241);
		myArray.add(5);
		myArray.add(88);
		myArray.add(1234);
		myArray.add(76);
		myArray.add(13);
		myArray.add(68);
		myArray.add(88);
		myArray.add(88);
		myArray.add(88);
		myArray.add(88);
		myArray.add(174);
		myArray.add(54);
		myArray.add(32);
		myArray.add(565);
		myArray.add(31);
		myArray.add(1);
		myArray.add(57);
		myArray.add(94);
		myArray.add(9875);
		myArray.add(67);
		myArray.add(98);
		myArray.add(345);
		myArray.add(90);
		myArray.add(322);
		myArray.add(54);
		myArray.add(3);
		System.out.println(myArray);
		System.out.println(DualSort(myArray));
		System.out.println(SortLargestFirst(myArray));
		
		Collections.sort(myArray);
	}

}
