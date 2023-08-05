package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Enter_and_Escape {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Actions actobj=new Actions(driver);
		actobj.sendKeys(Keys.ESCAPE).perform();
	}
	public void Senddata() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Iphone");
		Thread.sleep(2000);
		actobj=new Actions(driver);
		actobj.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Popularity']")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		Enter_and_Escape obj=new Enter_and_Escape();
		obj.LaunchAUT();
		obj.Senddata();
		

	}

}
