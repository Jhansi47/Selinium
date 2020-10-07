package practice;

import java.util.Scanner;

public class Test107
{
	public static void main(String[] args)
	{
		//Get browser name from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String x=sc.nextLine();
		//Create object to utility class
		Testutility obj=new Testutility(); 
		obj.openbrowser(x);
		obj.launch("http://www.gmail.com");
		obj.screenshot();
		obj.closesite(x);
		
		
		
	}

}
