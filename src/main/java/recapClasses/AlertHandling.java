package recapClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1903");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		alert.accept();
		
		//alert.dismiss();
		// Return back to main frame or window
		// driver.switchTo().defaultContent();
		// driver.findElement(By.name("cusid")).sendKeys("1902");

		driver.switchTo().defaultContent();

	}

}

/*
 package recapClasses;
​
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
​
import io.github.bonigarcia.wdm.WebDriverManager;
​
public class AlertHandling {
​
	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
​
		WebDriver driver = new ChromeDriver();
​
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("1902");
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		
		// Return back to main frame or window
		// driver.switchTo().defaultContent();
		// driver.findElement(By.name("cusid")).sendKeys("1902");
		
	}
​
}
 */
