package com.atmecs.practise.page;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPageMethods 
{
	WebDriver driver;
	Properties properties;
	
	public ContactUsPageMethods(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterText(String xpath, String values)
	{
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath(xpath)).sendKeys(values);
	}
	
	public void selectValueFromDropDown(String xpath, String values) throws InterruptedException
	{
		driver.manage().wait(3000);
		Select selectValue = new Select(driver.findElement(By.xpath(xpath)));
		selectValue.selectByValue(values);
	}
	
	public void clicking(String xpath)
	{
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath(xpath)).click();
	}
	
}