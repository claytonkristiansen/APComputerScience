//Clayton Kristiansen
//Goal Sheet 12 "SortStudentData"
//03-29-2019
//AP Computer Science P.1

import java.util.*;
import java.io.*;

public class SortStudentData 
{
	public static void main(String[] args) 
	{
		try
		{
			File inputFile = new File("Assets/StudentData.txt");
			File outputFile = new File("Assets/StudentDataSorted.txt");
			Scanner reader = new Scanner(inputFile);
			reader.useDelimiter("\n");
			OutputStream writer = new FileOutputStream(outputFile);
			
			ArrayList<Student> students = new ArrayList<Student>();
			while(reader.hasNext())
			{
				students.add(new Student(reader.next()));
			}
			for(Student s : students)
			{
				System.out.println(s.ToString());
			}
			Student.SortStudentData(students, SORT_BY_TYPE.GRADE_PERCENTAGE);
			for(Student it : students)
			{
				writer.write((it.ToString() + "\n").getBytes());
			}
			reader.close();
			writer.close();
		}
		catch (FileNotFoundException e) //catch for reader
		{
	        e.printStackTrace();
	    } 
		catch (IOException e) //catch for writer
		{
			e.printStackTrace();
		}
	}

}
