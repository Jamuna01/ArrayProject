//5. Write a Java program to find the maximum and minimum value of an array.

package ArrayAssignments;

import java.util.Scanner;

public class Question5
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array: ");
		int size = console.nextInt();
		int arr[] = new int[size];
		int i;
		int j;
		for(i = 0; i <size; ++i)
		{
			System.out.println("enter number: ");
			arr[i] = console.nextInt();
		}
		System.out.println("listed elements are: ");
		for(j = 0; j<size; ++j)
		{
			
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		maxNumber(arr);
		minNumber(arr);
	}
	public static void maxNumber(int ar[])
	{
		int max = ar[0];
		for(int i = 0; i < ar.length; ++i)
		{
			if(max < ar[i])
			{
				max = ar[i];
				
			}
		}
		System.out.println("Max value is: "+max);
		
	}
	public static void minNumber(int ar[])
	{
		int min = ar[0];
		
		for(int i = 0; i<ar.length; ++i)
		{
			if(min > ar[i])
			{
				min = ar[i];
			}
		}
		System.out.println("Min value is: "+min);
	}
}
