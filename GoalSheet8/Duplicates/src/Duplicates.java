//Clayton Kristiansen
//Goal Sheet 8 "Duplicates"
//01-08-2018
//AP Computer Science P.1

import java.util.*;

public class Duplicates 
{
	static ArrayList<Integer> SortAndRemoveDuplicates(ArrayList<Integer> list)
	{
		Integer[] sortedArray = list.toArray(new Integer[list.size()]);

		Arrays.parallelSort(sortedArray);
		list = new ArrayList<Integer>(Arrays.asList(sortedArray));
		for(int i = 1; i < list.size();)
		{
			if(list.get(i) == list.get(i - 1))
			{
				list.remove(i);
			}
			else
			{
				++i;
			}
		}
		return list;
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(78);
		list.add(3);
		list.add(7);
		list.add(34);
		list.add(8);
		list.add(0);
		list.add(12);
		list.add(7);
		list.add(34);
		list.add(7);
		list.add(1);
		System.out.println("Before: " + list);
		list = SortAndRemoveDuplicates(list);
		System.out.println("After: " + list);
	}

}
