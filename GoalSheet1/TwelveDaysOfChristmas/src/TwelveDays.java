//Clayton Kristiansen
//Goal Sheet 1 "Twelve Days of Christmas"
//9-14-2018
//AP Computer Science P.3

public class TwelveDays 
{
	public static void Day(int day)
	{
		String dayName = new String();
		switch(day)
		{
		case 1:
			dayName = "first";
			break;
		case 2:
			dayName = "second";
			break;
		case 3:
			dayName = "third";
			break;
		case 4:
			dayName = "fourth";
			break;
		case 5:
			dayName = "fifth";
			break;
		case 6:
			dayName = "sixth";
			break;
		case 7:
			dayName = "seventh";
			break;
		case 8:
			dayName = "eighth";
			break;
		case 9:
			dayName = "ninth";
			break;
		case 10:
			dayName = "tenth";
			break;
		case 11:
			dayName = "eleventh";
			break;
		case 12:
			dayName = "twelfth";
			break;
		}
		
		System.out.println("On the " + dayName + " day of Christmas my true love gave to me");
	}
	public static void Items(String object)//Overloaded function
	{
		System.out.println(object + "....");
	}
	public static void Items(String object1, String object2)
	{
		System.out.println("Two " + object2);
		System.out.println("And a " + object1 + "....");
	}
	public static void Items(String object1, String object2, String object3)
	{
		System.out.println("Three " + object3);
		System.out.println("Two " + object2);
		System.out.println("And a " + object1 + " in a tree");
	}
	public static void Items(String object1, String object2, String object3, String object4)
	{
		System.out.println("Four " + object4);
		System.out.println("Three " + object3);
		System.out.println("Two " + object2);
		System.out.println("And a " + object1 + "....");
	}
	public static void Items(String object1, String object2, String object3, String object4, String object5)
	{
		System.out.println("Five " + object5);
		System.out.println("Four " + object4);
		System.out.println("Three " + object3);
		System.out.println("Two " + object2);
		System.out.println("And a " + object1 + "....");
	}
	public static void Items(String object1, String object2, String object3, String object4, String object5, String object6)
	{
		System.out.println("Six " + object6);
		System.out.println("Five " + object5);
		System.out.println("Four " + object4);
		System.out.println("Three " + object3);
		System.out.println("Two " + object2);
		System.out.println("And a " + object1 + " in a tree");
	}
	public static void Items(String object1, String object2, String object3, String object4, String object5, String object6,
			String object7)
	{
		System.out.println("Seven " + object7);
		System.out.println("Six " + object6);
		System.out.println("Five " + object5);
		System.out.println("Four " + object4);
		System.out.println("Three " + object3);
		System.out.println("Two " + object2);
		System.out.println("And a " + object1 + "....");
	}
	public static void Items(String object1, String object2, String object3, String object4, String object5, String object6,
			String object7, String object8)
	{
		System.out.println("Eight " + object8);
		System.out.println("Seven " + object7);
		System.out.println("Six " + object6);
		System.out.println("Five " + object5);
		System.out.println("Four " + object4);
		System.out.println("Three " + object3);
		System.out.println("Two " + object2);
		System.out.println("And a " + object1 + " on my tree");
	}
	public static void Items(String object1, String object2, String object3, String object4, String object5, String object6,
			String object7, String object8, String object9)
	{
		System.out.println("Nine " + object9);
		System.out.println("Eight " + object8);
		System.out.println("Seven " + object7);
		System.out.println("Six " + object6);
		System.out.println("Five " + object5);
		System.out.println("Four " + object4);
		System.out.println("Three " + object3);
		System.out.println("Two " + object2);
		System.out.println("And a " + object1 + "....");
	}
	public static void Items(String object1, String object2, String object3, String object4, String object5, String object6,
			String object7, String object8, String object9, String object10)
	{
		System.out.println("Ten " + object10);
		System.out.println("Nine " + object9);
		System.out.println("Eight " + object8);
		System.out.println("Seven " + object7);
		System.out.println("Six " + object6);
		System.out.println("Five " + object5);
		System.out.println("Four " + object4);
		System.out.println("Three " + object3);
		System.out.println("Two " + object2);
		System.out.println("And a " + object1 + "....");
	}
	public static void Items(String object1, String object2, String object3, String object4, String object5, String object6,
			String object7, String object8, String object9, String object10, String object11)
	{
		System.out.println("Eleven " + object11);
		System.out.println("Ten " + object10);
		System.out.println("Nine " + object9);
		System.out.println("Eight " + object8);
		System.out.println("Seven " + object7);
		System.out.println("Six " + object6);
		System.out.println("Five " + object5);
		System.out.println("Four " + object4);
		System.out.println("Three " + object3);
		System.out.println("Two " + object2);
		System.out.println("And a " + object1 + "....");
	}
	public static void Items(String object1, String object2, String object3, String object4, String object5, String object6,
			String object7, String object8, String object9, String object10, String object11, String object12)
	{
		System.out.println("Twelve " + object12);
		System.out.println("Eleven " + object11);
		System.out.println("Ten " + object10);
		System.out.println("Nine " + object9);
		System.out.println("Eight " + object8);
		System.out.println("Seven " + object7);
		System.out.println("Six " + object6);
		System.out.println("Five " + object5);
		System.out.println("Four " + object4);
		System.out.println("Three " + object3);
		System.out.println("Two " + object2);
		System.out.println("And a " + object1 + " iiiiiiiiiiiin aaaaaaaa treeeeee");
	}
	public static void main(String[] args) 
	{
		Day(1);
		Items("beer");
		Day(2);
		Items("beer", "turtle necks");
		Day(3);
		Items("beer", "turle necks", "french toasts");
		Day(4);
		Items("beer", "turle necks", "french toasts", "pounds of backbacon");
		Day(5);
		Items("beer", "turle necks", "french toasts", "pounds of backbacon", "golden tooks");
		Day(6);
		Items("beer", "turle necks", "french toasts", "pounds of backbacon", "golden tooks", "packs of two fours");
		Day(7);
		Items("beer", "turle necks", "french toasts", "pounds of backbacon", "golden tooks", "packs of two fours", "packs of smokes");
		Day(8);
		Items("beer", "turle necks", "french toasts", "pounds of backbacon", "golden tooks", "packs of two fours", "packs of smokes", "comic books");
		Day(9);
		Items("beer", "turle necks", "french toasts", "pounds of backbacon", "golden tooks", "packs of two fours", "packs of smokes", "comic books", "doughnuts");
		Day(10);
		Items("beer", "turle necks", "french toasts", "pounds of backbacon", "golden tooks", "packs of two fours", "packs of smokes", "comic books", "doughnuts", "plates of poutine");
		Day(11);
		Items("beer", "turle necks", "french toasts", "pounds of backbacon", "golden tooks", "packs of two fours", "packs of smokes", "comic books", "doughnuts", "plates of poutine", "hockey sticks");
		Day(12);
		Items("beer", "turle necks", "french toasts", "pounds of backbacon", "golden tooks", "packs of two fours", "packs of smokes", "comic books", "doughnuts", "plates of poutine", "hockey sticks", "jacks a cutting");
			
	}

}
