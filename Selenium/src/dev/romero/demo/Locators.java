package dev.romero.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vlad\\Documents\\Selenium\\chromedriver.exe");
	

	
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com");
	
	//Find elements
//	driver.findElement(By.id("email")).sendKeys("Lorem ipsum test script");
	//name
//	driver.findElement(By.name("pass")).sendKeys("Pass123");
	//linkText
//	driver.findElement(By.linkText("Forgot Password?")).click();
	
	driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
	driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("password1");
	
	driver.findElement(By.xpath("//*[@id=\'u_0_a\']/div[3]/a")).click();
	
	}
}
