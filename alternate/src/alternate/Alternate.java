package alternate;
import java.util.*;

public class Alternate 
{
	public static <T> ArrayList<T> DoAlternate(ArrayList<T> list1, ArrayList<T> list2)
	{
		ArrayList<T> alternateList = new ArrayList<T>();
		int iterator = 0;
		for(; iterator < list1.size() && iterator < list2.size(); iterator++) //Add the alternate values from the lists until the end of one list is reached
		{
			alternateList.add(list1.get(iterator));
			alternateList.add(list2.get(iterator));
		}
		if(iterator < list1.size()) //If the end of list 1 has not been reached
		{
			for(;iterator < list1.size(); iterator++) //Add all the leftover values in list1 to alernateList
			{
				alternateList.add(list1.get(iterator));
			}
		}
		else if(iterator < list2.size()) //If the end of list 2 has not been reached
		{
			for(;iterator < list2.size(); iterator++) //Add all the leftover values in list2 to alernateList
			{
				alternateList.add(list2.get(iterator));
			}
		}
		
		return alternateList;
	}
	public static void main(String[] args) 
	{
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("Computer");
		list1.add("Monitor");
		list1.add("Keyboard");
		list1.add("Mouse");
		list1.add("Microsoft");
		list1.add("Laptop");
		
		list2.add("Vivek");
		list2.add("Miyoshi");
		list2.add("Jake");
		list2.add("Quinn");
		list2.add("Dianna");
		list2.add("Clayton");
		list2.add("Nicky");
		list2.add("Ashwin");
		list2.add("Ben");
		list2.add("Zack");
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(DoAlternate(list1, list2));
	}

}
