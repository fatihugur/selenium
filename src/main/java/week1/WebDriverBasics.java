package week1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverBasics {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\yavuz\\Downloads\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.etsy.com/");
		
		//driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");

	
	
	}

}
