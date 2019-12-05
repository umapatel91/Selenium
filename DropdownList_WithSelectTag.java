package com.handledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownList_WithSelectTag {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "J:\\Uma_Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		//Select Day by Index
		WebElement day = driver.findElement(By.id("day"));
		Select se = new Select(day);
		
		List<WebElement> total_day = se.getOptions(); //getOptions method will return all the options from dropdown
		int day1 = total_day.size();
		System.out.println("Total day in dropdown:" +day1);
		
		for(WebElement e:total_day)
		{
			System.out.println(e.getText());
		}
		
		WebElement Selectedvalue = se.getFirstSelectedOption();		//getFirstSelectedOption method will retrun first selected vaue from dropdown
		System.out.println("Before Selection: "+Selectedvalue.getText());		
		se.selectByIndex(7);
		WebElement SelectedValue1 = se.getFirstSelectedOption();
		System.out.println("After Selection: "+SelectedValue1.getText());

		//select Month by Value
		WebElement month = driver.findElement(By.id("month"));
		Select se1 = new Select(month);
		WebElement Selectedvalue2 = se1.getFirstSelectedOption();
		System.out.println("Before Selection: "+Selectedvalue2.getText());
		se1.selectByValue("4");
		WebElement Selectedvalue3 = se1.getFirstSelectedOption();
		System.out.println("After Selection: "+Selectedvalue3.getText());
		
		//Select Year by VisibleText
		WebElement year = driver.findElement(By.id("year"));
		Select se2 = new Select(year);
		WebElement Selectedvalue4 = se2.getFirstSelectedOption();
		System.out.println("Before Selection: "+Selectedvalue4.getText());
		se2.selectByVisibleText("2017");
		WebElement Selectedvalue5 = se2.getFirstSelectedOption();
		System.out.println("After Selection: "+Selectedvalue5.getText());
		driver.close();
			
	}

}
