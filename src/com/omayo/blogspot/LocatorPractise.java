package com.omayo.blogspot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorPractise
{
 public static void main(String[] args) 
 	{
	 System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.get("http://omayo.blogspot.com/");
	 driver.manage().window().maximize();
	String Title =  driver.getTitle();
	System.out.println("name of this page is :" +Title);
	
	WebElement Homebutton = driver.findElement(By.id("home"));
	Homebutton.click();
	 
	 driver.quit();
	 
	 
	 
	
 	}
}
