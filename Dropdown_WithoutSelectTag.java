package com.handledropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_WithoutSelectTag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "J:\\Uma_Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//Bootstrap dropdown handle
		
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		List<WebElement> element = driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]//li//a")); //here we use findelements because this xpath returns multiple element and we want to store all.
		System.out.println(element.size());
		
		for(WebElement e:element)
		{
			System.out.println(e.getText());
			if(e.getText().contentEquals("JavaScript"))
			{
				e.click();
				break;
			}
		}	
		
		//Or use bellow Code
		
/*		for(WebElement e:element)
		{
			String value =e.getAttribute("innerHTML");

			if(value.contentEquals("JavaScript"))
			{
				e.click();
				break;
			}
		} 	*/
		
		driver.close();
		
	}

}
