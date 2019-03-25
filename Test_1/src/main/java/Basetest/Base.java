package Basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base {
	public static WebDriver driver;	
	
	
	
	public void OpenBrowser(String browserName) {
		System.setProperty("webdriver.ch" + "rome.driver",
				"C:\\DRIVERS\\chromedriver_from_32 and 64 bit_worked for version_v64-66.exe");
		driver = new ChromeDriver();
	}
	
	public void geturl(String url)
	{
	driver.get(url);	
	}
	
	
	}
