/*
 *  3. Write a Java program to find the index of an array element.
 */

package ArrayAssignments;

import java.util.Scanner;

public class Question3
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 50, 60};
		
		System.out.println("Element you want to know the index of:");
		int element = console.nextInt();
		
		for(int i = 0; i<arr.length; ++i)
		{
			if(element == arr[i])
			{
				System.out.println("Element " + element + " is an index of "+ i);
			}
		}
	}
}
