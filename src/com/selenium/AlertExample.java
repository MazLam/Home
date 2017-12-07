package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver ();
		driver.get("file:///C:/Users/Mazhar/Desktop/SELENIUM/Sudheer/Selenium-20170925T160907Z-001/Selenium/html_files/APM.html");
		driver.manage().window().maximize();
		
		WebElement promtbox = driver.findElement(By.id("btnPrompt"));
		promtbox.click();
		Thread.sleep(5*1000);
		Alert alert = driver.switchTo().alert();
		String alrttext = alert.getText();
		System.out.println(alrttext + "is below");
		Thread.sleep(5*1000);
		alert.sendKeys("Selenium Tool");
		Thread.sleep(5*1000);
		alert.accept();
		driver.close();
		
		
	
		
		
	}

}
