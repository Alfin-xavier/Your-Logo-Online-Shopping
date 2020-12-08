package com.atmecs.practise.testscript;

import java.io.IOException;
import org.testng.annotations.Test;

import com.atmecs.practise.page.BasePage;
import com.atmecs.practise.page.ContactUsPage;
import com.atmecs.practise.util.DataProviderClass;

public class ContactUsTest extends BasePage
{

	@Test(dataProvider = "ContactUs", dataProviderClass= DataProviderClass.class)
	public void contactUs(String mail, String orderRef)
	{
	
		ContactUsPage frames = new ContactUsPage(driver);
		
		try
		{
			frames.contactUsPage(mail, orderRef);
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
