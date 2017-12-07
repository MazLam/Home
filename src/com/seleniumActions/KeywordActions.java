package com.seleniumActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeywordActions 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		FirefoxDriver  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Mazhar/Desktop/SELENIUM/Sudheer/Selenium-20170925T160907Z-001/Selenium/html_files/Select.html");
		
		driver.findElement(By.) // xpath is not working withmy machine 
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL); // for mac it sould be comand i/o controll
		
		
		
		
		driver.close();
		
	}

}
