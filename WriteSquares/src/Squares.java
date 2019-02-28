
public class Squares 
{
	public static int RecursiveSquares(int n)
	{
		if(n > 0)
		{
			if((n * n) % 2 != 0)
			{
				System.out.print(n * n + ", ");
				return RecursiveSquares(n - 1);
			}
			else
			{
				System.out.print(n * n + ", ");
				return RecursiveSquares(n - 1);
			}
			
		}
		return 0;
	}
	
	
	public static void main(String[] args) 
	{
		RecursiveSquares(4);
	}

}
