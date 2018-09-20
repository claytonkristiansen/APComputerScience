//Clayton Kristiansen
//September 15th, 2018
//Goal Sheet 2 (Stairs)
//AP Computer Science P.3

import java.util.Scanner;

public class Stairs 
{
	public static void PrintStairs(int numStairs)
	{
		int spacesR = 0;
		int spacesL = (numStairs - 1);
		for(int i = 0; i < numStairs; i++)
		{
			System.out.print(" ");
			for(int k = 0; k < spacesL; k++)
			{
				System.out.print("     ");
			}
			System.out.print(" °  " + "******");
			for(int k = 0; k < spacesR; k++)
			{
				System.out.print("     ");
			}
			System.out.print("*\n");
			System.out.print(" ");
			for(int k = 0; k < spacesL; k++)
			{
				System.out.print("     ");
			}
			System.out.print("/|\\ " + "*     ");
			for(int k = 0; k < spacesR; k++)
			{
				System.out.print("     ");
			}
			System.out.print("*\n");
			System.out.print(" ");
			for(int k = 0; k < spacesL; k++)
			{
				System.out.print("     ");
			}
			System.out.print("/ \\ " + "*     ");
			for(int k = 0; k < spacesR; k++)
			{
				System.out.print("     ");
			}
			System.out.print("*\n");
			spacesL -= 1;
			spacesR += 1;
		}
		for(int i = 0; i <= numStairs; i++)
		{
			System.out.print("*****");
		}
		System.out.print("**"); //Vertical and starting asterisk
	}
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number of stairs: ");
		PrintStairs((Integer.parseInt(reader.nextLine())));
	}

}
