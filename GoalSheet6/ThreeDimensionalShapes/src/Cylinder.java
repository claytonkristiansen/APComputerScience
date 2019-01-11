//Clayton Kristiansen
//Goal Sheet 6 "ThreeDimensionalShapes" -Cylinder.java
//11-23-2018
//AP Computer Science P.1


public class Cylinder extends TDShape
{
	float m_radius;
	float m_height;
	public Cylinder(String name, float radius, float height)
	{
		super(name);
		m_radius = radius;
		m_height = height;
		m_surfaceArea = (2.0f * (float)Math.PI * m_radius * m_height) + (2.0f * (float)Math.PI * m_radius * m_radius);
		m_volume = (float)Math.PI * m_radius * m_radius * m_height;
	}
	
	public float GetRadius()
	{
		return m_radius;
	}
	
	public float GetHeight()
	{
		return m_height;
	}
}
