//Clayton Kristiansen
//Goal Sheet 1 "Mastermind"
//11-09-2018
//AP Computer Science P.1

import java.util.Random;
import java.util.Scanner;

public class Mastermind 
{
	public static int RandomNumber_Inclusive(int min, int max)
	{
		Random rand = new Random();
		int num = rand.nextInt(max + 1 - min) + min;
		
		return num;
	}
	
	public static int[] IntToArray(int number)
	{
		int tempNumber = number;
		int length = 0;
		for(; tempNumber > 0; length++)
		{
			tempNumber /= 10;
		}
		int[] master = new int[length];
		master[3] = number % 10;
		number /= 10;
		master[2] = number % 10;
		number /= 10;
		master[1] = number % 10;
		number /= 10;
		master[0] = number % 10;
		number /= 10;
		return master;
	}
	
	public static boolean GuessNumber(int number1, int number2)
	{
		int numCorrectDigits = 0;
		boolean isMatch = (number1 == number2);
		if(isMatch)
		{
			return true;
		}
		else if(number2 >= 1000 && number2 <= 9999)
		{
			int[] master = IntToArray(number1);
			int[] guessr = IntToArray(number2);
			for(int i = 0; i < master.length && i < guessr.length; i++)
			{
				if(master[i] == guessr[i])
				{
					numCorrectDigits++;
				}
			}
			System.out.println("Number of correct digits: " + numCorrectDigits);
			return false;
		}
		else
		{
			System.out.println("The number must be a four digit number");
			return false;
		}
	}

	public static void main(String[] args) 
	{
		int number = RandomNumber_Inclusive(1000, 9999);
		Scanner reader = new Scanner(System.in);
		do
		{
			System.out.print("Please guess a four digit number: ");
		}
		while(!GuessNumber(number, reader.nextInt()));
		System.out.print("Congradulations! " + number + " was the correct number!");		
	}

}
