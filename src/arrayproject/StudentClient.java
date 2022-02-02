package arrayproject;

import java.util.Scanner;

public class StudentClient
{
	
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("=======================");
			System.out.println("=   1) Students       =");
			System.out.println("=   2) Logout         =");
			System.out.println("=======================");
			
			System.out.println("Enter the choice: ");
			int choice = console.nextInt();
			
			switch(choice)
			{
			case 1: 
				StudentDetails sd = new StudentDetails();
				sd.studentMenu();
				break;
				
			case 2: 
				System.out.println();
				RegisterDriver.main(null);
				
				default:
					System.out.println("Please make valid selection..");
				
			}
		}
	}
			
	
}
