
//Clayton Kristiansen
//Goal Sheet 1 "Shapes"
//9-14-2018
//AP Computer Science P.3

public class Shapes 
{
	public static String Print1()
	{
		String message = "  _______  \n"
				+ 		 " /       \\ \n"
				+ 		 "/         \\\n"
				+ 		 "\\         /\n"
				+ 		 " \\_______/ \n\n";
		System.out.print(message);
		return message;
	}
	public static String Print2()
	{
		String message = "_\"_'_\"_'_\"_\n";
		System.out.print(message);
		return message;
	}
	public static String Print3()
	{
		String message = "  _______  \n"
				+ 		 " /       \\ \n"
				+ 		 "/         \\\n";
		System.out.print(message);
		return message;
	}
	public static String Print4()
	{
		String message = "\\         /\n"
				+ 		 " \\_______/ \n\n";
		System.out.print(message);
		return message;
	}
	public static String PrintMessage()
	{
		String message = "  _______  \n"
				+ 		 " /       \\ \n"
				+ 		 "/         \\\n"
				+ 		 "\\         /\n"
				+ 		 " \\_______/ \n\n"
				+ 		 "_\"_'_\"_'_\"_\n\n"
				+		 "  _______  \n"
				+ 		 " /       \\ \n"
				+ 		 "/         \\\n"
				+ 		 "\\         /\n"
				+ 		 " \\_______/ \n\n"
				+ 		 "_\"_'_\"_'_\"_\n"
				+ 		 "\\         /\n"
				+ 		 " \\_______/ \n\n"
				+ 		 "  _______  \n"
				+ 		 " /       \\ \n"
				+ 		 "/         \\\n"
				+ 		 "_\"_'_\"_'_\"_\n"
				+ 		 "\\         /\n"
				+ 		 " \\_______/ \n\n";
		
		System.out.print(message);
		return message;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Print1();
		Print2();
		System.out.print("\n");
		Print1();
		Print2();
		Print4();
		Print3();
		Print2();
		Print4();
		
		//PrintMessage();
	}

}
