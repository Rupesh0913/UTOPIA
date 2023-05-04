package com.masai.Online_Sweet_Mart;

import java.util.Scanner;

/**
 * Hello world!
 * sweetmartConnect
 */
public class App 
{
	static void adminLogin(Scanner sc) {
		System.out.print("Enter Your User Name: " );
		String userName = sc.next();
		System.out.print("Enter Password: " );
		String Password = sc.next();
		
		if(userName.equals("admin") && Password.equals("admin"))
			adminDashboard();
		else
		{
			System.out.println("wrong Credentials");
		    
		    
		}
	}
	static void adminDashboard() {
		System.out.println("********************Welcome to Dashboard Admin********************");
		char choice = '0';
		do {
			
		}while(choice !=0 );
	}
	
	
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("******************  Welcome to  The Sweet Spot  ******************");
        char choice = '0';
        do {
        	System.out.println("1. Admin Login");
        	System.out.println("2. User Login");
        	System.out.println("3. User SignUp");
        	System.out.println("0. Exit");
        	System.out.println();
        	System.out.print("Enter Your Choice: ");

        		choice =sc.next().charAt(0);

        		switch(choice)
            	{
            		case '1':
            			 adminLogin(sc);
            			break;
            		case '2':
//            			customerLogin(sc);
            			break;
            		case '3':
//            			customerSignUp(sc);
            			break;
            		case '0':
            			System.out.println("Thanks for visiting");
            		default:
            			System.out.println("Wrong input");
            	}
        	
        }while(choice !=0);
        
    }
}
