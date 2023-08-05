package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parallel_Execution_Strings {
	WebDriver driver;
	String browser="chrome";
	String browser1="fire";
	public void LaunchAUT() throws InterruptedException {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
				Thread.sleep(2000);
				driver.findElement(By.id("nav-search-submit-button")).click();
				Thread.sleep(2000);
				driver.close();
			}
			if(browser1.equalsIgnoreCase("fire")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.get("https://www.amazon.in/");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
				Thread.sleep(2000);
				driver.findElement(By.id("nav-search-submit-button")).click();
				Thread.sleep(2000);
				driver.close();
			}
	}
			
	

	public static void main(String[] args) throws InterruptedException {
		Parallel_Execution_Strings obj=new Parallel_Execution_Strings();
		obj.LaunchAUT();
		

	}

}
