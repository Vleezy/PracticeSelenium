package dev.romero.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vlad\\Documents\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		
//		XPATH
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("I aM TyPiNg HeRe!");
//		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("I aM TyPiNg HeRe!");
//		driver.findElement(By.xpath("//*[@name='login']")).click();

//		CSS
		driver.findElement(By.cssSelector("*[id='email']")).sendKeys("I aM TyPiNg HeRe!");
		driver.findElement(By.cssSelector("*[id='pass']")).sendKeys("I aM TyPiNg HeRe!");
		driver.findElement(By.cssSelector("*[name='login']")).click();

	}
	

}




