package session2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://www.amazon.com/");
		obj.manage().window().maximize();
	WebElement search=obj.findElement(By.id("searchDropdownBox"));
	List<WebElement>search1=search.findElements(By.tagName("option"));
	System.out.println(search1.size());
	for(int i=0;i<search1.size();i++)
	{
		System.out.println(search1.get(i).getText());
		
	}
	}

}
