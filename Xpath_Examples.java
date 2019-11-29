package com.xpathconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Examples{
	


	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "J:\\Uma_Testing\\Firefox Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://freecrm.com/");
		
		// 1. Click on Sign Up Link using text function
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();	//text() is a function so do not write @
		// 2. Click on button using AND operator
		driver.findElement(By.xpath("//button[@type='submit'][@name='action']")).click();
		// 3. Go back to previous link
		driver.navigate().back();
		driver.navigate().back();
		// 4. Click on Link using attribute
		driver.findElement(By.xpath("//a[contains(@href,'about.html')]")).click();
		// 5. Click on Link using contains method
		driver.findElement(By.xpath("//a[contains(text(),'Compare')]")).click();	//contains is a method, text is a function
		// 6. Click on Link 
		driver.findElement(By.xpath("//div[@class='rd-navbar-nav-wrap toggle-original-elements']//a[text()='Pricing']")).click();  // if found multiple result then use previous div to identify correct xpath
		
		
	}

}
