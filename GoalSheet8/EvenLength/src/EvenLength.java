//Clayton Kristiansen
//Goal Sheet 8 "EvenLength"
//01-10-2018
//AP Computer Science P.1

import java.util.*;

public class EvenLength 
{
	static void RemoveEvenLength(Set<String> set)
	{
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			if(it.next().length() % 2 == 0)
			{
				it.remove();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Even");
		set.add("Odd");
		set.add("Evenerue");
		set.add("Oddests");
		System.out.println(set);
		RemoveEvenLength(set);
		System.out.println(set);
	}

}
