package arrayproject;

import java.util.Scanner;

public class StudentDetails
{
	Scanner console = new Scanner(System.in);
	StudentDaoImpl std = new StudentDaoImpl();
	public void studentMenu()
	{
		while(true)
		{
			System.out.println("===========================");
			System.out.println("=   1) Add Students       =");
			System.out.println("=   2) View All Students  =");
			System.out.println("=   3) View Students      =");
			System.out.println("=   4) Back               =");
			System.out.println("===========================");
			
			System.out.println("Enter the choice: ");
			int choice = console.nextInt();
			
			switch(choice)
			{
			case 1:
				std.addStudents();
				studentMenu();
				
			case 2:
				Student viewStudents[] = std.viewAllStudents();
				System.out.println("===============================");
				System.out.println("SNO \t SNAME \t SADD \t MOBILENUMBER \t EMAIL");
				System.out.println("===============================");
				
				if(viewStudents != null)
				{
				for(Student s: viewStudents)
				{
					System.out.println(s.getSno() + "\t" + s.getSname() + "\t" + s.getSadd() + "\t" + s.getMobileNumber() + "\t" + s.getEmail());
				}
				}
				else
				{
					System.out.println("Student information is not available..");
				}
				studentMenu();
				break;
				
			case 3:
				System.out.println("Enter Student Number : ");
				Student s = std.viewStudent(console.nextInt());
				
				if(s != null)
				{
					System.out.println(s.getSno()  + "\t" + s.getSname() + "\t" + s.getSadd() + "\t" + s.getMobileNumber() + "\t" + s.getEmail());
				}
				else
				{
					System.out.println("Student information is not available..");
				}
				studentMenu();
				break;
				
			case 4: 
				StudentClient.main(null);
				default:
					System.out.println("Sorry input invalid.."
							);
				
				
			}
		}
		
	}
}
