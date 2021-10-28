package session2;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
String Username;
String Password;

System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("https://opensource-demo.orangehrmlive.com/");
d.manage().window().maximize();

System.out.println("enter the Username:");
Username=sc.next();
d.findElement(By.name("txtUsername")).sendKeys(Username);
System.out.println(Username);
System.out.println("enter the Password");
Password=sc.next();
d.findElement(By.name("txtPassword")).sendKeys(Password);
System.out.println(Password);
Thread.sleep(2000);
if((Username=="Admin") && (Password=="admin123"))
	
{
System.out.println("vaid login");	
d.findElement(By.name("Submit")).click();
}
{
	System.out.println("invalid login");
	d.close();
	
}

	}

}
