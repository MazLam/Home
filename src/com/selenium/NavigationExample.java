package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationExample
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	FirefoxDriver  Driver = new FirefoxDriver();
	Driver.manage().window().maximize();
	//Driver.get("http://elearntutorial.blogspot.com/");
	//Driver.navigate().to("http://elearntutorial.blogspot.com/");
	Navigation navigate = Driver.navigate();
	navigate.to("http://elearntutorial.blogspot.com/p/manualtesting.html");
	WebElement manual = Driver.findElement(By.linkText("ManualTesting"));
	manual.click();
	WebElement selenium = Driver.findElement(By.linkText("Selenium"));
	selenium.click();
	navigate.back(); // back to another page ; Driver.navigate().back();
	Thread.sleep(2*1000);
	navigate.forward(); //forward ;Driver.navigate().forward();
	Thread.sleep(2*1000);
	navigate.refresh(); // refresh ; Driver.navigate().refresh();
	Thread.sleep(2*1000);
	Driver.close();

	}	
}
