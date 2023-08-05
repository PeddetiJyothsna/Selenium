package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	WebDriver driver;
	public void LaunchAUT() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void Login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("peddetijyothsna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Jyothsna@17");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		}
	public void Search() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mo");
	}

	public static void main(String[] args) throws InterruptedException {
		Instagram obj=new Instagram();
		obj.LaunchAUT();
		obj.Login();
		obj.Search();

	}

}
