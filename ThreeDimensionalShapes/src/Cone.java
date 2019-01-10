//Clayton Kristiansen
//Goal Sheet 6 "ThreeDimensionalShapes" -Cone.java
//11-23-2018
//AP Computer Science P.1


public class Cone extends TDShape
{
	float m_height;
	float m_radius;
	public Cone(String name, float height, float radius)
	{
		super(name);
		m_height = height;
		m_radius = radius;
		m_surfaceArea = (float)Math.PI * m_radius * (m_radius + (float)Math.sqrt((m_height * m_height) + (m_radius * m_radius)));
		m_volume = (float)Math.PI * (m_radius * m_radius) * (m_height / 3.0f);
	}
	
	public float GetHeight()
	{
		return m_height;
	}
	
	public float GetRadius()
	{
		return m_radius;
	}
}
