//7. Write a java program to find the duplicate values of an array of integer values.

package ArrayAssignments;

public class Question7 
{
	public static void main(String[] args)
	{
		int array[] = {25, 5, 85, 77, 13, 77, 13};
		
		System.out.println("Duplicate values are: ");
		for(int i = 0; i <array.length; ++i)
		{
			for(int j = (i+1); j<array.length; ++j)
			{
				if(array[i] == array[j])
				{
					System.out.print(array[i] + " ");
				}
			}
		}
	}
}
