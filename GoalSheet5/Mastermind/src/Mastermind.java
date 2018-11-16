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
		int[] master = new int[4];
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
		int numWrongSpot = 0;
		boolean isMatch = (number1 == number2);
		int[] originalArray = IntToArray(number1);
		int[] guessedArray = IntToArray(number2);
		if(isMatch)
		{
			return true;
		}
		else if(originalArray.length == 4 && guessedArray.length == 4)
		{
			for(int i = 0; i < originalArray.length && i < guessedArray.length; i++)
			{
				if(originalArray[i] == guessedArray[i])
				{
					numCorrectDigits++;
				}
			}
			System.out.println("Number in correct spot: " + numCorrectDigits);
			for(int i = 0; i < guessedArray.length; i++)
			{
				for(int k = 0; k < originalArray.length; k++)
				{
					if(k != i && originalArray[i] != guessedArray[i] && originalArray[k] != guessedArray[k])
					{
						if(originalArray[k] == guessedArray[i])
						{
							numWrongSpot++;
							break; //Once one part of the gussed string is used it breaks and never goes back
						}
					}
				}
			}
			System.out.println("Correct number but in wrong spot: " + numWrongSpot);
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
		number = 6684; //Test 4567
		Scanner reader = new Scanner(System.in);
		do
		{
			System.out.print("Please guess a four digit number: ");
		}
		while(!GuessNumber(number, reader.nextInt()));
		System.out.print("Congradulations! " + number + " was the correct number!");		
	}

}
