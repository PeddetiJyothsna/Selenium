package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicity_wait {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void Senddata() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(0));
		WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Try for Free']")));
		we.click();
	}

	public static void main(String[] args) {
		Explicity_wait obj=new Explicity_wait();
		obj.LaunchAUT();
		obj.Senddata();
		

	}

}
