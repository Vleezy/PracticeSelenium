package dev.romero.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rp {

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vlad\\Documents\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com/"); //Test was for rp
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("Lango");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("1234qwer");
		driver.findElement(By.xpath("//*[contains(@name,'submit')]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"page-wrap\"]/div[1]/div[1]/div/div/div/div[2]/div[1]/a")).click();
	
		driver.quit();
	}
}
