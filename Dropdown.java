package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signup_link")).click();
		Thread.sleep(2000);
	}
	public void Senddata() throws InterruptedException {
		driver.findElement(By.name("UserFirstName")).sendKeys("Java");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.name("UserEmail")).sendKeys("abcde@gmail.com");
		Thread.sleep(2000);
	}
	
	public void dropdown() throws InterruptedException {
		WebElement job=driver.findElement(By.name("UserTitle"));
		Select slcobj=new Select(job);
		slcobj.selectByIndex(3);
		Thread.sleep(2000);
		slcobj.selectByValue("Others_ANZ");
		Thread.sleep(2000);
		slcobj.selectByVisibleText("Student / Job Seeker / Personal Interest");
		Thread.sleep(2000);
		driver.findElement(By.name("CompanyName")).sendKeys("Jyo's Company");
		Thread.sleep(2000);
		
	}
	public void employee() throws InterruptedException {
		WebElement emp=driver.findElement(By.name("CompanyEmployees"));
		Select emps=new Select(emp);
		emps.selectByVisibleText("1 - 25 employees");
		Thread.sleep(2000);
		emps.selectByValue("350");
		Thread.sleep(2000);
		emps.selectByIndex(6);
	}

	public static void main(String[] args) throws InterruptedException {
		Dropdown obj=new Dropdown();
		obj.LaunchAUT();
		obj.Senddata();
		obj.dropdown();
		obj.employee();
		

	}

}
