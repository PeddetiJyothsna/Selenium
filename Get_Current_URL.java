package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_URL {
	WebDriver driver;
	public void launchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void get_current_url() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String exp_url="https://www.Amazon.in/";
		if(url.equalsIgnoreCase(exp_url)) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase fail");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Get_Current_URL obj=new Get_Current_URL();
		obj.launchAUT();
		obj.get_current_url();

	}

}
