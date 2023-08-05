package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickonElement_SendThedata_JavaScriptExecutor {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void Click_on_Submit() throws InterruptedException {
		jse=((JavascriptExecutor)driver);
		WebElement click=driver.findElement(By.id("Login"));
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();", click);
	}
	public void Senddata() throws InterruptedException {
		jse=((JavascriptExecutor)driver);
		WebElement username=driver.findElement(By.id("username"));
		Thread.sleep(2000);
		jse.executeScript("arguments[0].value='abcd@gmail.com';", username);
	}
	public void Password() throws InterruptedException {
		jse=((JavascriptExecutor)driver);
		WebElement password=driver.findElement(By.id("password"));
		Thread.sleep(2000);
		jse.executeScript("arguments[0].value='123456789';", password);
	}

	public static void main(String[] args) throws InterruptedException {
		ClickonElement_SendThedata_JavaScriptExecutor obj=new ClickonElement_SendThedata_JavaScriptExecutor();
		obj.LaunchAUT();
		obj.Senddata();
		obj.Password();
		obj.Click_on_Submit();

	}

}
