//Clayton Kristiansen
//Goal Sheet 11 "StarString"
//03-15-2019
//AP Computer Science P.1

import java.util.*;

public class StarStringClass 
{
	public static int StarString(int n)
	{
		if(n == 1)
		{
			System.out.print("**");
			return 2;
		}
		
		return StarString(n - 1) + StarString(n - 1);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(StarString(6));
	}

}
