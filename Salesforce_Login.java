package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Salesforce_Login {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Login() throws InterruptedException {
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signup_link")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("UserFirstName")).sendKeys("Java");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.name("UserTitle")).sendKeys("Tester");
		Thread.sleep(2000);
		driver.findElement(By.linkText("NEXT")).click();
		Thread.sleep(2000);
	
	}
	public void employee() throws InterruptedException {
		WebElement we=driver.findElement(By.name("CompanyEmployees"));
		Select sel=new Select(we);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.linkText("NEXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("UserPhone")).sendKeys("9000000001");
		Thread.sleep(2000);
		driver.findElement(By.name("UserEmail")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("checkbox-ui")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	

	public static void main(String[] args) throws InterruptedException {
		Salesforce_Login obj=new Salesforce_Login();
		obj.LaunchAUT();
		obj.Login();
		obj.employee();
		

	}

}
