package com.atmecs.practise.util;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name = "ContactUs")
	public Object[][] readData(Method method)
	{
		Object[][] data = ReadDataFromExcel.readExcelData(method.getName());
		
		return data;
	}
	
}
