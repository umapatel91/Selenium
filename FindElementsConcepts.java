package com.findelementsconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsConcepts {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "J:\\Uma_Testing\\Firefox Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		//1. Get total number of links on the page
		
		//all the links are represented by <a> html tag.
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//2. Size of Linklist
		System.out.println("Total Links on the page: " +links.size());		
		
		
		//3. Print all links in console
	/*	for(WebElement i:links)
		{
			System.out.println(i.getText());
		}	*/
		
		//OR use bellow for loop
		
		for(int i=0; i<links.size(); i++)
		{
			String linkText = links.get(i).getText();
			System.out.println(linkText);
			
		}
		
		driver.close();
	}

}
