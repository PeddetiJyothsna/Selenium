package Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Expected_application {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter URL:");
		String URL=sc.nextLine();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(URL);
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public static void main(String[] args) throws InterruptedException {
		Expected_application obj=new Expected_application();
		obj.LaunchAUT();
		

	}

}
