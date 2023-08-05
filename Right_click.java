package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void rightclick() throws InterruptedException {
		WebElement we=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		actobj=new Actions(driver);
		actobj.contextClick(we).perform();
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		Right_click obj=new Right_click();
		obj.LaunchAUT();
		obj.rightclick();

	}

}
