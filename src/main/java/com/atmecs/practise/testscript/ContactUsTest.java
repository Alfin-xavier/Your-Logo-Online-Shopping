package com.atmecs.practise.testscript;

import org.testng.annotations.Test;
import com.atmecs.practise.page.BasePage;
import com.atmecs.practise.page.ContactUsPage;
import com.atmecs.practise.util.DataProviderClass;

public class ContactUsTest extends BasePage
{

	@Test(dataProvider = "testData", dataProviderClass = DataProviderClass.class)
	public void contactUs(String mail, String orderRef)
	{
		ContactUsPage contactUs = new ContactUsPage(driver);
		
		contactUs.contactUsPage(mail, orderRef);
	}
}
