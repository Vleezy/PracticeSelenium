package dev.romero.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vlad\\Documents\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:///google.com");
		
		//Validating Title + Url
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//Print Page Source
//		System.out.println(driver.getPageSource());
		
		driver.get("https://yahoo.com");
		
		//Navigate
		driver.navigate().back();
		driver.navigate().forward();
		
		//close current window
		driver.close();
		//closes all browsers
		driver.quit();
	}
	
}
