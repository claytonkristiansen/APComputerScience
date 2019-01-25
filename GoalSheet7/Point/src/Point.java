//Clayton Kristiansen
//Goal Sheet 7 "Point"
//12-05-2018
//AP Computer Science P.1

import java.util.*;


public class Point implements Comparable<Point>
{
	public int m_y;
	public int m_x;
	public Point(int x, int y) 
	{
		m_x = x;
		m_y = y;
	}

	public int compareTo(Point o) 
	{
		if(m_y != o.m_y)
		{
			return m_y - o.m_y;
		}
		else if(m_x != o.m_x)
		{
			return m_x - o.m_x;
		}
		else
		{
			return 0;
		}
	}

}
