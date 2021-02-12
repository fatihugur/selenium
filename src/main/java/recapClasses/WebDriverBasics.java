package recapClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yavuz\\Downloads\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("Page title is: "+ title);
		// verifying title (Actual Results - Expected Result)
		if(title.equals("Google")){
			System.out.println("Test Passed");
		}else{
			System.out.println("Test Failed");
		}
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.close();//closes the current window
		//driver.quit();//closes all the browser instances
		System.out.println(driver.getCurrentUrl());
		
		// NoSuchSessionException: invalid session id for using methods after close();
		// NoSuchSessionException: Session ID is null. for using methods after quit();
	}

}
