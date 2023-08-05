package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction_MoveToElement {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void MoveToElement() throws InterruptedException {
		WebElement we=driver.findElement(By.xpath("//a[text()='Components']"));
		Thread.sleep(2000);
		WebElement src=driver.findElement(By.xpath("//a[text()='Monitors (2)']"));
		Thread.sleep(2000);
		actobj=new Actions(driver);
		actobj.moveToElement(we).moveToElement(src).click().perform();
	}

	public static void main(String[] args) throws InterruptedException {
		MouseOverAction_MoveToElement obj=new MouseOverAction_MoveToElement();
		obj.LaunchAUT();
		obj.MoveToElement();
		

	}

}
