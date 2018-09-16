//Clayton Kristiansen
//September 15th, 2018
//Goal Sheet 2 (Squares)
//AP Computer Science P.3

public class Squares 
{
	public static void main(String[] args) 
	{
		int number = 1;
		int result;
		for(int i = 0; i < 20; i++)
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
