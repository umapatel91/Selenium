package com.headlessbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefoxBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "J:\\Uma_Testing\\Firefox Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
			
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://newtours.demoaut.com/");
		System.out.println("Title of the page: " +driver.getTitle());

	}

}
