package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ID {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Lacators() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Realme mobile");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		Locator_ID obj=new Locator_ID();
		obj.LaunchAUT();
		obj.Lacators();
		

	}

}
