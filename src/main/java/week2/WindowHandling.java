package week2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.findElement(By.id("messageWindowButton")).click();
		//driver.findElement(By.partialLinkText("Knowledge increases by sharing")).click();
		//driver.findElement(By.cssSelector("eid-chrome-extension-is-installed")).getText();
		driver.findElement(By.id("#text")).getText();
		//Alert alert= driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.accept();
		
		
		//String parentWindow = driver.getWindowHandle();
		//System.out.println(parentWindow);
		//Set<String> windowSet = driver.getWindowHandles();
		//System.out.println(windowSet);
		//Iterator<String> windowIterator = windowSet.iterator();
		//while(windowIterator.hasNext()) {
		//	String childWindow = windowIterator.next();
		//	System.out.println(childWindow);
		//	driver.switchTo().window(childWindow);
		}
		///System.out.println(driver.findElement(By.xpath("//div[@id='eid-chrome-extension-is-installed']")).getText());


}
