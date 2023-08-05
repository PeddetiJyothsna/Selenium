package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_the_Data {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void SendKeys() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("abcde@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(4000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Send_the_Data obj=new Send_the_Data();
		obj.LaunchAUT();
		obj.SendKeys();
		

	}

}
