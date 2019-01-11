//Clayton Kristiansen
//Goal Sheet 8 "IsUnique"
//01-08-2018
//AP Computer Science P.1

import java.util.*;

public class IsUnique 
{
	public static boolean ContainsUnique(Map<String, String> map)
	{
		for(Map.Entry<String, String> it : map.entrySet())
		{
			for(Map.Entry<String, String> it2 : map.entrySet())
			{
				if(it.getKey() != it2.getKey())
				{
					if(it.getValue() == it2.getValue())
					{
						return false;
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Billy", "Joe");
		map.put("Sally", "Joey");
		map.put("Marty", "Suzy");
		map.put("Lucy", "Suzy");
		
		System.out.println("Map: " + map);
		System.out.println("Unique: " + ContainsUnique(map));
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("Billy", "Joe");
		map2.put("Sally", "Joey");
		map2.put("Marty", "Sue");
		map2.put("Lucy", "Suzy");
		
		System.out.println("Map: " + map2);
		System.out.println("Unique: " + ContainsUnique(map2));
	}

}
