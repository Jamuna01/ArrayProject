/*
 *  2. Write a Java program to test if an array contains a specific value.
 */
package ArrayAssignments;

import java.util.Scanner;

public class Question2 
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		int value[] = {88, 98, 78, 68, 108};
		
		System.out.println("Enter number to find out if it's contain in an array: ");
		int number = (int) console.nextInt();
		
		findSpecificValue(value, number);
		console.close();
	}
	public static void findSpecificValue(int ar[], int num)
	{
		int size = ar.length;
		boolean status = false;
		for(int i = 0; i <size; ++i)
		{
			if(num == ar[i])
			{
				status = true;
			}
		}
		if(status == true)
		{
			System.out.println("Array contains value of " + num + ".");
		}
		else
		{
			System.out.println("Array doesn't contain value of " + num + ".");
		}
		
		
	}
}
