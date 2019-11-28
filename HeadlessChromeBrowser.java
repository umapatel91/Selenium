package com.headlessbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "J:\\Uma_Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true); 
					//OR
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);		
		driver.get("http://newtours.demoaut.com/");		
		System.out.println("Title of the page: " +driver.getTitle());
		
		
	}

}
