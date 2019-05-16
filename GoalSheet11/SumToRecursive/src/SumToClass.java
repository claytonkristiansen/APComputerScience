//Clayton Kristiansen
//Goal Sheet 11 "SumTo"
//03-15-2019
//AP Computer Science P.1

import java.util.*;

public class SumToClass 
{
	public static float SumTo(int n)
	{
		if(n < 0)
		{
			throw new IllegalArgumentException();
		}
		else if(n == 0)
		{
			return 0;
		}
		else if(n == 1)
		{
			return 1;
		}
		else
		{
			return SumTo(n - 1) + (float)1 / n;
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println(SumTo(10));
	}
}
