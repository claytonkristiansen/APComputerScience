import java.util.*;
import java.io.*;

public class WordDistance 
{
	static Map<Integer, LinkedList<String>> wordsByLength;
	
	static Map<String, LinkedList<String>> m_map;
	
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
	
	public static Map<String, LinkedList<String>> ReadMapFromFile(BufferedReader input)
	{
		Map<String, LinkedList<String>> map = new TreeMap<String, LinkedList<String>>();
		
		String line;
		try 
		{
			while((line = input.readLine()) != null)
			{
				String key = line.substring(0, line.indexOf("="));
				LinkedList<String> value = new LinkedList<String>();
				String[] strings = line.substring(line.indexOf("=") + 1).split(",");
				for(int i = 0; i < strings.length; i++)
				{
					value.add(strings[i]);
				}
				map.put(key, value);
			}
			input.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return map;
	}
	
	public static Map<String, LinkedList<String>> GenerateMap(File inputFile)
	{
		Map<String, LinkedList<String>> wordMap = new TreeMap<String, LinkedList<String>>();
		Map<Integer, ArrayList<String>> incrementalWordMap = new TreeMap<Integer, ArrayList<String>>(); //Map of every word in increasing size and a list of words of distance 1 away
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
		ArrayList<String> tempArray = new ArrayList<String>();
		for(String word : words)
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
		
		System.out.println(words);
		int k = 0;
		for(Map.Entry<String, LinkedList<String>> s1 : wordMap.entrySet())
		{
			LinkedList<String> list = new LinkedList<String>();
			String key = s1.getKey();
			ArrayList<String> list1 = incrementalWordMap.get(key.length() - 1);
			ArrayList<String> list2 = incrementalWordMap.get(key.length());
			ArrayList<String> list3 = incrementalWordMap.get(key.length() + 1);
			
			if(list1 != null)
			{
				for(int i = 0; i < list1.size(); i++)
				{
					String wordToCompare = list1.get(i);
					if(FindEditDistance(key, wordToCompare) == 1)
					{
						list.add(wordToCompare);
					}
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
			if(list3 != null)
			{
				for(int i = 0; i < list3.size(); i++)
				{
					String wordToCompare = list3.get(i);
					if(FindEditDistance(key, wordToCompare) == 1)
					{
						list.add(wordToCompare);
					}
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
	
	public static LinkedList<String> FindPathRecursively(String word1, String word2, ArrayList<String> wordsChecked) //Breaks because of stack overflow error. Too deep recursion in many cases
	{
		LinkedList<String> path = new LinkedList<String>();
		LinkedList<String> tempPath = new LinkedList<String>();
		
		LinkedList<String> closeWords = m_map.get(word1);
		if(closeWords == null)
		{
			return null;
		}
		if(closeWords.contains(word2))
		{
			tempPath.add(word1);
			return tempPath;
		}
		else
		{
			for(int i = 0; i < closeWords.size(); i++)
			{
				String word = closeWords.get(i);
				if(!wordsChecked.contains(word))
				{
					wordsChecked.add(word);
					if((path = FindPathRecursively(word, word2, wordsChecked)) != null)
					{
						path.add(1, word2);
						return path;
					}
				}
			}
			return null;
		}
//		path.add(0, word1);
//		return path;
	}
	
	public static LinkedList<String> FindPathIteratively(String word1, String word2)
	{
		ArrayList<String> wordsChecked = new ArrayList<String>();
		LinkedList<String> path = new LinkedList<String>();
		LinkedList<String> nestedWords = new LinkedList<String>();
		LinkedList<String> currentList = new LinkedList<String>();
		boolean notChecked = false;
		path.add(word1);
		
		nestedWords.add(word1);
		
		for(;;)
		{
			notChecked = false;
			currentList = m_map.get(word1);
			if(currentList != null) 
			{
				if(currentList.contains(word2))
				{
					nestedWords.add(word2);
					return StreamlinePath(nestedWords);
				}
				for(String s : currentList)
				{
					if(!wordsChecked.contains(s) && FindEditDistance(s, word2) < FindEditDistance(word1, word2))
					{
						wordsChecked.add(s);
						nestedWords.add(s);
						word1 = s;
						notChecked = true;
						break;
					}
				}
			}
			if(!notChecked)
			{
				if(nestedWords.size() >= 2)
				{
					word1 = nestedWords.get(nestedWords.size() - 2);
					nestedWords.removeLast();
				}
				else //Begin second (longer) algorithm check
				{
			//-----------------------------------------------------------------------------------------------------------------------------------------------------//
					wordsChecked = new ArrayList<String>();
					path = new LinkedList<String>();
					nestedWords = new LinkedList<String>();
					currentList = new LinkedList<String>();
					notChecked = false;
					
					path.add(word1);
					
					nestedWords.add(word1);
					
					for(;;)
					{
						notChecked = false;
						currentList = m_map.get(word1);
						if(currentList != null) 
						{
							if(currentList.contains(word2))
							{
								nestedWords.add(word2);
								return StreamlinePath(nestedWords);
							}
							for(String s : currentList)
							{
								if(!wordsChecked.contains(s) && FindEditDistance(s, word2) <= FindEditDistance(word1, word2))
								{
									wordsChecked.add(s);
									nestedWords.add(s);
									word1 = s;
									notChecked = true;
									break;
								}
							}
						}
						if(!notChecked)
						{
							if(nestedWords.size() >= 2)
							{
								word1 = nestedWords.get(nestedWords.size() - 2);
								nestedWords.removeLast();
							}
							else //Begin third (even slower) algorithm check if other two didnt work
							{
			//-----------------------------------------------------------------------------------------------------------------------------------------------------//
								wordsChecked = new ArrayList<String>();
								path = new LinkedList<String>();
								nestedWords = new LinkedList<String>();
								currentList = new LinkedList<String>();
								notChecked = false;
								
								path.add(word1);
								
								nestedWords.add(word1);
								
								for(;;)
								{
									notChecked = false;
									currentList = m_map.get(word1);
									if(currentList != null) 
									{
										if(currentList.contains(word2))
										{
											nestedWords.add(word2);
											return StreamlinePath(nestedWords);
										}
										for(String s : currentList)
										{
											if(!wordsChecked.contains(s))
											{
												wordsChecked.add(s);
												nestedWords.add(s);
												word1 = s;
												notChecked = true;
												break;
											}
										}
									}
									if(!notChecked)
									{
										if(nestedWords.size() >= 2)
										{
											word1 = nestedWords.get(nestedWords.size() - 2);
											nestedWords.removeLast();
										}
										else
										{
											LinkedList<String> errorList = new LinkedList<String>();
											errorList.add("No fast path was found");
											return errorList;
										}
									}
								}
			//-----------------------------------------------------------------------------------------------------------------------------------------------------//
							}
						}
					}
				}
			}
		}
	}
	
	public static LinkedList<String> StreamlinePath(LinkedList<String> list)
	{
		int i = 0, k = 1, j = 2;
		
		for(; i < list.size() && k < list.size() && j < list.size();)
		{
			if(FindEditDistance(list.get(i), list.get(k)) == FindEditDistance(list.get(i), list.get(j)))
			{
				list.remove(k);
			}
			else
			{
				i++;
				k++;
				j++;
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) 
	{
		File inputFile = new File("Assets/WordMap.txt");
		try 
		{
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			m_map = ReadMapFromFile(reader);
			reader.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
//		Map<String, LinkedList<String>> mapo = new TreeMap<String, LinkedList<String>>();
//		mapo.put("apple", value)
		
		ArrayList<String> usedWordsList = new ArrayList<String>();
		String word1 = "plus";
		String word2 = "minus";
		LinkedList<String> testList = FindPathIteratively(word1, word2);
		//testList.add(0, word1);
		System.out.println(testList);
		//File outputFile = new File("Assets/sortedDictionary.txt");
		//SortFileByLength(inputFile, outputFile);
		//GenerateMap(outputFile);
		//System.out.print(FindEditDistance("brisk", "brick"));
	}
}
