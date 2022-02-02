package arrayproject;

import java.util.Scanner;

public class RegisterDriver
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		RegisterDetails rd = new RegisterDetails();
		while(true)
		{
			System.out.println("==========WELCOME TO TAKEO==========");
			System.out.println("          1) Register               ");
			System.out.println("          2) Login                  ");
			System.out.println("          3) Exit                   ");
			System.out.println("====================================");
			
			System.out.println("Enter your choice: ");
			int choice = console.nextInt();
			
			switch(choice)
			{
			case 1:
				rd.registerAccount();
				break;
			case 2:
				System.out.println("Enter username: ");
				String uname = console.next();
				
				System.out.println("Enter password: ");
				String pass = console.next();
				if(rd.loginUser(uname, pass))
				{
					System.out.println("Login Success..");
					System.out.println();
					StudentClient sc = new StudentClient();
					sc.main(args);
				}
				else
				{
					System.out.println("Sorry something went wrong..");
				}
				break;
			case 3:
				System.out.println("Thank you for using Takeo App..");
				System.exit(0);
				break;
				default:
					System.out.println("Please make a valid selection..");
			}
		}
	}
}
