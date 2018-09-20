//Clayton Kristiansen
//September 15th, 2018
//Goal Sheet 2 (Squares)
//AP Computer Science P.3

import java.util.Scanner;

public class Squares 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("How many squares?: ");
		int numberOfSquares = Integer.parseInt(reader.nextLine());
		int number = 1;
		int result;
		for(int i = 0; i < numberOfSquares; i++)
		{
			result = 0;
			for(int k = 0; k < number; k++)
			{
				result += number;
			}
			number++;
			System.out.println(result);
		}
	}
}
