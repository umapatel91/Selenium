package com.xpathconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "J:\\Uma_Testing\\Firefox Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		
		//1. LinkText Locator
		driver.findElement(By.linkText("SUPPORT")).click();
		// 2. Absolute XPath
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		// 3. Relative XPath
		driver.findElement(By.xpath(".//input[@name='firstName']")).sendKeys("Test First Name");
		// 4. CSS Selector (Tag & Attribute combination)
		driver.findElement(By.cssSelector("input[name=lastName]")).sendKeys("Test Last Name");
		// 5. Name Locator
		driver.findElement(By.name("phone")).sendKeys("123456789");
		// 6. CSS Selector (Tag & Id combination)
		driver.findElement(By.cssSelector("input#email")).sendKeys("Test User Name");
		//	7. Use of OR operator
		driver.findElement(By.xpath("//input[@name='userName'or @id='userName']")).sendKeys("test@gmail.com");
		//	8. Use of AND operator
		driver.findElement(By.xpath("//input[@maxlength='60'and @name='address1']")).sendKeys("Test Address");
		//	9. Use of Multiple Attribute
		driver.findElement(By.xpath("//input[@maxlength='60'][@name='city'][@size='15']")).sendKeys("Test City");
		//	10. Xpath Methods: 1) contains() --> This is useful when properties are changing dynamically.
		driver.findElement(By.xpath("//input[contains(@name,'state')]")).sendKeys("Test State");
		//	11. Xpath Methods: 1) starts-with() --> This is useful when properties are changing dynamically.
		driver.findElement(By.xpath("//input[starts-with(@name,'postalCode')]")).sendKeys("382254");

		
		
		
	}

}
