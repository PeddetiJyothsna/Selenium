package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicity_wait {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void Senddata() throws InterruptedException {
		actobj=new Actions(driver);
		WebElement we=driver.findElement(By.id("twotabsearchtextbox"));
		actobj.sendKeys(we, "Iphone").perform();
		actobj.sendKeys(Keys.DOWN).perform();
		for(int i=0;i<6;i++) {
			actobj.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
		}
		
		actobj.sendKeys(Keys.ENTER).perform();
	}

	public static void main(String[] args) throws InterruptedException {
		Implicity_wait obj=new Implicity_wait();
		obj.LaunchAUT();
		obj.Senddata();

	}

}
