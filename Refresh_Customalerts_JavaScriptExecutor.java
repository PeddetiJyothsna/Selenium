package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh_Customalerts_JavaScriptExecutor {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void Refresh() throws InterruptedException {
		jse=((JavascriptExecutor)driver);
		jse.executeScript("history.go(0);");
		Thread.sleep(3000);
	}
	public void Custom_alerts() throws InterruptedException {
		jse=((JavascriptExecutor)driver);
		jse.executeScript("alert('Welcvome to Amazon');");
		Thread.sleep(3000);
	}

	public static void main(String[] args) throws InterruptedException {
		Refresh_Customalerts_JavaScriptExecutor obj=new Refresh_Customalerts_JavaScriptExecutor();
		obj.LaunchAUT();
		obj.Refresh();
		obj.Custom_alerts();

	}

}
