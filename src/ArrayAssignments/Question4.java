//4. Write a java program to remove a specific element from an array.

package ArrayAssignments;

import java.util.Scanner;

//not finished yet
public class Question4 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		int array[] = {35, 45, 25, 98, 6};
		
		System.out.println("Enter the index number to remove an element: ");
		int index = console.nextInt();
		
		for(int i = 0; i<array.length; ++i)
		{
			if(index == i)
			{
				//System.out.println("Index " + index + " is an element of " + array[i]);
				i = array[i];
				
			}
		}
	}
}
