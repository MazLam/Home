package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();// creating a object for FirefoxDriver. using driver object i can call all the method in FirefoxDriver
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Mazhar/Desktop/SELENIUM/Sudheer/Selenium-20170925T160907Z-001/Selenium/html_files/Select.html");
		
		WebElement carele = driver.findElement(By.name("cars"));
		Select  slect = new Select(carele);
		slect.selectByIndex(1);
		slect.selectByValue("opelcar");
		slect.selectByVisibleText("Audi");
		
		slect.deselectAll();
		
		
		driver.close();
		
	}

}
