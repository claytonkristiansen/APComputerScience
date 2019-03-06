import java.util.*;

public class SumToClass 
{
	public static float SumTo(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return SumTo(n - 1) + (float)1 / n;
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println(SumTo(3));
	}
}
