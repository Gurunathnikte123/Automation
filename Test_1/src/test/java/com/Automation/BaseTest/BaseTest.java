package com.Automation.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public static WebDriver driver;

	
	public void OpenBrowser(String browserName) {
		if (browserName == "chrome") {
			System.setProperty("webdriver.ch" + "rome.driver",
					"C:\\DRIVERS\\chromedriver_from_32 and 64 bit_worked for version_v64-66.exe");
		}
createWebDriver();
	}
public void createWebDriver()
{
driver=new ChromeDriver();	
}
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	public static String readUrl() throws IOException {
		FileReader reader = new FileReader("dataset.properties");
		Properties p = new Properties();
		p.load(reader);

		return (p.getProperty("url"));
	}

	public void geturl() throws IOException {
		driver.get(readUrl());
	}

}
