package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Get_Screenshot {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Login() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("abcde@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("asdfghjk");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
	}
	public void Screenshot() throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\pedde\\OneDrive\\Desktop\\abcd.jpg");
		FileHandler.copy(src, des);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		Get_Screenshot obj=new Get_Screenshot();
		obj.LaunchAUT();
		obj.Login();
		obj.Screenshot();

	}

}
