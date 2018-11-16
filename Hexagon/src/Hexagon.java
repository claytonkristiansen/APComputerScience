//Clayton Kristiansen
//Goal Sheet 6 "Hexagon" -Hexagon.java
//11-23-2018
//AP Computer Science P.1

import java.math.*;

public class Hexagon implements Shape
{
	float m_sideLength;
	public float GetArea()
	{
		return (m_sideLength * m_sideLength) * 2.5980762113533159402911695122588f;
	}
	public float GetPerimeter()
	{
		return 6 * m_sideLength;
	}
}