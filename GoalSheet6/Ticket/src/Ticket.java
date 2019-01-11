//Clayton Kristiansen
//Goal Sheet 6 "Ticket" -Ticket.java
//11-23-2018
//AP Computer Science P.1


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
