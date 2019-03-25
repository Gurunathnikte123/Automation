package Test.Test_1;

import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
	public static WebDriver driver;
	int s = 10;
	int m = 5;

	public void OpenBrowser(String browserName) {
		System.setProperty("webdriver.ch" + "rome.driver",
				"C:\\DRIVERS\\chromedriver_from_32 and 64 bit_worked for version_v64-66.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/#");
		driver.manage().timeouts().pageLoadTimeout(s, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/nav/div[2]/div[2]/ul/li[8]/a")).click();
		
		driver.manage().timeouts().pageLoadTimeout(s, TimeUnit.SECONDS);
		// driver.findElement(By.name("uname")).sendKeys("149354");
		
        //Login in the application
		driver.findElement(By.xpath("//input[@placeholder='Enter ARN']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter ARN']")).sendKeys("149354");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Admin@123");
		
		//Clicking login button link
		driver.findElement(By.xpath("/html/body/div/form/center/div/table/tbody/tr[4]/td/center/button")).click();
		
		//Click on portfolio button
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/nav/div[2]/div[2]/ul/li[5]/a")).click();
		driver.manage().timeouts().pageLoadTimeout(s, TimeUnit.SECONDS);
		
		//Click on inflation calculator link
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/nav/div[2]/div[2]/ul/li[5]/div/ul[2]/li[1]/a")).click();
		driver.manage().timeouts().pageLoadTimeout(s, TimeUnit.SECONDS);
		
		
		
		
		
		
		// driver.quit();
		// driver.close();

		// clicking on the Revenue link
//driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/nav/div[2]/div[2]/ul/li[5]/div/ul[1]/li[3]/a")).click();
	}

	public void webtable(String state, String month) {

		driver.switchTo().frame("mainframe");
		WebElement table = driver.findElement(By.id("mainTable"));

		List<WebElement> rowlist = new ArrayList<WebElement>();
		rowlist = table.findElements(By.tagName("tr"));
		// To print row size
		System.out.println("rows" + rowlist.size());
		int columncount = 0;
		for (int i = 1; i < rowlist.size(); i++) {
			{
				WebElement row = rowlist.get(i);

				List<WebElement> cells = row.findElements(By.tagName("td"));

				for (int m = 0; m < cells.size(); m++) {
					String s;
					s = cells.get(m).getText().toString();
					if (s.equalsIgnoreCase(month)) {
						columncount = m;
						break;

					}

					if (s.equalsIgnoreCase(state)) {
						System.out.println(cells.get(columncount).getText());
					}
				}
			}
		}
	}

	public String readstate() throws IOException {

		FileReader reader = new FileReader("dataset.properties");

		Properties p = new Properties();
		p.load(reader);

		return (p.getProperty("State"));
	}

	public String readmonth() throws IOException {
		FileReader reader = new FileReader("dataset.properties");

		Properties p = new Properties();
		p.load(reader);
		return (p.getProperty("Month"));

	}

	public static void main(String[] args) throws IOException {

		App a = new App();
		a.OpenBrowser("chrome");
		// a.webtable(a.readstate(),a.readmonth());

		System.out.println("Hello World!");
	}
}
