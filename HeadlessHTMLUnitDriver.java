package com.headlessbrowsertesting;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHTMLUnitDriver {

	public static void main(String[] args) {

		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://newtours.demoaut.com/");
		System.out.println("Title of the page: " +driver.getTitle());

	}

}
