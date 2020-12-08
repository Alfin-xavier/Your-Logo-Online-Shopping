package com.atmecs.practise.testscript;

import java.io.IOException;

import org.testng.annotations.Test;
import com.atmecs.practise.page.BasePage;
import com.atmecs.practise.page.SearchProductPage;
import com.atmecs.practise.util.DataProviderClass;

public class SearchProductTest extends BasePage
{
	@Test(dataProvider = "testData", dataProviderClass= DataProviderClass.class)
	public void searchProduct(String product) throws InterruptedException, IOException
	{
	
		SearchProductPage searchProduct = new SearchProductPage(driver);
		
		searchProduct.searchProduct(product);
		
	}
}
