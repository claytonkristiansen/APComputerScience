import java.util.Arrays;

public class SelectionSortAlgorithm 
{
	public static int[] SortLargestFirst(int[] integerArray)
	{
		int arrayLength = integerArray.length;
		//int[] sortedArray = new int[arrayLength];
		
		for(int anchor = arrayLength - 1; anchor > 0; --anchor)
		{
			for(int compare = anchor - 1; compare >= 0; --compare)
			{
				if(integerArray[compare] > integerArray[anchor])
				{  
					
					int compareVal = integerArray[compare];
					int anchorVal = integerArray[anchor];
					integerArray[compare] = anchorVal;
					integerArray[anchor] = compareVal;
				}
					
			}
		}
		
		return integerArray;
	}
	public static void main(String[] args) 
	{
		int[] myArray = {87, 3241, 5, 88, 1234, 76, 13, 68, 88, 88, 88, 88, 174, 24, 9875, 67, 98, 345, 90, 322, 54, 3};
		System.out.println("Unsorted: " + Arrays.toString(myArray));
		System.out.println("Sorted:   " + Arrays.toString(SortLargestFirst(myArray)));
	}
}
