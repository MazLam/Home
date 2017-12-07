package com.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		FirefoxDriver  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0); // elements are in frame , so we need to swith to frame
		WebElement DragMe = driver.findElement(By.id("draggable")); // source element 
		WebElement DragTarget = driver.findElement(By.id("droppable")); //target element to drop 
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(DragMe, DragTarget);
		Thread.sleep(2*1000);
		actions.perform();
		driver.switchTo().defaultContent();	
		driver.quit();	
	}

}
