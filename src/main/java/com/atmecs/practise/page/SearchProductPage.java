package com.atmecs.practise.page;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.practise.constants.FilePathConstants;
import com.atmecs.practise.util.Logging;
import com.atmecs.practise.util.PropertyReader;

public class SearchProductPage 
{
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
		helpers = new PageMethods(driver);
		
		log = new Logging();
		
		locatorsProps = PropertyReader.readProperties(FilePathConstants.LOCATORS);
		
		log.info("Entering on the search box");
		
		helpers.enterText(locatorsProps.getProperty("searchBox"), product);
		
		log.info("Clicking the search button");
		
		helpers.clickSearchButton(locatorsProps.getProperty("searchButton"));
	}
}
