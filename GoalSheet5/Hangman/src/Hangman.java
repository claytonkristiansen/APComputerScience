//Clayton Kristiansen
//Goal Sheet 1 "Hangman"
//11-09-2018
//AP Computer Science P.1

import java.util.*;

public class Hangman 
{
	static ArrayList<Character> m_lettersGuessed = new ArrayList<Character>();
	static char[] m_wordGuessed;
	static int m_incorrectGuessesRemaining = 7;
	static String m_wordsList[] = 
		{
				"elephant",
				"cedarcrest",
				"football",
				"laptop",
				"computer",
				"technology",
				"revolutionary",
				"calculations",
				"diverge",
				"concatenate",
				"mathematics",
				"australia",
				"science",
				"starwars",
				"installation",
				"interesting",
				"impossible",
				"miyoshi",
				"ashwin",
				"pumpkin",
				"peanut",
				"butter",
				"bowl",
				"seagulls",
				"halloween",
				"skeleton",
				"preguntas",
				"dishwasher",
				"fridge",
				"candy",
				"cup",
				"Banana",
				"hangman",
				"medication",
				"terciary",
				"awkward",
				"bagpipes",
				"gazebo",
				"banishment",
				"kayak",
				"zombie",
				"bibliopole",
				"cyanic",
				"effervesence",
				"electron",
				"proton",
				"neutron",
				"fibula"
				
		};
	static String RandomWord() //Returns a random word
	{
		Random rand = new Random();
		return m_wordsList[rand.nextInt(m_wordsList.length)];
	}
	static String m_hangmanAscii[][] = { 
			{
				"____",
				"|   ",
				"|   ",
				"|   ",
				"|   ",
				"----"
			}, {
				"____",
				"| o ",
				"|   ",
				"|   ",
				"|   ",
				"----"
			} ,{
				"____",
				"| o ",
				"| | ",
				"|   ",
				"|   ",
				"----"
			}, {
				"____",
				"| o ",
				"| | ",
				"| | ",
				"|   ",
				"----"
			}, {
				"____",
				"| o ",
				"| | ",
				"| | ",
				"|  \\",
				"----"
			}, {"____",
				"| o ",
				"| | ",
				"| | ",
				"|/ \\",
				"----"
			}, {
				"____",
				"| o ",
				"| |\\",
				"| | ",
				"|/ \\",
				"----"
			}, {
				"____",
				"| o ",
				"|/|\\",
				"| | ",
				"|/ \\",
				"----"	
			} };
	
	public static boolean GuessLetter(String word, char character)
	{
		word = word.toUpperCase();
		boolean guessCorrect = false;
		if(m_lettersGuessed.contains(character)) //If the character has already been guessed
		{
			System.out.println("You have already guessed " + character);
			return false; //Return
		}
		else
		{
			m_lettersGuessed.add(0, character); //Adds letters guessed
		}
		for(int i = 0; i < word.length(); i++) //Iterates through the entire string
		{
			if(word.charAt(i) == character) //If the character at this index is equal to the character guessed
			{
				guessCorrect = true;
				m_wordGuessed[i] = character;
			}
		}
		if(!guessCorrect) //If the character guessed was not in the word
		{
			m_incorrectGuessesRemaining--; //Removes guess
		}
		System.out.print(new String(m_wordGuessed)); //Prints out the word with current letters guessed
		for(int i = 0; i < 6; i++)
		{
			System.out.print("\n" + m_hangmanAscii[7 - m_incorrectGuessesRemaining][i]);
		}
		
		System.out.println("\nYou have " + m_incorrectGuessesRemaining + " guesses remaining"); 
		if(word.equals(new String(m_wordGuessed)))
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		String word = RandomWord();
		m_wordGuessed = new char[word.length()]; //Initializing the character array that stores letters guessed
		for(int i = 0; i < m_wordGuessed.length; i++) //Iterates through entire character array
		{
			m_wordGuessed[i] = '-'; //Sets each member of the array to a dash
		}
		
		boolean exitCondition = false;
		
		for(;!exitCondition;)
		{
			Scanner reader = new Scanner(System.in);
			System.out.print("Guess a letter: ");
			char input = reader.next().charAt(0);
			if((input >= 65 && input <= 90) || (input >= 97 && input <= 122)) //Checks if character input is a letter
			{
				if((input >= 97 && input <= 122)) //If character is lowercase
				{
					input -= 32; //Make the character uppercase
				}
				if(exitCondition = GuessLetter(word, input)) //If the entire word has been gussed
				{
					System.out.println("You Win!"); 
					break;
				}
				else if(m_incorrectGuessesRemaining <= 0) //If no more guesses remain
				{
					System.out.println("You Lose!");
					break;
				}
			}
			else //If the character input is not a letter
			{
				System.out.println("Guess must be a letter");
			}
		}
	}

}
