package com.handledropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownList_WithSelectTag_Dynamic {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "J:\\Uma_Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String dob = "10-May-1991";
		String dobarray[] = dob.split(dob);
		
		selectvaluefromdropdown(day, dobarray[0]);
		selectvaluefromdropdown(month, dobarray[1]);
		selectvaluefromdropdown(year, dobarray[2]);
	}
	
	public static void selectvaluefromdropdown(WebElement element, String s)
	{
		Select value = new Select(element);
		value.selectByVisibleText(s);
		
	}

}
