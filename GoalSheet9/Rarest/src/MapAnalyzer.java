//Clayton Kristiansen
//Goal Sheet 9 "Rarest"
//01-25-2018
//AP Computer Science P.1

import java.util.*;
import java.util.Map.Entry;

public class MapAnalyzer 
{
	public static int Rarest(HashMap<String, Integer> myMap)
	{
		HashMap<Integer, Integer> timesAppearMap = new HashMap<Integer, Integer>();
		Iterator<Entry<String, Integer>> it = myMap.entrySet().iterator();
		while(it.hasNext())
		{
			int value = it.next().getValue();
			if(!timesAppearMap.containsKey(value))
			{
				timesAppearMap.put(value, 1);
			}
			else
			{
				timesAppearMap.replace(value, timesAppearMap.get(value) + 1);
			}
		}
		Iterator<Entry<Integer, Integer>> it2 = timesAppearMap.entrySet().iterator();
		Entry<Integer, Integer> leastEntry = it2.next();
		while(it2.hasNext())
		{
			Entry<Integer, Integer> thisEntry = it2.next();
			if(thisEntry.getValue() < leastEntry.getValue())
			{
				leastEntry = thisEntry;
			}
		}
		return leastEntry.getKey();
	}
	
	public static void main(String[] args) 
	{
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("One", 1);
		myMap.put("One1", 1);
		myMap.put("One2", 1);
		myMap.put("One3", 1);
		myMap.put("Two", 2);
		myMap.put("Two1", 2);
		myMap.put("Three", 3);
		myMap.put("Three1", 3);
		myMap.put("Three2", 3);
		myMap.put("Three3", 3);
		myMap.put("Three4", 3);
		myMap.put("Three5", 3);
		myMap.put("Three6", 3);
		myMap.put("Three7", 3);
		myMap.put("Four", 4);
		myMap.put("Four1", 4);
		myMap.put("Four2", 4);
		System.out.println("The value that appears the least is " + Rarest(myMap));
	}
}
