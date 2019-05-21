//Clayton Kristiansen
//Goal Sheet 14 "Anagram"
//05-21-2019
//AP Computer Science P.1

import java.util.*;
import java.io.*;

public class Anagram 
{
	public static boolean IsAnagram(String string1, String string2)
	{
		if(string1.matches(string2))
		{
			return false;
		}
		int string1Length = string1.length();
		int string2Length = string2.length();
		boolean containsLetter = false;
		ArrayList<Integer> indexesChecked = new ArrayList<Integer>();
		if(string1Length != string2Length)
		{
			return false;
		}
		else
		{
			for(int i = 0; i < string1Length; i++)
			{
				containsLetter = false;
				for(int k = 0; k < string2Length; k++)
				{
					if(string1.charAt(i) == string2.charAt(k) && !indexesChecked.contains(k))
					{
						containsLetter = true;
						indexesChecked.add(k);
						break;
					}
				}
				if(!containsLetter)
				{
					return false;
				}
			}
			return true;
		}
	}
	
	public static ArrayList<String> ArrayListFromFile(File input)
	{
		ArrayList<String> list = new ArrayList<String>();
		try 
		{
			Scanner reader = new Scanner(input);
			while(reader.hasNext())
			{
				list.add(reader.next());
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static Map<String, ArrayList<String>> FindAnagrams(ArrayList<String> words, ArrayList<String> dictionary)
	{
		Map<String, ArrayList<String>> outputMap = new TreeMap<String, ArrayList<String>>();
		ArrayList<String> usedWords = new ArrayList<String>();
		
		
		
		
		Map<Integer, ArrayList<String>> incrementalWordMap = new TreeMap<Integer, ArrayList<String>>(); //Map of every word in increasing size and a list of words of distance 1 away

		int currentWordLength = 0;
		ArrayList<String> tempArray = new ArrayList<String>();
		for(String word : dictionary)
		{
			if(word.length() > currentWordLength)
			{
				incrementalWordMap.put(currentWordLength, tempArray);
				currentWordLength = word.length();
				tempArray = new ArrayList<String>();
			}
			tempArray.add(word);
		}
		incrementalWordMap.put(currentWordLength, tempArray);
		
		
		
		
		for(int i = 0; i < words.size(); i++)
		{
			String s = words.get(i);
			int g = 0;
			if(s.matches("aband"))
			{
				g++;
			}
			System.out.println(i + ": " + s + "    = " + words.size() + " words left");
			ArrayList<String> list = new ArrayList<String>();
			ArrayList<String> scanList = incrementalWordMap.get(s.length());
			for(int k = 0; k < scanList.size();)
			{
				String s2 = scanList.get(k);
				if(s.length() == s2.length())
				{
					if(IsAnagram(s, s2))
					{
						list.add(s2);
						scanList.remove(k);
						words.remove(s2);
					}
					else
					{
						k++;
					}
				}
				else
				{
					k++;
				}
			}
			incrementalWordMap.put(s.length(), scanList);
			outputMap.put(s, list);
		}
		
		return outputMap;
	}

	
	public static void main(String[] args) 
	{
		File input = new File("Assets/dictionary.txt");
		File output = new File("Assets/AnagramOutput.txt");
		File dictionary = new File("Assets/sortedDictionary.txt");
		ArrayList<String> dictionaryWords = new ArrayList<String>();
		ArrayList<String> words = new ArrayList<String>();
		try
		{
			Scanner reader = new Scanner(dictionary);
			while(reader.hasNext())
			{
				dictionaryWords.add(reader.next());
			}
			reader.close();
			reader = new Scanner(input);
			while(reader.hasNext())
			{
				words.add(reader.next());
			}
			reader.close();
			
			for(Map.Entry<String, ArrayList<String>> entry : MapTool.ReadMapFromFile(output).entrySet())
			{
				System.out.println(entry);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
//		Map<String, ArrayList<String>> map = FindAnagrams(words, dictionaryWords);
//		MapTool.PrintMapToFile(map, output);
//		for(Map.Entry<String, ArrayList<String>> entry : map.entrySet())
//		{
//			System.out.println(entry);
//		}
	}

}
