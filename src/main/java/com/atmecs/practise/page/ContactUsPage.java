package com.atmecs.practise.page;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.practise.constants.FilePathConstants;
import com.atmecs.practise.util.Logging;
import com.atmecs.practise.util.PropertyReader;

public class ContactUsPage 
{
	public WebDriver driver;

	ContactUsPageMethods helpers;

	Properties locatorsProps;
	
	Properties datas;
	
	Logging log;
	
	public ContactUsPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void contactUsPage(String mail, String orderRef) throws InterruptedException, IOException
	{
		helpers = new ContactUsPageMethods(driver);
		
		log = new Logging();

		locatorsProps = PropertyReader.readProperties(FilePathConstants.LOCATORS);
		
		log.info("Clicking contactUs");
		
		helpers.clicking(locatorsProps.getProperty("contactUs"));
		
		log.info("Entering Mail");

		helpers.enterText(locatorsProps.getProperty("mail"), mail);
		
		log.info("Entering Order Reference");
		
		helpers.enterText(locatorsProps.getProperty("orderRef"), orderRef);
		
		log.info("Clicking Send Button");
		
		helpers.clicking(locatorsProps.getProperty("sendButton"));

	}
	
}