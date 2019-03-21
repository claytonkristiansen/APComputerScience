//Clayton Kristiansen
//Goal Sheet 10 "RecursiveSquares"
//03-01-2018
//AP Computer Science P.1

public class Squares 
{
	public static int RecursiveSquares(int n)
	{
		if(n > 0)
		{
//			if((n * n) % 2 == 0)
//			{
//				--n;
//			}
//
//			if((n * n) % 2 != 0)
//			{
//				System.out.print(n * n + ", ");
//				RecursiveSquares(n - 2);
//				++n;
//			}
//			if((n * n) % 2 == 0)
//			{
//				System.out.print(n * n + ", ");
//			}
			if ((n * n) % 2 != 0)
			{
				System.out.print(n * n + ", ");
				RecursiveSquares(n - 1);
			}
			else if ((n * n) % 2 == 0)
			{
				RecursiveSquares(n - 1);
				System.out.print(n * n + ", ");
			}
			
		}
		return 0;
	}
	
	
	public static void main(String[] args) 
	{
		RecursiveSquares(10);
	}

}
