package week3;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By employee = By.id("Form_submitForm_NoOfEmployees");
		By industry = By.id("Form_summitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		//WebElement element1 = driver.findElement(employee);
		//WebElement element2 = driver.findElement(industry);
		//Select select = new Select(element1);
		//select.selectByVisibleText("401-450");
		//select.selectByValue("401-450");
		//startSelectByVisibleText(driver, employee, "401 - 450");
		
		selectDropDownType(driver, employee, "index", "6");
		selectDropDownType(driver, industry, "visibleText", "Healthcare");
		selectDropDownType(driver, country, "value", "Turkey");

	}
	
	public static WebElement getElement(WebDriver driver, By locator){
		return driver.findElement(locator);
	}
	public static void startSelectByVisibleText(WebDriver driver, By locator, String value){
		Select select= new Select(getElement(driver, locator));
		select.selectByVisibleText(value);
		
	}
	
	public static void startSelectByValue(WebDriver driver, By locator, String value) {
		Select select = new Select(getElement(driver, locator));
		select.selectByValue(value);
	}
	public static void startSelectByIndex(WebDriver driver, By locator, int number) {
		Select select = new Select(getElement(driver, locator));
		select.selectByIndex(number);
	}
	public static void selectDropDownType(WebDriver driver, By locator, String type, String value){
		Select select = new Select(getElement(driver, locator));
		
		switch (type) {
		case "index":
			select.selectByIndex(0);
			break;
			
		case "visibleText":
			select.selectByVisibleText(value);
			break;
			
		case "value":
			select.selectByValue(value);
			break;

		default:
			System.out.println("No drop down selection");
			break;
		}
	}
	

}

/*
 package week3;
​
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
​
import io.github.bonigarcia.wdm.WebDriverManager;
​
public class DropDownHandling {
​
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
​
		By employee = By.id("Form_submitForm_NoOfEmployees");
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
//		WebElement element1 = driver.findElement(employee);
//		WebElement element2 = driver.findElement(industry);
		
		// Select select = new Select(element1);
		// select.selectByVisibleText("401 - 450");
		// select.selectByValue("401 - 450");
//		startSelectByVisibleText(driver, employee, "401 - 450");
		
		selectDropDownType(driver, employee, "index", "6");
		selectDropDownType(driver, industry, "visibleText", "Healthcare");
		selectDropDownType(driver, country, "value", "Turkey");
		
	}
	
	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}
	
	public static void startSelectByVisibleText(WebDriver driver, By locator, String value) {
		Select select = new Select(getElement(driver, locator));
		select.selectByVisibleText(value);
	}
	
	public static void startSelectByValue(WebDriver driver, By locator, String value) {
		Select select = new Select(getElement(driver, locator));
		select.selectByValue(value);
	}
	
	public static void startSelectByIndex(WebDriver driver, By locator, int number) {
		Select select = new Select(getElement(driver, locator));
		select.selectByIndex(number);
	}
	
	public static void selectDropDownType(WebDriver driver, By locator, String type, String value) {
		Select select = new Select(getElement(driver, locator));
		
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
			
		case "visibleText":
			select.selectByVisibleText(value);
			break;
			
		case "value":
			select.selectByValue(value);
			break;
			
		default:
			System.out.println("No drop down selection");
			break;
		}
		
		
	}
	
​
}
*/
