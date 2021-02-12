package week3;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) throws InterruptedException{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.xpath("//select[@id='Form_submitForm_Country']//option");
		
		List<WebElement> options = driver.findElements(country);
		
		System.out.println(options.size());
		
		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().equals("Turkey")) {
				options.get(i).click();
			}
		}
		
		// Deselect Example
		// Our deselect didn't work. Because we can only deselect on multiple drop down menus
		// java.lang.UnsupportedOperationException: You may only deselect options of a multi-select
		By industry = By.id("Form_submitForm_Industry");
		
		DropDownHandling.startSelectByValue(driver, industry, "health");
		
		Thread.sleep(4000);
		Select select = new Select(DropDownHandling.getElement(driver, industry));
		select.deselectByValue("health");

	}

}