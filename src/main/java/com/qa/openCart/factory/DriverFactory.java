package com.qa.openCart.factory;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	WebDriver driver;
	public void init_Browser(String browserName)
	{
		System.out.println("browser name is "+browserName);
		
	}
}
