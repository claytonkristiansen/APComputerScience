//Clayton Kristiansen
//Goal Sheet 11 "EfficientRecursiveFibonacci"
//03-15-2019
//AP Computer Science P.1

import java.util.*;

public class EfficientFibonacci 
{
	static long m_lastFibBack = 0;
	static long m_lastFibFront = 0;
	public static void LastFib(long lastFibBack, long lastFibFront)
	{
		m_lastFibFront = lastFibFront;
		m_lastFibBack = lastFibBack;
	}
	
	public static long GetLastFibBack()
	{
		return m_lastFibBack;
	}
	
	public static long GetLastFibFront()
	{
		return m_lastFibFront;
	}
	
	public static long RecursiveFib(long n)
	{
		if(n <= 0)
		{
			return 0;
		}
		if(n <= 1)
		{
			LastFib(1, 1);
			System.out.println(GetLastFibFront());
			return 1;
		}
		else if(GetLastFibBack() == 0 && GetLastFibFront() == 0)
		{
			return RecursiveFib(n - 1) + RecursiveFib(n - 2);
		}
		else
		{
			LastFib(GetLastFibFront(), GetLastFibBack() + GetLastFibFront());
			System.out.println(GetLastFibFront());
			return GetLastFibFront();
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println(RecursiveFib(90));
	}
	
}
