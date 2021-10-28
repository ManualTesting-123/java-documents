package session2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login12 {
//funcgtion with no return type with parameter 
	
	
	Login12(String Username, String Password)
	
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.manage().window().maximize();
		d.findElement(By.name("txtUsername")).sendKeys(Username);
		d.findElement(By.name("txtPassword")).sendKeys(Password);
		d.findElement(By.name("Submit")).click();
	}
	public static void main(String[] args)
	{
		
		Login12 n1=new Login12("Admin","admin123");
	
		
		
	}

}
