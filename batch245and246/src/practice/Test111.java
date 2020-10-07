package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test111
{
	public static void main(String[] args) throws Exception
	{
		Sample9 obj=Sample9.create();
		obj.display();
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\batch246\\chromedriver.exe");        
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Locate an element and get size of element
		By b=By.name("q");
		driver.findElement(b).sendKeys("kalam");	
		driver.switchTo().frame(0);
	}
}









