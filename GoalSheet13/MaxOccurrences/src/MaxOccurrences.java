import java.util.*;

public class MaxOccurrences
{
	public static Entry<Integer, Integer> FindMaxOccurrences(ArrayList<Integer> list)
	{
		Map<Integer, Integer> numberOccurrences = new HashMap<Integer, Integer>();
		for(int i : list)
		{
			if(numberOccurrences.containsKey(i))
			{
				numberOccurrences.put(i, numberOccurrences.get(i) + 1);
			}
			else
			{
				numberOccurrences.put(i, 1);
			}
		}
		Entry<Integer, Integer> mostOccurrences = new Entry<Integer, Integer>(0, 0);
		for(Map.Entry<Integer, Integer> entry : numberOccurrences.entrySet())
		{
			if(entry.getValue() > mostOccurrences.getValue())
			{
				mostOccurrences.setValue(entry.getValue());
				mostOccurrences.setKey(entry.getKey());
			}
		}
		return mostOccurrences;
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(8);
		list.add(8);
		System.out.println("The mode " + FindMaxOccurrences(list).getKey() + " occurs: " + FindMaxOccurrences(list).getValue() + " times");
	}
}
