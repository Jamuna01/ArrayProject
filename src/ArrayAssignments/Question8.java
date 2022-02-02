/*
 * 8. Write a java program to find the duplicate values of an
 * string values.
 */

package ArrayAssignments;

public class Question8 
{
	public static void main(String[] args)
	{
		String[] names = {"Ram", "Shyam", "Gita", "Shyam", "Sita", "Ram"};
		
		System.out.print("Repeated Strings are: ");
		for(int i=0; i<names.length;++i)
		{
			for(int j=(i+1); j<names.length; ++j)
			{
				if(names[i].equals(names[j]) )
				{
					System.out.print(names[i] + " ");
				}
			}
		}
	}
}
