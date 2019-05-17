
public class StringComparator 
{
	public static boolean IsReverseRecursive(String string1, String string2)
	{
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
		if(string1.length() == string2.length())
		{
			int i = 0;
			int k = string1.length() - 1;
			for(; i < string1.length(); i++, k--)
			{
				if(string1.charAt(i) != string2.charAt(k))
				{
					return false;
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean IsReverse(String string1, String string2)
	{
		if(string1.length() == 1 && string2.length() == 1)
		{
			if(string1.charAt(0) == string2.charAt(0))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else if(string1.charAt(0) == string2.charAt(string2.length() - 1))
		{
			return IsReverse(string1.substring(1, string1.length()), string2.substring(0, string2.length() - 1));
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String[] args) 
	{
		String string1 = "super";
		String string2 = "repusd";
		System.out.println(IsReverse(string1, string2));
	}

}
