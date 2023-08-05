package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parallel_Execution_String {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		String[] browser= {"chrome","edge","fire"};
		for(String browsers:browser) {
			if(browsers.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
				Thread.sleep(2000);
				driver.findElement(By.id("nav-search-submit-button")).click();
				Thread.sleep(2000);
				driver.close();
			}
			else if(browsers.equalsIgnoreCase("fire")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.get("https://www.amazon.in/");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
				Thread.sleep(2000);
				driver.findElement(By.id("nav-search-submit-button")).click();
				Thread.sleep(2000);
				driver.close();
			}
			else if(browsers.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\edgedriver_win64 (1)\\msedgedriver.exe");
				driver=new EdgeDriver();
				driver.get("https://www.amazon.in/");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
				Thread.sleep(2000);
				driver.findElement(By.id("nav-search-submit-button")).click();
				Thread.sleep(2000);
				driver.close();
			}
			else {
				System.out.println("Browser not found");
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		Parallel_Execution_String obj=new Parallel_Execution_String();
		obj.LaunchAUT();

	}

}
