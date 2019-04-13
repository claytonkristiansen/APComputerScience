//Clayton Kristiansen
//Goal Sheet 11 "WriteSequence"
//03-15-2019
//AP Computer Science P.1

import java.util.*;

enum STATE
{
	FIRST_NODE,
	EVEN,
	ODD
}

public class Sequence 
{
	static STATE state = STATE.FIRST_NODE; //0 means first node, 1 means initial n is odd, and 2 means initial n is even
	public static void WriteSequence(int n)
	{
		if(state == STATE.FIRST_NODE & n % 2 != 0) //If it is the first node in the recursion and n is odd
		{
			n = (n / 2) + 1;
			state = STATE.ODD;
		}
		else if(state == STATE.FIRST_NODE) //If it is the first node in the recursion and n is even
		{
			n = n / 2;
			state = STATE.EVEN;
		}
		if(n < 1)
		{
			throw new IllegalArgumentException();
		}
		if(n > 1)
		{
			System.out.print(n + " ");
			WriteSequence(n - 1);
			System.out.print(n + " ");
		}
		else if (state == STATE.EVEN)
		{
			System.out.print(1 + " ");
			System.out.print(1 + " ");
		}
		else
		{
			System.out.print(1 + " ");
		}
	}
	
	public static void main(String[] args) 
	{
		WriteSequence(6);
	}
}
