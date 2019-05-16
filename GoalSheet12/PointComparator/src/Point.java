
import java.util.*;
import java.math.*;

public class Point implements Comparable<Point>
{
	private double m_x;
	private double m_y;
	
	public Point(double x, double y)
	{
		m_x = x;
		m_y = y;
	}
	
	public double GetX()
	{
		return m_x;
	}
	public double GetY()
	{
		return m_y;
	}
	public void SetX(double x)
	{
		m_x = x;
	}
	public void SetY(double y)
	{
		m_y = y;
	}
	
	public String toString()
	{
		return "(" + m_x + ", " + m_y + ")";
	}
	
	public double Distance(Point otherPoint)
	{
		return Math.sqrt(Math.pow(this.GetX() - otherPoint.GetX(), 2)  + Math.pow(this.GetY() - otherPoint.GetY(), 2));
	}
	
	@Override
	public int compareTo(Point o) 
	{
		return (int)(this.Distance(new Point(0,0)) - o.Distance(new Point(0,0)));
	}
}
