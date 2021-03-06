package dev.romero.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxesExcercise {

	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vlad\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		
		driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//*[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//*[@id='checkBoxOption3']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
		if (driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected())
//			System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
			successMessage();
		else
			errorMessage();
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
		if (driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected())
//			System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
			successMessage();
		else
			errorMessage();
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size() + " checkbox options are available.");
}

private static void errorMessage() {
	System.out.println("Either it is not clicked or we made a mistake!");
}
private static void successMessage() {
	System.out.println("Looks like things worked out buddy! checkbox was clicked!");
}
}
