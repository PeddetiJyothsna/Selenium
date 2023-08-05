package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Driver {
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}

	public static void main(String[] args) throws InterruptedException {
		Launch_Chrome_Driver obj=new Launch_Chrome_Driver();
		obj.LaunchAUT();
		

	}

}
