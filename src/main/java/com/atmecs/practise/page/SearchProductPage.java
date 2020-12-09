package com.atmecs.practise.page;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.practise.constants.FilePathConstants;
import com.atmecs.practise.util.Logging;
import com.atmecs.practise.util.PropertyReader;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SearchProductPage 

{
	public ExtentHtmlReporter htmlReporter;
	
	public ExtentReports extent;
	 
	public ExtentTest test;
	
	public WebDriver driver;

	PageMethods helpers;

	Properties locatorsProps;
	
	Logging log;
	
	public SearchProductPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void searchProduct(String product)
	{
		htmlReporter = new ExtentHtmlReporter(new File("./extendReport.html"));

		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);

		test = extent.createTest("SearchProductPage");
		
		helpers = new PageMethods(driver);
		
		log = new Logging();
		
		locatorsProps = PropertyReader.readProperties(FilePathConstants.LOCATORS);
		
		test.log(Status.INFO, "Entering on the search box");
		
		helpers.enterText(locatorsProps.getProperty("searchBox"), product);
		
		test.log(Status.INFO,"Clicking the search button");
		
		helpers.clickSearchButton(locatorsProps.getProperty("searchButton"));
	}
}
