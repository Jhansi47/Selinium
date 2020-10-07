package practice;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Test103
{
	//Declare global properties
	public WebDriver driver; //object to an interface
	//Define operational methods
	public void openbrowser(String bn) throws Exception
	{
		if(bn.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\batch246\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\batch246\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(bn.equalsIgnoreCase("opera"))
		{
			System.setProperty("webdriver.opera.driver",
					                "E:\\batch246\\operadriver_win64\\operadriver.exe");
			driver=new OperaDriver();
		}
		else if(bn.equalsIgnoreCase("edge"))
		{
			EdgeOptions eo=new EdgeOptions();
			eo.setBinary(
					"C:\\Program Files (x86)\\microsoft\\Edge Beta\\Application\\msedge.exe");
			System.setProperty("webdriver.edge.driver","E:\\batch246\\msedgedriver.exe");
			driver=new EdgeDriver(eo);
		}
		else
		{
			//Set "ie" browser zoom level to exact 100% before running code
			System.setProperty("webdriver.ie.driver","E:\\batch246\\iedriverserver.exe");
			driver=new InternetExplorerDriver();
		}
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}
	public void launch(String url) throws Exception
	{
		driver.get(url);
		Thread.sleep(5000);
	}
	public void closesite(String bn)
	{
		if(bn.equalsIgnoreCase("opera"))
		{
			driver.quit();
		}
		else
		{
			driver.close();
		}
	}
	public void screenshot() throws Exception
	{
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		Date dt=new Date();
		String filename=sf.format(dt)+".png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(filename);
		FileHandler.copy(src, dest);
	}
	public static void main(String[] args) throws Exception
	{
		//Get browser name from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String x=sc.nextLine();
		//Create an object to current class
		Test103 obj=new Test103();
		//Call local methods one after other
		obj.openbrowser(x);
		obj.launch("http://www.gmail.com");
		//Get title and validate it
		String t=obj.driver.getTitle();
		if(t.equals("Gmail"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Testfailed");
			obj.screenshot();
		}
		obj.closesite(x);
	}
}







