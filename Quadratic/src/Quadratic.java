//Clayton Kristiansen
//September 15th, 2018
//Goal Sheet 2 (Quadratic)
//AP Computer Science P.3

public class Quadratic 
{
	public static double[] QuadraticFunction(double A, double B, double C)
	{
		//double radical = Math.sqrt(B * B - (4 * A * C));
		double [] roots = new double[2];
		roots[0] = ((-1 * B + Math.sqrt(B * B - (4 * A * C))) / (2 * A));
		roots[1] = ((-1 * B - Math.sqrt(B * B - (4 * A * C))) / (2 * A));
		System.out.print("The roots of " + A + "x^2 + " + B + "x + " + C + " are:\n" + roots[0] + "\nand\n" + roots[1]);
		return roots;
	}

	public static void main(String[] args) 
	{
		QuadraticFunction(3,10,2);
	}

}
