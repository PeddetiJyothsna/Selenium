package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_Alerts {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}

	public static void main(String[] args) throws InterruptedException {
		Custom_Alerts obj=new Custom_Alerts();
		obj.LaunchAUT();
		

	}

}
