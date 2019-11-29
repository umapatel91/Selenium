package com.xpathconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrecedingSiblingXpathExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "J:\\Uma_Testing\\Firefox Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		// How to handle Dynamic WebTable - Checkbox
		
/*		//Method 1:
		//Not Preferable this method as it is lenghty. and also performance wise it is not good.
		//*[@id="example"]/tbody/tr[1]/td[2]
		//*[@id="example"]/tbody/tr[2]/td[2]
		//*[@id="example"]/tbody/tr[3]/td[2]
		
		
		String befor_xpath = "//*[@id='example']/tbody/tr[";
		String after_xpath = "]/td[2]";		
		
		for(int i=1; i<=10; i++)
		{
			String name = driver.findElement(By.xpath(befor_xpath+i+after_xpath)).getText();
			System.out.println(name);
			if(name.contains("Bradley Greer"))
			{
				//Just for example. It will not click bcz there is no link on name
				driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[2]")).click();
			}
		}	*/
		
		//Method 2:
		//Most Preferable this method as it is direct pointing to the element so performance wise it is good.
		driver.findElement(By.xpath("//td[contains(text(),'Bradley Greer')]//parent::tr[@class='even']//td[@class=' select-checkbox']")).click();
		
	
	/*	Example of Preceding siblings:
		//td[contains(text(),'Bradley Greer')]//parent::td//preceding-sibling::td//td[@class=' select-checkbox']
	 */
		
		
	}

}
