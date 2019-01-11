//Clayton Kristiansen
//Goal Sheet 6 "ThreeDimensionalShapes" -RectPrism.java
//11-23-2018
//AP Computer Science P.1


public class RectPrism extends TDShape
{
	float m_length;
	float m_width;
	float m_height;
	
	public RectPrism(String name, float length, float width, float height)
	{
		super(name);
		m_length = length; 
		m_width = width;
		m_height = height;
		m_surfaceArea = 2.0f * (m_length * m_width + m_width * m_height + m_length * m_height);
		m_volume = m_length * m_width * m_height;
	}
	
	public float GetLength()
	{
		return m_length;
	}
	
	public float GetWidth()
	{
		return m_width;
	}
	
	public float GetHeight()
	{
		return m_height;
	}
}
