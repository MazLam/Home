package com.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		FirefoxDriver  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement clickButton = driver.findElement(By.xpath("\\span[text()='right click me']"));
		//clickButton. > here there is no method for right click 
		
		//Actions actions = new Actions (driver); // creating action object and passing the driver object
		//actions.contextClick(clickButton);// Passing webElement
		//actions.perform();
		
		// another way of context click 
		Actions actions = new Actions (driver);
		actions.moveToElement(clickButton); // moving to element and then click.
		actions.contextClick();
		actions.build().perform(); // while doing multiple actions , we have to use build.perform method 
		// the purpose of the build is to combine multiple actions in a single actions 	
		
	}

}
