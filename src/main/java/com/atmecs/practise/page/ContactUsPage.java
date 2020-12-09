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

public class ContactUsPage 
{
	public ExtentHtmlReporter htmlReporter;
	
	public ExtentReports extent;
	 
	public ExtentTest test;
	
	public WebDriver driver;

	PageMethods helpers;

	Properties locatorsProps;
	
	Logging log;
	
	public ContactUsPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void contactUsPage(String mail, String orderRef) 
	{
		htmlReporter = new ExtentHtmlReporter(new File("./extendReport.html"));

		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);

		test = extent.createTest("ContactUsTest");
		
		helpers = new PageMethods(driver);
		
		log = new Logging();

		locatorsProps = PropertyReader.readProperties(FilePathConstants.LOCATORS);
		
		test.log(Status.INFO,"Clicking contactUs");
		
		helpers.clicking(locatorsProps.getProperty("contactUs"));
		
		test.log(Status.INFO,"Entering Mail");

		helpers.enterText(locatorsProps.getProperty("mail"), mail);
		
		test.log(Status.INFO,"Entering Order Reference");
		
		helpers.enterText(locatorsProps.getProperty("orderRef"), orderRef);
		
		test.log(Status.INFO,"Clicking Send Button");
		
		helpers.clicking(locatorsProps.getProperty("sendButton"));
		
	}
	
}