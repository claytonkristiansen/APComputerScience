//Clayton Kristiansen
//September 15th, 2018
//Goal Sheet 2 (Stairs)
//AP Computer Science P.3

import java.util.Scanner;

public class Triangle 
{
	public static float LawOfCosinesAngle(float oppositeSide, float angle1, float angle2)
	{
		return (float)Math.acos(((angle1 * angle1) + (angle2 * angle2) - (oppositeSide * oppositeSide)) / (2*angle1*angle2)) * (float)(180/Math.PI);
	}
	
	public static void PrintAngles(float a, float b, float c)
	{
		float side1 = a;
		float side2 = b;
		float side3 = c;
		if((c + b) > a && (a + b) > c && (a + c) > b)
		{
			System.out.println("Angle A: " + LawOfCosinesAngle(side1, side2, side3) + " degrees");
			System.out.println("Angle B: " + LawOfCosinesAngle(side2, side1, side3) + " degrees");
			System.out.println("Angle C: " + LawOfCosinesAngle(side3, side2, side1) + " degrees");
		}
		else
		{
			System.out.print("These sides do not create a trianlge");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in); 
		System.out.print("Side a: ");
		float side1 = Float.parseFloat(reader.nextLine());
		System.out.print("Side b: ");
		float side2 = Float.parseFloat(reader.nextLine());
		System.out.print("Side c: ");
		float side3 = Float.parseFloat(reader.nextLine());
		PrintAngles(side1, side2, side3);
	}

}
