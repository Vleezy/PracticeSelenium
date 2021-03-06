package dev.romero.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vlad\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("Hola Amigos");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 password']")).sendKeys("Testing1234!");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());

		
		
//		xpath= //div[@class='identity first']
//
//			xpath= //*[@class='identity first']
//
//				Css= div[class='identity first']
//						
//						Css= [class='identity first']

	}
}
