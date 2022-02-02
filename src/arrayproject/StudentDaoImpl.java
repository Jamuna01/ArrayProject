package arrayproject;

import java.util.Scanner;

public class StudentDaoImpl
{
	static Student[] addStudents;
	Scanner console = new Scanner(System.in);
	
	//add student information
	public void addStudents()
	{
		System.out.println("How many students are joining: ");
		int size = console.nextInt();
		addStudents = new Student[size];
		
		for(int i = 0; i <addStudents.length;++i)
		{
			System.out.println("Enter Student Number: ");
			int sno = console.nextInt();
			
			System.out.println("Enter Student Name: ");
			String sname = console.next();
			
			System.out.println("Enter Student Address: ");
			String saddress = console.next();
			
			System.out.println("Enter Student Mobile number: ");
			long mobileNumber = console.nextLong();
			
			System.out.println("Enter Student Email: ");
			String email = console.next();
			
			Student student = new Student(sno, sname, saddress, mobileNumber, email);
			
			addStudents[i] = student;
			
			System.out.println("Student " + (i+ 1) + " information registered..");
			
		}
	}

	////Display All Student information
	public Student[] viewAllStudents()
	{
		return addStudents;
	}
	
	//Display specific student information
	public Student viewStudent(int sno)
	{
		if(addStudents != null)
		{
		for(Student stu: addStudents)
		{
			if(stu.getSno() == sno)
			{
				return stu;
			}
		}
		}
		return null;
	}
	
	
}
