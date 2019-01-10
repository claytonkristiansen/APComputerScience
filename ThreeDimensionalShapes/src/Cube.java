//Clayton Kristiansen
//Goal Sheet 6 "ThreeDimensionalShapes" -Cube.java
//11-23-2018
//AP Computer Science P.1


public class Cube extends TDShape
{
	float m_length;
	public Cube(String name, float length)
	{
		super(name);
		m_length = length;
		m_surfaceArea = m_length * m_length * 6;
		m_volume = m_length * m_length * m_length;
	}
	
	public float GetLength()
	{
		return m_length;
	}
}