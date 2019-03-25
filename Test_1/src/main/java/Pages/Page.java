package Pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Page {

	public void clearText() {

	}

	public void waitForPagetoLoad() {

	}

	public void windowMaximize() {

	}
	public String readState(String key) throws IOException {

		FileReader reader = new FileReader("dataset.properties");

		Properties p = new Properties();
		p.load(reader);

		return (p.getProperty(key));
	}
	
	public void webtable(WebElement table,String state, String month) {

		//driver.switchTo().frame("mainframe");
		//WebElement table = driver.findElement(By.id("mainTable"));

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
}
