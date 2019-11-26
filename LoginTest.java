package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {

		//Firefox not open defined URL when use bellow syntax
		//System.setProperty("webdriver.firefox.marionette", "J:\\Uma_Testing\\Firefox Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
		//Use bellow syntax instead of above
		//1. Open Firefox Browser
		System.setProperty("webdriver.gecko.driver", "J:\\Uma_Testing\\Firefox Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	//Note: Here, Webdriver is a interface and Firfoxdriver is a class.	
		
		//2. Open Chrome Browser
	/*	System.setProperty("webdriver.chrome.driver", "J:\\Uma_Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	*/
		 
		//3. Open Internet Explorer Browser
	/*	System.setProperty("webdriver.ie.driver", "J:\\Uma_Testing\\Internet Explorer Driver\\IEDriverServer_Win32_2.41.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();	*/
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		//driver.findElement(By.name("login")).click(); //For IE browser click event is not working so use bellow event.
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		String expoutput = "Find a Flight: Mercury Tours:";		
		String actoutput = driver.getTitle();
		
		if(expoutput.equals(actoutput))
		{
			System.out.println("Login Successful");
		}else
		{
			System.out.println("Login Failed");
		}
		
		//driver.close(); // Close browser window on which focus is set. This is not working for IE
		driver.quit();		// Close all browser windows and ends webdriver session.
	}

}
