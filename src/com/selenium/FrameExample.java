package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameExample 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		FirefoxDriver  Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.get("file:///C:/Users/Mazhar/Desktop/SELENIUM/Sudheer/Selenium-20170925T160907Z-001/Selenium/html_files/Frames/Frames.html");
		Driver.switchTo().frame(0);
		WebElement log1 = Driver.findElement(By.name("fname1"));
		log1.clear();
		log1.sendKeys("mazhar1");
		WebElement lasnam = Driver.findElement(By.name("lname1"));
		lasnam.clear();
		lasnam.sendKeys("mazh");
		Thread.sleep(2*1000);
		Driver.switchTo().defaultContent();
		
		Driver.switchTo().frame("fb");
		WebElement fm2 = Driver.findElement(By.name("fname2"));
		fm2.clear();
		fm2.sendKeys("maz");
		Thread.sleep(2*1000);
		Driver.switchTo().defaultContent();
		
		Driver.switchTo().frame("fc");
		WebElement f3 = Driver.findElement(By.name("fname3"));
		f3.clear();
		f3.sendKeys("mm");
		Thread.sleep(2*1000);
		Driver.switchTo().defaultContent();
	
		
		Driver.close();
		
		
		
	}

}
