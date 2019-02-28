import java.util.Scanner;

public class Fibonaci 
{
	public static int RecursiveFib(int number)
	{
		if(number <= 1)
		{
			return 1;
		}
		else
		{
			return RecursiveFib(number - 1) + RecursiveFib(number - 2);
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Fibonnaci index: ");
		Scanner reader = new Scanner(System.in);
		int input = reader.nextInt();
		System.out.println(RecursiveFib(input));
	}

}
