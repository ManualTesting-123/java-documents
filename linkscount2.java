package session2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkscount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://www.amazon.com/");
		obj.manage().window().maximize();
		WebElement link=obj.findElement(By.id("nav-xshop"));
		List<WebElement>links=link.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			
		}
	}

}
