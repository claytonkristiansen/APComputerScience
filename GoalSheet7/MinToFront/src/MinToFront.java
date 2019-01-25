//Clayton Kristiansen
//Goal Sheet 7 "MinToFront"
//12-05-2018
//AP Computer Science P.1

import java.util.*;

public class MinToFront 
{
	
	public static ArrayList<Integer> BringMinToFront(ArrayList<Integer> array)
	{
		int storeNum = array.get(0);
		int index = 0;
		for(int i = 0; i < array.size(); i++)
		{
			if(storeNum > array.get(i))
			{
				index = i;
				storeNum = array.get(i);
			}
		}
		array.remove(index);
		array.add(0, storeNum);
		System.out.println(array);
		return array;
	}

	public static void main(String[] args) 
	{
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(5, 3, 7, 1, 0, -100, 8, 9, 5, - -101));
		BringMinToFront(array);
	}

}
