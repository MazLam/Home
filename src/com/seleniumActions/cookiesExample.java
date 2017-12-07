package com.seleniumActions;

import java.util.Date;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cookiesExample 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		 driver  = new FirefoxDriver(); 
			driver.get("https://wordpress.com/");
			
			Set<Cookie> cookies = driver.manage().getCookies();
			for (Cookie cookie :cookies) {
				String name = cookie.getName();
				String value = cookie.getValue();
				String path  = cookie.getPath();
				Date expiry =  cookie.getExpiry();
				String domain = cookie.getDomain();
				System.out.println("........... Printing Cookie info...");
				System.out.println("name:"+ name);
				System.out.println("value:"+ value);
				System.out.println("path:"+ path);
				System.out.println("expiry:"+ expiry);
				System.out.println("domain:"+ domain);
				System.out.println("printing cookie info...end");
				driver.manage().deleteCookieNamed("__qca");
				driver.manage().deleteAllCookies();							
			}
			
		
	}

}
