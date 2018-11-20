//Clayton Kristiansen
//Goal Sheet 6 "Ticket" -AdvanceTicket.java
//11-23-2018
//AP Computer Science P.1


public class AdvanceTicket extends Ticket
{
	int m_daysAhead;
	AdvanceTicket(int number, int daysAhead)
	{
		super(number);
		m_daysAhead = daysAhead;
		if(m_daysAhead >= 10)
			m_price = 30.0f;
		else if (m_daysAhead < 10)
			m_price = 40.0f;
	}
}
