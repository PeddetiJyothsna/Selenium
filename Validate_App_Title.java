package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_App_Title {
	WebDriver driver;
	public void Launch() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();	
		
	}
	public void Validate_title(){
		String act_title=driver.getTitle();
		System.out.println(act_title);
		String exp_title="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(act_title.equals(exp_title)) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase Fail");
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		Validate_App_Title obj=new Validate_App_Title();
		obj.Launch();
		obj.Validate_title();

	}

}
