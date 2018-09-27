//Clayton Kristiansen
//Goal Sheet 3 "Roman Numerals"
//9-26-2018
//AP Computer Science P.3

import java.util.Scanner;


public class RomanNumerals 
{
	public static void RomanNumeralsFunction(int number) //First algorithm I made
	{
		while(number > 0)
		{
			if(number >= 1000)
			{
				number = number - 1000;
				System.out.print("M");
			}
			else if(number >= 500 && number < 1000)
			{
				if(number >= 900)
				{
					while(number < 1000)
					{
						System.out.print("C");
						number = number + 100;
					}
					System.out.print("M");
					while(number >= 100)
					{
						number = number - 100;
					}
				}
				else
				{
					number = number - 500;
					System.out.print("D");
				}
			}
			else if(number >= 100 && number < 500)
			{
				if(number >= 400)
				{
					while(number < 500)
					{
						System.out.print("C");
						number = number + 100;
					}
					System.out.print("D");
					while(number >= 100)
					{
						number = number - 100;
					}
				}
				else
				{
					number = number - 100;
					System.out.print("C");
				}
			}
			else if(number >= 50 && number < 100)
			{
				if(number >= 90)
				{
					while(number < 100)
					{
						System.out.print("X");
						number = number + 10;
					}
					System.out.print("C");
					while(number >= 10)
					{
						number = number - 10;
					}
				}
				else
				{
					number = number - 50;
					System.out.print("L");
				}
			}
			else if(number >= 10 && number < 50)
			{
				if(number >= 40)
				{
					while(number < 50)
					{
						System.out.print("X");
						number = number + 10;
					}
					System.out.print("L");
					while(number >= 10)
					{
						number = number - 10;
					}
				}
				else
				{
					number = number - 10;
					System.out.print("X");
				}
			}
			else if(number >= 5 && number < 10)
			{
				if(number >= 9)
				{
					while(number < 10) //Difference it is from 10
					{
						System.out.print("I");
						number = number + 1;
					}
					System.out.print("X");
					while(number >= 1)
					{
						number = number - 1;
					}
				}
				else
				{
					number = number - 5;
					System.out.print("V");
				}
			}
			else if(number < 5)
			{
				if(number >= 4)
				{
					while(number > 3)
					{
						System.out.print("I");
						number = number - 1;
					}
					System.out.print("V");
					while(number >= 1)
					{
						number = number - 1;
					}
				}
				else
				{
					number--;
					System.out.print("I");
				}
			}
		}
	}
	
	public static void OtherRomanNumerals(int number) //Second algorithm I made, I do not know which one is more efficient
	{
		if(number >= 1000)
		{
			for(int i = 0; i < number / 1000; i++)
			{
				System.out.print("M");
			}
			number = number % 1000;
		}
		if(number >= 900)
		{
			System.out.print("CM");
			number = number % 100;
		}
		if(number >= 500)
		{
			System.out.print("D");
			for (int i = 0; i < (number - 500) / 100; i++)
			{
				System.out.print("C");
			}
			number = number % 100;
		}
		if(number >= 400)
		{
			System.out.print("CD");
			number = number % 100;
		}
		if(number >= 100)
		{
			for(int i = 0; i < (number / 100); i++)
			{
				System.out.print("C");
			}
			number = number % 100;
		}
		if(number >= 90)
		{
			System.out.print("XC");
			number = number % 10;
		}
		if(number >= 50)
		{
			System.out.print("L");
			for(int i = 0; i < (number - 50) / 10; i++)
			{
				System.out.print("X");
			}
			number = number % 10;
		}
		if(number >= 40)
		{
			System.out.print("XL");
			number = number % 10;
		}
		if(number >= 10)
		{
			for(int i = 0; i < (number / 10); i++)
			{
				System.out.print("X");
			}
			number = number % 10;
		}
		if(number >= 5)
		{
			System.out.print("V");
			for(int i = 0; i < (number - 5); i++)
			{
				System.out.print("I");
			}
			number = 0;
		}
		if(number >= 4)
		{
			System.out.print("IV");
			number = 0;
		}
		if(number > 0 && number <= 3)
		{
			for(int i = 0; i < number; i++)
			{
				System.out.print("I");
			}
			number = 0;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = Integer.parseInt(reader.nextLine());
		System.out.print("\nAlgorithm one found: ");
		RomanNumeralsFunction(number); //Output from algorithm one
		System.out.print("\nAlgorithm two found: ");
		OtherRomanNumerals(number); //Outpit from algorithm two
	}
}
