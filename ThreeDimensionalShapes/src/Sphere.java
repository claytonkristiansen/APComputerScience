//Clayton Kristiansen
//Goal Sheet 6 "ThreeDimensionalShapes" -Sphere.java
//11-23-2018
//AP Computer Science P.1


public class Sphere extends TDShape
{
	float m_radius;
	public Sphere(String name, float radius) 
	{
		super(name);
		m_radius = radius;
		m_surfaceArea = 4.0f * (float)Math.PI * (m_radius * m_radius);
		m_volume = 4.0f * (float)Math.PI * ((m_radius * m_radius * m_radius) / 3.0f);
	}
	
	public float GetRadius()
	{
		return m_radius;
	}
}
