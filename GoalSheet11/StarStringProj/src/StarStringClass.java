//Clayton Kristiansen
//Goal Sheet 11 "StarString"
//03-15-2019
//AP Computer Science P.1

import java.util.*;

public class StarStringClass 
{
	public static void StarString(int n)
	{
		if(n == 0)
		{
			System.out.print("*");
		}
		else
		{
			StarString(n - 1);
			StarString(n - 1);
		}
	}
	
	public static void main(String[] args) 
	{
		StarString(4);
	}

}
