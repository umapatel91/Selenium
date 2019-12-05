package com.handledropdown;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_WithoutSelectTag_Reducecode {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "J:\\Uma_Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);		

		String day = "//select[@id='day']//option";
		String month = "//select[@id='month']//option";
		String year = "//select[@id='year']//option";
		
		Selectdropdownvalue(day, "13");
		Selectdropdownvalue(month, "May");
		Selectdropdownvalue(year, "1995");

		driver.close();	
		
	}
		
	public static void Selectdropdownvalue(String xpath, String s) {
			
		List<WebElement> element = driver.findElements(By.xpath(xpath));
		
		for(WebElement e :element) {
			if(e.getText().contentEquals(s))
			{
				e.click();
				break;
			}
		}
		
		
		}
	
}
