//Clayton Kristiansen
//Goal Sheet 9 "CountUnique"
//01-25-2018
//AP Computer Science P.1

import java.util.*;

public class MyCollection 
{
	
	public static int CountUnique(ArrayList<Integer> list)
	{
		int numUnique = 0;
		
		TreeSet<Integer> mySet = new TreeSet<Integer>();
		
		for(int it : list)
		{
			mySet.add(it);
		}
		
		numUnique = mySet.size();
		
		return numUnique;
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(6);
		list.add(4);
		list.add(0);
		list.add(9);
		list.add(7);
		list.add(1);
		list.add(9);
		list.add(28);
		list.add(24);
		list.add(4);
		list.add(13);
		list.add(9);
		list.add(15);
		list.add(9);
		list.add(33);
		list.add(19);
		
		System.out.println(CountUnique(list));
	}

}
