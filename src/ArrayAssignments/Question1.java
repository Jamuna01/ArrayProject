/*
 * 1. Write a Java program to calculate the average value of array.
 */
package ArrayAssignments;

import java.util.Scanner;

public class Question1
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int array[] = {98,89,100,450,77}; //can take this input from the user also 
		averageValue(array);
	}
	public static void averageValue(int arr[])
	{
		int sum = 0;
		double average = 0;
		for(int i = 0; i < arr.length; ++i)
		{
			
			sum += arr[i];
		}
		System.out.println("Sum is: " + sum);
		average = sum/arr.length;
		System.out.println("Average is: " + average);
	}
}
