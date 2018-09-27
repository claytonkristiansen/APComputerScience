//Clayton Kristiansen
//Goal Sheet 3 "Number Range"
//9-27-2018
//AP Computer Science P.3

import java.util.*;

public class NumberRange 
{
	
	public static void printRange(int num1, int num2)
	{
		if(num1 > num2)
		{
			int range = num1 - num2;
			System.out.print("[");
			for(int i = 0; i <= range; i++)
			{
				System.out.print(num1 - i);
			}
			System.out.print("]");
		}
		else if(num2 > num1)
		{
			int range = num2 - num1;
			System.out.print("[");
			for(int i = 0; i <= range; i++)
			{
				System.out.print(num1 + i);
			}
			System.out.print("]");
		}
		else if(num1 == num2)
		{
			System.out.print("[" + num1 + "]");
		}
	}

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int number1 = reader.nextInt();
		System.out.print("Enter number 2: ");
		int number2 = reader.nextInt();
		printRange(number1, number2);
	}

}
