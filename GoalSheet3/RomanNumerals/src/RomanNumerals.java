//Clayton Kristiansen
//Goal Sheet 3 "Roman Numerals"
//9-26-2018
//AP Computer Science P.3

import java.util.*;


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
		if(number >= 9)
		{
			System.out.print("IX");
			number = 0;
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
	
	public static void RomanNumeralsMapping(int number)
	{
		int onesP = number % 10;
		number = number / 10;
		int tensP = (number % 10) * 10;
		number = number /10;
		int hundredsP = (number % 10) * 100;
		number = number / 10;
		int thousandsP = (number % 10) * 1000;
		
		Map<Integer, String> RomanMap = new HashMap<Integer, String>()
		{
			{
				put(0, "");
				put(1, "I");
				put(2, "II");
				put(3, "III");
				put(4, "IV");
				put(5, "V");
				put(6, "VI");
				put(7, "VII");
				put(8, "VIII");
				put(9, "IX");
				put(10, "X");
				put(20, "XX");
				put(30, "XXX");
				put(40, "XL");
				put(50, "L");
				put(60, "LX");
				put(70, "LXX");
				put(80, "LXXX");
				put(90, "XC");
				put(100, "C");
				put(200, "CC");
				put(300, "CCC");
				put(400, "CD");
				put(500, "D");
				put(600, "DC");
				put(700, "DCC");
				put(800, "DCCC");
				put(900, "CM");
				put(1000, "M");
				put(2000, "MM");
				put(3000, "MMM");
				put(4000, "MMMM");
				put(5000, "MMMMM");
				put(6000, "MMMMMM");
				put(7000, "MMMMMMM");
				put(8000, "MMMMMMMM");
				put(9000, "MMMMMMMMM");
			}
		};
		System.out.print(RomanMap.get(thousandsP) + RomanMap.get(hundredsP) + RomanMap.get(tensP) + RomanMap.get(onesP));
		System.out.print("\nones: " + onesP + "\ntens: " + tensP + "\nhundreds: " + hundredsP + "\nthousands: " + thousandsP);
		
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
		System.out.print("\nAlgorithm three found: ");
		RomanNumeralsMapping(number);
	}
}
