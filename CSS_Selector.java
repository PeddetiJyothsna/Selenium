package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.facebook.com/?login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void senddata() throws InterruptedException {
		driver.findElement(By.cssSelector("#email")).sendKeys("abcde@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("125434681558");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name='login']")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		CSS_Selector obj=new CSS_Selector();
		obj.LaunchAUT();
		obj.senddata();
		

	}

}
