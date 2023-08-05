package Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gorilla_Testing {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Gorilla testing :");
		int a=sc.nextInt();
		for(int i=0;i<=a;i++) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		Gorilla_Testing obj=new Gorilla_Testing();
		obj.LaunchAUT();
		

	}

}
