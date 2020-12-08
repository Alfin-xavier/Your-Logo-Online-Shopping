package com.atmecs.practise.testscript;

import java.io.IOException;
import org.testng.annotations.Test;

import com.atmecs.practise.page.BasePage;
import com.atmecs.practise.page.ContactUsPage;
import com.atmecs.practise.util.DataProviderClass;

public class ContactUsTest extends BasePage
{

	@Test(dataProvider = "testData", dataProviderClass= DataProviderClass.class)
	public void contactUs(String mail, String orderRef)
	{
	
		ContactUsPage contactUs = new ContactUsPage(driver);
		
		try
		{
			contactUs.contactUsPage(mail, orderRef);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
