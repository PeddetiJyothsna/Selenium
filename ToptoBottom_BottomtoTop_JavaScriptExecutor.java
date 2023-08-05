package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToptoBottom_BottomtoTop_JavaScriptExecutor {
	WebDriver driver;
	JavascriptExecutor jse;
	public void ScrollTop_Bottom() throws InterruptedException {
		jse=((JavascriptExecutor)driver);
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
	}
	public void ScrollBottom_Top() throws InterruptedException {
		jse=((JavascriptExecutor)driver);
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(2000);
	}
	public void Expected_Scroll() throws InterruptedException {
		jse=((JavascriptExecutor)driver);
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
	}
	public void LaunchAUT() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void main(String[] args) throws InterruptedException {
		ToptoBottom_BottomtoTop_JavaScriptExecutor obj=new ToptoBottom_BottomtoTop_JavaScriptExecutor();
		obj.LaunchAUT();
		obj.ScrollTop_Bottom();
		obj.ScrollBottom_Top();
		obj.Expected_Scroll();

	}

}
