package dev.romero.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vlad\\Documents\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	
	//Find elements
	driver.findElement(By.id("username")).sendKeys("hello");
	//name
	driver.findElement(By.name("pw")).sendKeys("Pass123");
	//xpath
	
	// "//*[@id=\'Login\']"  == have to take out double quotes from inside 
	//                          and turn to single to use in selenium.
	driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	
	
	System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());	
	}
}
