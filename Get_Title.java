package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {
	WebDriver driver;
	public void Launch() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void gettitle() {
		String title=driver.getTitle();
		System.out.println(title);
	}

	public static void main(String[] args) throws InterruptedException {
		Get_Title obj=new Get_Title();
		obj.Launch();
		obj.gettitle();
		

	}

}
