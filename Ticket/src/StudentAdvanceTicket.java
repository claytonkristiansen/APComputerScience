//Clayton Kristiansen
//Goal Sheet 6 "Ticket" -StudentAdvanceTicket.java
//11-23-2018
//AP Computer Science P.1


public class StudentAdvanceTicket extends AdvanceTicket
{
	public StudentAdvanceTicket(int number, int daysAhead)
	{
		super(number, daysAhead);
		m_price /= 2;
	}
	public void println()
	{
		System.out.println("Number: " + m_number + ", Price: $" + m_price + " (ID required)");
	}
}
