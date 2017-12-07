package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class samplecode 
{
	public static void main(String[] args) throws InterruptedException	
	

	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();	// Creating a driver object to open browser 
		driver.get("https://www.mortgagecalculator.org/"); // loads URL on browser 
		driver.manage().window().maximize();
		String titile = driver.getTitle();
		System.out.println(titile);	
		  WebElement homeValue =  driver.findElement(By.name("param[homevalue]")); // find elements returns WebElement
		  homeValue.clear();
		  homeValue.sendKeys("1000");
		  WebElement lonamount =  driver.findElement(By.name("param[principal]"));
		  lonamount.clear();
		  Thread.sleep(5*1000);
		  
		  lonamount.sendKeys("3000");
		 WebElement month =  driver.findElement(By.name("param[start_month]"));
		 Select  selectmonth = new Select(month);  // we do not have direct method for select box/dropdown, so need to create an object for select class which is imported 
		 selectmonth.selectByIndex(8);
		 //selectmonth.selectByVisibleText("Sep");
		 WebElement year = driver.findElement(By.name("param[start_year]"));
		 Select selyear = new Select(year);
		 selyear.selectByVisibleText("1992");
		  WebElement calbutton =  driver.findElement(By.name("cal"));
		  calbutton.click();
		  WebElement amortlink = driver.findElement(By.linkText("Show Amortization Tables »"));
		  amortlink.click();
		 driver.close();		
	}
}
