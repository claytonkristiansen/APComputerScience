
import java.util.*;

enum SORT_BY_TYPE
{
	LAST_NAME,
	FIRST_NAME,
	STUDENT_ID,
	GRADE_PERCENTAGE,
	LETTER_GRADE
}

public class Student 
{
	//Variable Members
	public String m_lastName;
	public String m_firstName;
	public int m_studentID;
	public float m_gradePercentage;
	public String m_letterGrade;
	//Methods
	public String ToString()
	{
		return (m_lastName + ", " + m_firstName + ", " + m_studentID + ", " + m_gradePercentage + ", " + m_letterGrade);
	}
	
	public static <type extends Comparable<type>> ArrayList<type> SortData() //Method that theoretically could sort any ArrayList of any type
	{
		ArrayList<type> listToSort = new ArrayList<type>();
		
		return listToSort;
	}
	
	public Student(String stringInput)
	{
		Scanner reader = new Scanner(stringInput);
		reader.useDelimiter(",");
//		int firstCommaIndex = stringInput.indexOf(0, ',');
		m_lastName = reader.next();
		m_firstName = reader.next().trim();
		m_studentID = Integer.parseInt(reader.next().trim());
		m_gradePercentage = Float.parseFloat(reader.next().trim() + "f");
		m_letterGrade = reader.next().trim();
		reader.close();
		
	}
	
	public static ArrayList<Student> SortStudentData(ArrayList<Student> listToSort, SORT_BY_TYPE sortType)
	{
		ArrayList<Student> sortedList = new ArrayList<Student>();
		
		switch(sortType)
		{
		case LAST_NAME:
			sortedList = SortByLastName(listToSort);
			break;
		case FIRST_NAME:
			sortedList = SortByFirstName(listToSort);
			break;
		case STUDENT_ID:
			sortedList = SortByStudentID(listToSort);
			break;
		case GRADE_PERCENTAGE:
			sortedList = SortByGradePercentage(listToSort);
			break;
		case LETTER_GRADE:
			sortedList = SortByLetterGrade(listToSort);
			break;
		}
		
		return sortedList;
	}
	//To sort by last name:
	private static ArrayList<Student> SortByLastName(ArrayList<Student> listToSort)
	{
		int size = listToSort.size();
		for(int anchor = 0; anchor < size; anchor++)
		{
			for(int compare = anchor + 1; compare < size; compare++)
			{
				if(listToSort.get(compare).m_lastName.compareTo(listToSort.get(anchor).m_lastName) < 0)
				{
					Student anchorStudent = listToSort.get(anchor);
					listToSort.set(anchor, listToSort.get(compare));
					listToSort.set(compare, anchorStudent);
				}
			}
		}
		return listToSort;
	}
	
	//To sort by first name:
	private static ArrayList<Student> SortByFirstName(ArrayList<Student> listToSort)
	{
		int size = listToSort.size();
		for(int anchor = 0; anchor < size; anchor++)
		{
			for(int compare = anchor + 1; compare < size; compare++)
			{
				if(listToSort.get(compare).m_firstName.compareTo(listToSort.get(anchor).m_firstName) < 0)
				{
					Student anchorStudent = listToSort.get(anchor);
					listToSort.set(anchor, listToSort.get(compare));
					listToSort.set(compare, anchorStudent);
				}
			}
		}
		return listToSort;
	}
	
	//To sort by grade percentage:
	private static ArrayList<Student> SortByStudentID(ArrayList<Student> listToSort)
	{
		int size = listToSort.size();
		for(int anchor = 0; anchor < size; anchor++)
		{
			for(int compare = anchor + 1; compare < size; compare++)
			{
				if(listToSort.get(compare).m_studentID < listToSort.get(anchor).m_studentID)
				{
					Student anchorStudent = listToSort.get(anchor);
					listToSort.set(anchor, listToSort.get(compare));
					listToSort.set(compare, anchorStudent);
				}
			}
		}
		return listToSort;
	}
	
	//To sort by grade percentage:
	private static ArrayList<Student> SortByGradePercentage(ArrayList<Student> listToSort)
	{
		int size = listToSort.size();
		for(int anchor = 0; anchor < size; anchor++)
		{
			for(int compare = anchor + 1; compare < size; compare++)
			{
				if(listToSort.get(compare).m_gradePercentage > listToSort.get(anchor).m_gradePercentage)
				{
					Student anchorStudent = listToSort.get(anchor);
					listToSort.set(anchor, listToSort.get(compare));
					listToSort.set(compare, anchorStudent);
				}
			}
		}
		return listToSort;
	}
	
	//To sort by letter grade:
	private static ArrayList<Student> SortByLetterGrade(ArrayList<Student> listToSort)
	{
		int size = listToSort.size();
		for(int anchor = 0; anchor < size; anchor++)
		{
			for(int compare = anchor + 1; compare < size; compare++)
			{
				if(listToSort.get(compare).m_letterGrade.compareTo(listToSort.get(anchor).m_letterGrade) < 0)
				{
					Student anchorStudent = listToSort.get(anchor);
					listToSort.set(anchor, listToSort.get(compare));
					listToSort.set(compare, anchorStudent);
				}
			}
		}
		return listToSort;
	}
	
}
