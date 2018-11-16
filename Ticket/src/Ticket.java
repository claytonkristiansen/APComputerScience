
public class Ticket 
{
	int m_number;
	float m_price;
	Ticket(int number)
	{
		m_number = number;
	}
	public float GetPrice()
	{
		return m_price;
	}
	public void println()
	{
		System.out.println("Number: " + m_number + ", Price: $" + m_price);
	}
}
