//Clayton Kristiansen
//Goal Sheet 3 "Roman Numerals"
//9-26-2018
//AP Computer Science P.3

import java.util.Scanner;


public class RomanNumerals 
{
	public static void RomanNumeralsFunction(int number)
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
				if(number >= 800)
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
				if(number > 300)
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
				if(number >= 80)
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
				if(number > 30)
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
				if(number >= 8)
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
				if(number > 3)
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
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number: ");
		RomanNumeralsFunction(Integer.parseInt(reader.nextLine()));
	}
}
