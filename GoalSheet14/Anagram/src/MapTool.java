//Clayton Kristiansen
//Goal Sheet 14 "Anagram"
//05-21-2019
//AP Computer Science P.1

import java.io.*;
import java.util.*;

public class MapTool 
{	
	public static Map<String, ArrayList<String>> PrintMapToFile(Map<String, ArrayList<String>> map, File fileOutput)
	{
		try
		{
			FileWriter writer = new FileWriter(fileOutput);
			for(Map.Entry<String, ArrayList<String>> entry : map.entrySet())
			{
				writer.write(entry.getKey() + "=");
				ArrayList<String> list = entry.getValue();
				for(String s : list)
				{
					writer.write(s + ",");
				}
				writer.write("\n");
			}
			writer.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return map;
	}
	
	public static Map<String, ArrayList<String>> ReadMapFromFile(File fileInput)
	{
		Map<String, ArrayList<String>> map = new TreeMap<String, ArrayList<String>>();
		
		String line;
		try 
		{
			BufferedReader input = new BufferedReader(new FileReader(fileInput));
			while((line = input.readLine()) != null)
			{
				String key = line.substring(0, line.indexOf("="));
				ArrayList<String> value = new ArrayList<String>();
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
}
