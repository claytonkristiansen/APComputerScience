//Clayton Kristiansen
//September 15th, 2018
//Goal Sheet 2 (Fibonacci)
//AP Computer Science P.3

public class Fibonacci 
{
	
	public static void main(String[] args) 
	{
		int back, front;
		back = 0;
		front = 1;
		for(int i = 0; i < 5; i++)
		{
			front = back + front;
			back = front - back;
			System.out.println(back);
			
		}
	}

}
