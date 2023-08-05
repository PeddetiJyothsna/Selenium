package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Positive_And_Negative_Testing {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Negative_Testing(String username,String password) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		Positive_And_Negative_Testing obj=new Positive_And_Negative_Testing();
		obj.LaunchAUT();
		obj.Negative_Testing("abcd@gmail.com", "123456");
		obj.Negative_Testing("XYZ@gmail.com", "159236");
		obj.Negative_Testing("-----123456@$#%", ".<>{}");
		

	}

}
