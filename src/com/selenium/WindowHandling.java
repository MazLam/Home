package com.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		FirefoxDriver  Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.online.citibank.co.in/");
		/// pendign due to class video
		
		
	}

}
