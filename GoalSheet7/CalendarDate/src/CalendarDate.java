//Clayton Kristiansen
//Goal Sheet 7 "CalendarDate"
//12-05-2018
//AP Computer Science P.1

import java.util.*;

public class CalendarDate implements Comparable<CalendarDate>
{
	private int m_month;
	private int m_day;
	private int m_year;
	
	public CalendarDate(int month, int day, int year)
	{
		m_month = month;
		m_day = day;
		m_year = year;
	}
	
	public int compareTo(CalendarDate o) 
	{
		if(m_year != o.m_year)
		{
			return m_year - o.m_year;
		}
		else if(m_month != o.m_month)
		{
			return m_month - o.m_month;
		}
		else
		{
			return m_day - o.m_day;
		}
	}
	
	public int getMonth()
	{
		return m_month;
	}
	
	public int getDay()
	{
		return m_day;
	}
	
	public int getYear()
	{
		return m_year;
	}
	
	public String toString()
	{
		return m_month + "/" + m_day + "/" + m_year;
	}
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Date 1> Month: ");
		int month = reader.nextInt();
		System.out.print("\nDay: ");
		int day = reader.nextInt();
		System.out.print("\nYear: ");
		int year = reader.nextInt();
		CalendarDate date1 = new CalendarDate(month,day,year);
		System.out.print("Date 2> Month: ");
		month = reader.nextInt();
		System.out.print("\nDay: ");
		day = reader.nextInt();
		System.out.print("\nYear: ");
		year = reader.nextInt();
		CalendarDate date2 = new CalendarDate(month,day,year);
		System.out.println(date1.compareTo(date2));
	}

}
