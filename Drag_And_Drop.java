package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Dragdrop() throws InterruptedException {
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		actobj=new Actions(driver);
		actobj.dragAndDrop(drag, drop).perform();
		
	}
	public void Countframe() {
		int frame=driver.findElements(By.tagName("iframe")).size();
		System.out.println(frame);
	}

	public static void main(String[] args) throws InterruptedException {
		Drag_And_Drop obj=new Drag_And_Drop();
		obj.LaunchAUT();
		obj.Dragdrop();
		obj.Countframe();

	}

}
