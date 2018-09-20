//Clayton Kristiansen
//September 15th, 2018
//Goal Sheet 2 (Quadratic)
//AP Computer Science P.3

import java.util.Scanner;

public class Quadratic 
{
	public static double[] QuadraticFunction(double A, double B, double C) //Prints out the roots of a quadratic with given Coeficients
	{
		//double radical = Math.sqrt(B * B - (4 * A * C));
		double [] roots = new double[2];
		roots[0] = ((-1 * B + Math.sqrt(B * B - (4 * A * C))) / (2 * A));
		roots[1] = ((-1 * B - Math.sqrt(B * B - (4 * A * C))) / (2 * A));
		if(Double.isNaN(roots[0]) || Double.isNaN(roots[1]))
		{
			System.out.println("This quadratic does not have any roots");
		}
		else
		{
			System.out.print("The roots of " + A + "x^2 + " + B + "x + " + C + " are:\n" + roots[0] + "\nand\n" + roots[1]);
		}
		
		return roots;
	}

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner (System.in);
		System.out.print("A: ");
		double A = Double.parseDouble(reader.nextLine());
		System.out.print("B: ");
		double B = Double.parseDouble(reader.nextLine());
		System.out.print("C: ");
		double C = Double.parseDouble(reader.nextLine());
		QuadraticFunction(A,B,C); 
	}

}
