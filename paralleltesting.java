package session2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class paralleltesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String browser="Chrome";
switch(browser)
{
case "Chrome" : 
System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("http://www.google.com");
d.manage().window().maximize();
break;

case "IE":
System.setProperty("webdriver.ie.driver","C://IEDriverServer.exe");
InternetExplorerDriver d1=new InternetExplorerDriver();
d1.get("http://www.gmail.com");
d1.manage().window().maximize();
break;

case "firefox":
FirefoxDriver d2=new FirefoxDriver();
d2.get("http://www.amazon.com");
d2.manage().window().maximize();
break;

default: 
	System.out.println("invalid browser");
}


	}

}
