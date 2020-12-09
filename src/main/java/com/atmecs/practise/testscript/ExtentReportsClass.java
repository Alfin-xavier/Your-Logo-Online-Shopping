package com.atmecs.practise.testscript;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsClass 
{
	public static ExtentHtmlReporter htmlReporter;
	
	public static ExtentReports extent;
	 
	public static ExtentTest test;
	
	public static void main(String[] args) 
	{
		 htmlReporter = new ExtentHtmlReporter(new File("./extendReport.html"));
	        
	     extent = new ExtentReports();
	        
	     extent.attachReporter(htmlReporter);
	     
	     test = extent.createTest("ExtentReportsClass");
		
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		extent.createTest("ExtentReportsClass");
		
		driver.get("https://www.google.com/");
		
		test.log(Status.INFO, "Maximizing window");
		
		driver.manage().window().maximize();
		
		test.log(Status.INFO, "Sending text on searchbox ");
		
		driver.findElement(By.name("q")).sendKeys("extentReport");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		test.log(Status.INFO, "Closing Browser");
		
		extent.flush();
		
		driver.close();
	}

}
