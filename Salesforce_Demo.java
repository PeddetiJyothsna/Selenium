package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Salesforce_Demo {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Login() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signup_link")).click();
		Thread.sleep(2000);
	}
	public void Start_free_trial() throws InterruptedException {
		driver.findElement(By.name("UserFirstName")).sendKeys("Automation");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.name("UserEmail")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("CompanyName")).sendKeys("ABCDE");
		Thread.sleep(2000);
			
	}
	public void job_title() throws InterruptedException {
		WebElement we=driver.findElement(By.name("UserTitle"));
		Select sel=new Select(we);
		sel.selectByIndex(5);
		Thread.sleep(2000);
		sel.selectByVisibleText("Sales Manager");
		Thread.sleep(2000);
		sel.selectByValue("Personal_Interest_ANZ");
		
	}
	public void employee() throws InterruptedException {
		WebElement web=driver.findElement(By.name("CompanyEmployees"));
		Select sele=new Select(web);
		sele.selectByValue("150");
		Thread.sleep(2000);
		sele.selectByIndex(6);
		Thread.sleep(2000);
		sele.selectByVisibleText("1 - 25 employees");
		Thread.sleep(2000);
		driver.findElement(By.name("UserPhone")).sendKeys("9000000001");
		Thread.sleep(2000);
	}
	public void country() throws InterruptedException {
		driver.findElement(By.className("checkbox-ui")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("start my free trial")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		Salesforce_Demo obj=new Salesforce_Demo();
		obj.LaunchAUT();
		obj.Login();
		obj.Start_free_trial();
		obj.job_title();
		obj.employee();
		obj.country();
		

	}

}
