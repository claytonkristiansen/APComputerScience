import java.util.*;
import java.io.*;

public class WordDistance 
{
	Map<Integer, LinkedList<String>> wordsByLength;
	
	
	
	public static int FindEditDistance(String str1, String str2)
	{
		int editDistance = 0;
		for(int i = 0; i < str1.length() && i < str2.length(); i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				editDistance++;
			}
		}
		editDistance += Math.abs(str1.length() - str2.length());
		return editDistance;
	}
	
	public static LinkedList<String> SortByLength(LinkedList<String> list)
	{
		return new LinkedList<String>(MergeSort.MergeSortString(new ArrayList<String>(list)));
	}
	
	public static LinkedList<String> SortFileByLength(File input, File output)
	{
		LinkedList<String> words = new LinkedList<String>();
		try
		{
			Scanner fileScanner = new Scanner(input);
			PrintWriter out = new PrintWriter(output);
			while (fileScanner.hasNext())
			{
				String word = fileScanner.next();
				words.add(word);
			}
			words = SortByLength(words);
			for(String s : words)
			{
				out.write((s + "\n"));
			}
			out.close();
			fileScanner.close();
		}
		catch (IOException ex)
		{
			System.out.printf("ERROR: %s", ex.toString());
		}
		
		
		return words;
	}
	
	public static Map<String, LinkedList<String>> PrintMapToFile(Map<String, LinkedList<String>> map, PrintWriter writer)
	{
		for(Map.Entry<String, LinkedList<String>> entry : map.entrySet())
		{
			writer.write(entry.getKey() + "=");
			LinkedList<String> list = entry.getValue();
			for(String s : list)
			{
				writer.write(s + ",");
			}
			writer.write("\n");
		}
		return map;
	}
	
	public static Map<String, LinkedList<String>> ReadMapFromFile()
	{
		Map<String, LinkedList<String>> map = new TreeMap<String, LinkedList<String>>();
		
		return map;
	}
	
	public static Map<String, LinkedList<String>> GenerateMap(File inputFile)
	{
		Map<String, LinkedList<String>> wordMap = new TreeMap<String, LinkedList<String>>();
		Map<Integer, LinkedList<String>> incrementalWordMap = new TreeMap<Integer, LinkedList<String>>(); //Map of every word in increasing size and a list of words of distance 1 away
		LinkedList<String> words = new LinkedList<String>();
		try
		{
			Scanner fileScanner = new Scanner(inputFile);
			
			
			while (fileScanner.hasNext())
			{
				String word = fileScanner.next();
				words.add(word);
				wordMap.put(word, new LinkedList<String>());
			}
			
			fileScanner.close();
		}
		catch (IOException ex)
		{
			System.out.printf("ERROR: %s", ex.toString());
		}
		int currentWordLength = 0;
		LinkedList<String> tempArray = new LinkedList<String>();
		for(String word : words)
		{
			if(word.length() > currentWordLength)
			{
				incrementalWordMap.put(currentWordLength, tempArray);
				currentWordLength = word.length();
				tempArray = new LinkedList<String>();
			}
			tempArray.add(word);
		}
		
		System.out.println(words);
		int k = 0;
		for(Map.Entry<String, LinkedList<String>> s1 : wordMap.entrySet())
		{
			LinkedList<String> list = new LinkedList<String>();
			LinkedList<String> list1 = incrementalWordMap.get(s1.getKey().length() - 1);
			LinkedList<String> list2 = incrementalWordMap.get(s1.getKey().length());
			LinkedList<String> list3 = incrementalWordMap.get(s1.getKey().length() + 1);
			String key = s1.getKey();
			for(int i = 0; i < list1.size(); i++)
			{
				String wordToCompare = list1.get(i);
				if(FindEditDistance(key, wordToCompare) == 1)
				{
					list.add(wordToCompare);
				}
			}
			for(int i = 0; i < list2.size(); i++)
			{
				String wordToCompare = list2.get(i);
				if(FindEditDistance(key, wordToCompare) == 1)
				{
					list.add(wordToCompare);
				}
			}
			for(int i = 0; i < list3.size(); i++)
			{
				String wordToCompare = list3.get(i);
				if(FindEditDistance(key, wordToCompare) == 1)
				{
					list.add(wordToCompare);
				}
			}
			s1.setValue(list);
			k++;
			System.out.println(k + ": " + s1.getKey());
		}
		try
		{
			PrintWriter wordMapFileWriter = new PrintWriter("Assets/WordMap.txt");
			PrintMapToFile(wordMap, wordMapFileWriter);
			wordMapFileWriter.close();
		}
		catch (IOException ex)
		{
			System.out.printf("ERROR: %s", ex.toString());
		}
		return wordMap;
	}
	
	public static void main(String[] args) 
	{
		//File inputFile = new File("Assets/dictionary.txt");
		File outputFile = new File("Assets/sortedDictionary.txt");
		//SortFileByLength(inputFile, outputFile);
		GenerateMap(outputFile);
		System.out.print(FindEditDistance("brisk", "brick"));
	}
}
