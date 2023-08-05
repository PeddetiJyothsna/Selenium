package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_End_To_End {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Search_button() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Refrigerator");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		String child=driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Whirlpool 184 L 2 Star Direct-Cool Single Door Refrigerator (205 WDE CLS 2S SAPPHIRE BLUE-Z, Sapphire Blue,blue,2023 Model)']")).click();
		Thread.sleep(2000);
		Set<String> allwindows=driver.getWindowHandles();
		for(String handle:allwindows) {
			if(!handle.equals(child)) {
				driver.switchTo().window(handle);
				WebElement we=driver.findElement(By.xpath("//select[@id='quantity']"));
				Select select=new Select(we);
				select.selectByValue("2");
				Thread.sleep(2000);
				//driver.findElement(By.id("add-to-cart-button")).click();
				driver.findElement(By.xpath("//a[text()=' Add to Wish List ']")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("ap_email")).sendKeys("abcde@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.id("continue")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("password")).sendKeys("123456789");
				Thread.sleep(2000);
				driver.findElement(By.id("signInSubmit")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("auth-fpp-link-bottom")).click();
				Thread.sleep(2000);
				driver.close();
			}
			
		}
	}
	public void Search() throws InterruptedException {
		//driver.findElement(By.id("twotabsearchtextbox")).clear();
		jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone14");
	}

	public static void main(String[] args) throws InterruptedException {
		Amazon_End_To_End obj=new Amazon_End_To_End();
		obj.LaunchAUT();
		obj.Search_button();
		obj.Search();
		

	}

}
