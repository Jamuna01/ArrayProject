//6. Write a java program to reverse an array of integer values.

package ArrayAssignments;

import java.util.Scanner;

public class Question6 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array: ");
		int size = console.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i< size; ++i)
		{
			System.out.println("Enter element " + (i+1) + ": ");
			arr[i] = console.nextInt();
		}
		System.out.println("Entered elements: ");
		for(int i = 0; i<size; ++i)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nReverse value are: ");
		
		for(int j = size -1; j>=0; --j)
		{
			System.out.print(arr[j]  + " ");
		}
	}
	
}
