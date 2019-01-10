//Clayton Kristiansen
//Goal Sheet 8 "RemoveInRange"
//01-08-2018
//AP Computer Science P.1

import java.util.*;

public class MyStringEditor 
{
	public static <T> LinkedList<T> RemoveInRange(LinkedList<T> list, T element, int startIndex, int endIndex)
	{
		for(int i = startIndex; i <= endIndex; ) 
		{
			if(list.get(i) == element)
			{
				list.remove(i);
				--endIndex;
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
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(1);
		list.add(2);
		System.out.println(list);
		RemoveInRange(list, 2, 2, 4);
		System.out.println(list);
	}
}
