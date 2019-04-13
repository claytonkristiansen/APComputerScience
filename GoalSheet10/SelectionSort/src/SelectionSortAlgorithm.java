//Clayton Kristiansen
//Goal Sheet 10 "SelectionSortAlgorithm"
//03-01-2018
//AP Computer Science P.1

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSortAlgorithm 
{
	public static ArrayList<Integer> SortLargestFirst(ArrayList<Integer> integerArray)
	{
		int arrayLength = integerArray.size();
		//int[] sortedArray = new int[arrayLength];
		
		for(int anchor = arrayLength - 1; anchor > 0; --anchor)
		{
			for(int compare = anchor - 1; compare >= 0; --compare)
			{
				if(integerArray.get(compare) > integerArray.get(anchor))
				{  
					
					int compareVal = integerArray.get(compare);
					int anchorVal = integerArray.get(anchor);
					integerArray.set(compare, anchorVal);
					integerArray.set(anchor, compareVal);
				}
					
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
		System.out.println("Unsorted: " + (myArray));
		System.out.println("Sorted:   " + (SortLargestFirst(myArray)));
	}
}
