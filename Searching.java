package session2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searching {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://www.amazon.com/");
		obj.manage().window().maximize();
		obj.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		obj.findElement(By.id("twotabsearchtextbox")).sendKeys("harry porter");
		Thread.sleep(2000);
		obj.findElement(By.id("nav-search-submit-button")).click();
		
		
	}

}
