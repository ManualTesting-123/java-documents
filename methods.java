package session2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("http://www.google.com");
		obj.manage().window().maximize();
		Thread.sleep(2000);
		obj.findElement(By.linkText("Gmail")).click();
		
		//capturing the title and url of the click link
		System.out.println(obj.getTitle());
		System.out.println(obj.getCurrentUrl());
		
		obj.navigate().back();//google page
		
		//cpaturing the title and url of the google page
		System.out.println(obj.getTitle());
		System.out.println(obj.getCurrentUrl());
		
		obj.navigate().refresh();
		
		
		obj.navigate().forward();//gamil page
		
		obj.close();
		
	
	
	}
	

}
