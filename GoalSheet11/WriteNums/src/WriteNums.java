//Clayton Kristiansen
//Goal Sheet 11 "WriteNums"
//03-15-2019
//AP Computer Science P.1

import java.util.*;

public class WriteNums 
{
	
	public static int PrintNums(int n)
	{
		if(n == 1)
		{
			System.out.print(1 + ", ");
			return 1;
		}
		int number = 1 + PrintNums(n - 1);
		System.out.print(number + ", ");
		return number;
	}
	
	public static void main(String[] args) 
	{
		PrintNums(10);
	}
}
