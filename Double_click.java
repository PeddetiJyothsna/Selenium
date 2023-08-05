package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}

	public static void main(String[] args) throws InterruptedException {
		Double_click obj=new Double_click();
		obj.LaunchAUT();

	}

}
