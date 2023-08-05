package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_GetSRC_JavaScriptExecutor {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void GetTitle() {
		jse=((JavascriptExecutor)driver);
		String title=jse.executeScript("return document.title").toString();
		System.out.println(title);
	}
	public void GetSRC() {
		jse=((JavascriptExecutor)driver);
		String src=jse.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(src);
	}

	public static void main(String[] args) {
		GetTitle_GetSRC_JavaScriptExecutor obj=new GetTitle_GetSRC_JavaScriptExecutor();
		obj.LaunchAUT();
		obj.GetTitle();
		obj.GetSRC();
	}

}
