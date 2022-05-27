package dev.romero.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vlad\\Documents\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Hello World");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Hello World2");
		driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
//		driver.findElement(By.cssSelector("input.signinbtn")).click();

		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'div_login_error\']/b")).getText());
		
		
		
//		driver.close();
	}
}
