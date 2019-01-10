//Clayton Kristiansen
//Goal Sheet 6 "ThreeDimensionalShapes" -TDShape.java
//11-23-2018
//AP Computer Science P.1


public class TDShape implements ThreeDimensionalShape
{
	String m_name;
	float m_surfaceArea = 0;
	float m_volume = 0;
	
	public TDShape(String name)
	{
		m_name = name;
	}
	public float GetSurfaceArea()
	{
		return m_surfaceArea;
	}
	public float GetVolume()
	{
		return m_volume;
	}
	public static void main(String[] args) 
	{
		Cube cube = new Cube("cube", 2);
		System.out.println(cube.GetVolume());
	}
}
