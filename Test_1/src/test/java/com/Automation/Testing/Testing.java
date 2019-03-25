package com.Automation.Testing;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Automation.BaseTest.BaseTest;
import com.Automation.Pages.HomePage;

public class Testing {
	HomePage home= new HomePage();
	BaseTest base=new BaseTest();
	@BeforeMethod
	public void beforemethod() throws IOException
	{
		base.OpenBrowser("chrome");
		
		
	}
	
	@Test
	  public void testHomePageOpens() throws IOException { 
		  //home.openHome();
		  
		  
		base.geturl();
		  
		  
		 System.out.println("First Test"); 
	  }
	
	
	@AfterMethod
	public void afterMethod() {
		base.afterMethod();
		
	}
	
  
  

}
