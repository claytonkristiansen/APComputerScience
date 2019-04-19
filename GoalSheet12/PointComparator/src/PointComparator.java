//Clayton Kristiansen
//Goal Sheet 12 "PointComparator"
//03-29-2019
//AP Computer Science P.1

import java.util.*;

public class PointComparator 
{
	public static void main(String[] args) 
	{
		Point point1 = new Point(4, 24);
		Point point2 = new Point(3, 23);
		System.out.println("Point 1: " + point1.toString());
		System.out.println("Point 2: " + point2.toString());
		if(point1.compareTo(point2) < 0)
		{
			System.out.println("Point 1 is closer to the origin");
		}
		if(point1.compareTo(point2) == 0)
		{
			System.out.println("Point 1 is the same distance from the origin as point 2");
		}
		if(point1.compareTo(point2) > 0)
		{
			System.out.println("Point 2 is closer to the origin");
		}
		
	}
}
