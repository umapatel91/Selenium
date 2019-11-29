package com.xpathconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTextusingDynamicXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "J:\\Uma_Testing\\Firefox Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("testing");
		//descendant is useful for find child of parent. so here, div is a child of li(parent)
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbl1']"));	
		
		System.out.println(+list.size());
		
		for(int i =0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing types"))
			{
				list.get(i).click();
				break;
			}
		}
		driver.close();
		
	}

}
