package session2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LINKSCOUNT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
	obj.get("http://demo.guru99.com/test/newtours/");
	obj.manage().window().maximize();
	WebElement link=obj.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
	List<WebElement>links=link.findElements(By.tagName("a"));
	System.out.println(links.size()); //7
	
	for(int i=0;i<links.size();i++)
	{
		System.out.println(links.get(i).getText());
		links.get(i).click();
		
		System.out.println(obj.getTitle());
		System.out.println(obj.getCurrentUrl());
		
		obj.navigate().back();
		link=obj.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		links=link.findElements(By.tagName("a"));
		
		
	}
	}

}

