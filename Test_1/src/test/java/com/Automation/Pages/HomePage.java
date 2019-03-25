package com.Automation.Pages;

import java.io.IOException;

import com.Automation.BaseTest.BaseTest;

public class HomePage {
	
	BaseTest base=new BaseTest();
  public String portfolio="/html/body/header/div[2]/div/div/div/nav/div[2]/div[2]/ul/li[5]/a"	;
  public String inflationcalculator="/html/body/header/div[2]/div/div/div/nav/div[2]/div[2]/ul/li[5]/div/ul[2]/li[1]/a";
  public String revenue="/html/body/header/div[2]/div/div/div/nav/div[2]/div[2]/ul/li[5]/div/ul[1]/li[3]/a";
  
  
  public HomePage openHome() throws IOException
  {
	  base.geturl();
	  return new HomePage(); 
  }
  	
}
