//Clayton Kristiansen
//September 15th, 2018
//Goal Sheet 2 (Fibonacci)
//AP Computer Science P.3

import java.util.Scanner;

public class Fibonacci 
{
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("How many numbers in the Fibonaccy Series?: ");
		int numberOfFibonacci = Integer.parseInt(reader.nextLine());
		int back, front;
		back = 0;
		front = 1;
		for(int i = 0; i < numberOfFibonacci; i++)
		{
			front = back + front;
			back = front - back;
			System.out.println(back);
			
		}
	}

}
