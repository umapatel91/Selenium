package com.webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "J:\\Uma_Testing\\Firefox Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		
		if(email.isDisplayed() && email.isEnabled())
		{
			email.sendKeys("test@gmail");
		}
		
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("abcd");
		}
		
		WebElement radiobutton1 = driver.findElement(By.xpath("//*[@id=\"u_0_6\"]"));
		
		if(radiobutton1.isSelected()==false)
		{
			radiobutton1.click();
		}
	}

}
