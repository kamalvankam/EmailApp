package EmailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName, lastName,department,password;
	private int defaultPasswordLength=8;
	private String email;
	private String companyName= "Cognizant.com";
	int mailBoxCapacity=200;
	private String alternateEmail;
	
	public Email(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		
		this.firstName= firstName;
		this.lastName= lastName;
		System.out.println("EMAIL CREATED: "+this.firstName+ " "+ this.lastName);
		this.department= setDepartment();
		
		System.out.println("Department:"+ this.department);
		
		password= randomPassword(defaultPasswordLength);
		
		System.out.println("Password is :"+ password);
		
		email= firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+"."+companyName;
		System.out.println("The email is :"+ email);
		
		
	}
	
	// setDepartment
	
	private String setDepartment()
	{
		System.out.println("Enter the department code:  \n1 for Sale\n2 for development\n3 for accounting\n4 for none");
		Scanner scan = new Scanner(System.in);
		
		int deparmentChoice= scan.nextInt();
		if(deparmentChoice==1)
		{
			return "Sales";
		}
		else if(deparmentChoice==2)
		{
			return "Development";
		}
		else if(deparmentChoice==3)
		{
			return "Accounting";
		}
		else
		{
			return "";
		}
	}
	
	//set Password Random
	
	private String randomPassword(int length)
	{
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&";
		char password[]= new char[length];
		for(int i=0; i< length; i++)
		{
			int rand= (int)(Math.random()* passwordSet.length());
			password[i]= passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	//setMethods
	
	public void setMailBoxCapacity(int capacity)
	{
		this.mailBoxCapacity= capacity;
	}
	
	public void setAlterEmail(String altEmail) {
		
		this.alternateEmail= altEmail;
	}
	
	public void setPassword(String password)
	{
		this.password= password;
	}
	
	public int getMailCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlterEmail()
	{
		return alternateEmail;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	
	public String showInfo()
	{
		return "Display name: "+ firstName+ lastName+ "\nCompany Email: "+ email+ "\nmailbox capacity:"+ mailBoxCapacity+"mb";
	}

}
