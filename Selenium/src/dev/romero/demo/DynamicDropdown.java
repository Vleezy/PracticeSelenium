package dev.romero.demo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class DynamicDropdown {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vlad\\Documents\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

driver.get("http://spicejet.com"); //URL in the browser

//  //a[@value='MAA']  - Xpath for chennai

//  //a[@value='BLR']

driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();

driver.findElement(By.xpath("//*[@value='BLR']")).click();

Thread.sleep(2000);

//SOMETHING DOWN HERE ISNT WORKING 1/14/21 11:15AM 
driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_destinationStation1\']")).click();
driver.findElement(By.xpath("(//*[@value='MAA'])[2]")).click();

//driver.findElement(By.xpath("//*[@id=\\'ctl00_mainContent_ddl_destinationStation1\\'] //*[@value='MAA']")).click();

driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

}



}

