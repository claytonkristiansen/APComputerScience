//Clayton Kristiansen
//Goal Sheet 7 "ScaleByK"
//12-05-2018
//AP Computer Science P.1

import java.util.*;

public class ScaleByK 
{
	static void scaleByK(ArrayList<Integer> array)
	{
		for(int index = 0; index < array.size();)
		{
			Integer var = array.get(index);
			for(int i = 0; i < var - 1; i++)
			{
				array.add(index, var);
				index++;
			}
			index++;
		}
		System.out.print(array);
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(0);
		array.add(4);
		array.add(7);
		array.add(2);
		array.add(3);
		scaleByK(array);
	}

}
