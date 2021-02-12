package week4;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPageTest {

	@Test
	public void loginTest() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://twitter.com/login");
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		By username = By.name("session[username_or_email]");
		By pass = By.name("session[password]");
		By loginBtn = By.xpath("//div[@data-testid='LoginForm_Login_Button']");
		By errorMessage = By.xpath("(//div[@class='css-1dbjc4n r-1oy2gb8'])[1]/div/span");
		
		driver.findElement(username).sendKeys("test123");
		driver.findElement(pass).sendKeys("1234567");
		driver.findElement(loginBtn).click();
		
		String actualText = driver.findElement(errorMessage).getText();
		String expectedText = "The username and password you entered did not match our records. Please double-check and try again.";
		
		Assert.assertEquals(expectedText, actualText);
	}
}