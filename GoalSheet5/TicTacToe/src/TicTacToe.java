//Clayton Kristiansen
//Goal Sheet 1 "Tic Tac Toe"
//11-09-2018
//AP Computer Science P.1

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe 
{
	static char[][] m_board = {{' ', '|', ' ', '|', ' '}, {'-', '|', '-', '|', '-'}, {' ', '|', ' ', '|', ' '}, {'-', '|', '-', '|', '-'}, {' ', '|', ' ', '|', ' '}};;

	public static void PrintBoard()
	{
		System.out.println(m_board[0]);
		System.out.println(m_board[1]);
		System.out.println(m_board[2]);
		System.out.println(m_board[3]);
		System.out.println(m_board[4]);
	}
	
	public static boolean WinCheck()
	{
		if((m_board[0][0] == 'X' || m_board[0][0] == 'O') && (m_board[0][0] == m_board[0][2] && m_board[0][2] == m_board[0][4])) //Top row
		{
			return true;
		}
		if((m_board[2][0] == 'X' || m_board[2][0] == 'O') && (m_board[2][0] == m_board[2][2] && m_board[2][2] == m_board[2][4])) //Middle row
		{
			return true;
		}
		if((m_board[4][0] == 'X' || m_board[4][0] == 'O') && (m_board[4][0] == m_board[4][2] && m_board[4][2] == m_board[4][4])) //Bottom row
		{
			return true;
		}
		if((m_board[0][0] == 'X' || m_board[0][0] == 'O') && (m_board[0][0] == m_board[2][0] && m_board[2][0] == m_board[4][0])) //Left Column
		{
			return true;
		}
		if((m_board[0][2] == 'X' || m_board[0][2] == 'O') && (m_board[0][2] == m_board[2][2] && m_board[2][2] == m_board[4][2])) //Middle Column
		{
			return true;
		}
		if((m_board[0][4] == 'X' || m_board[0][4] == 'O') && (m_board[0][4] == m_board[2][4] && m_board[2][4] == m_board[4][4])) //Right Column
		{
			return true;
		}
		if((m_board[0][0] == 'X' || m_board[0][0] == 'O') && (m_board[0][0] == m_board[2][2] && m_board[2][2] == m_board[4][4])) //Upper left to bottom life right diagonal
		{
			return true;
		}
		if((m_board[0][4] == 'X' || m_board[0][4] == 'O') && (m_board[0][4] == m_board[2][2] && m_board[2][2] == m_board[4][0])) //Upper right to bottom life left diagonal
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void Run()
	{
		int numSpaces = 9;
		Scanner reader = new Scanner(System.in);
		int x = 0;
		int y = 0;
		boolean gameOver = false;
		do
		{
			boolean newSpace = false;
			//Player 1 turn
			//-----------------------------------------------------//
			while(numSpaces > 0 && !newSpace)
			{
				System.out.print("Player 1> X: ");
				x = reader.nextInt();
				System.out.print(" Y: ");
				y = reader.nextInt();
				x = 2 * x - 2;
				y = 2 * y - 2;
				if(m_board[x][y] == ' ')
				{
					newSpace = true;
				}
			}
			
			m_board[x][y] = 'O';
			numSpaces--;
			PrintBoard();
			gameOver = WinCheck();
			//-----------------------------------------------------//
			newSpace = false;
			if(gameOver || numSpaces <= 0)
			{
				break;
			}
			//Player 2 turn
			//-----------------------------------------------------//
			while(numSpaces > 0 && !newSpace)
			{
				System.out.print("Player 2> X: ");
				x = reader.nextInt();
				System.out.print(" Y: ");
				y = reader.nextInt();
				x = 2 * x - 2;
				y = 2 * y - 2;
				if(m_board[x][y] == ' ')
				{
					newSpace = true;
				}
			}
			m_board[x][y] = 'X';
			numSpaces--;
			PrintBoard();
			gameOver = WinCheck();
			//-----------------------------------------------------//
		} while (!gameOver && numSpaces > 0);
		if(gameOver)
		{
			System.out.print("\nGame Over!");
		}
	}
	
	public static void main(String[] args) 
	{
		Run();
	}
	
}
