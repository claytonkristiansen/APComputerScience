import java.util.Random;


public class RandomLines 
{
	public static char []m_lettersArray;
	public static void LinesRandom()
	{
		Random rand = new Random();
		int numLines = rand.nextInt(6) + 5;
		for (int i = 0; i < numLines; i++)
		{
			int numChars = rand.nextInt(80) + 1;
			for (int k = 0; k < numChars; k++)
			{
				System.out.print(m_lettersArray[rand.nextInt(26)]);
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) 
	{
		m_lettersArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		LinesRandom();
	}

}
