package arrayproject;

import java.util.Scanner;

public class RegisterDetails
{
	static Scanner console = new Scanner(System.in);
	static Register[] createAccount = new Register[1];
	
	public void registerAccount()
	{
		for(int i = 0; i<createAccount.length; ++i)
		{
			System.out.println("Enter first name: ");
			String fname = console.next();
			
			System.out.println("Enter last name: ");
			String lname = console.next();
			
			System.out.println("Enter email id: ");
			String email = console.next();
			
			System.out.println("Enter username: ");
			String uname = console.next();
			
			System.out.println("Enter password: ");
			String pass = console.next();
			
			Register register = new Register(fname, lname, email, uname, pass);
			
			createAccount[i] = register;
			
			System.out.println(fname + " " + lname + ", your account created successfully..");
		}
	}
	
	public boolean loginUser(String user, String pass)
	{
		boolean status = false;
		
		if(createAccount != null)
		{
			for(Register r: createAccount)
			{
				if(user.equals(r.getUname()) && (pass.equals(r.getPassword())))
				{
					status = true;
				}
			}
		}
		return status;
	}
}
