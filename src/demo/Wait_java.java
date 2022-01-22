package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_java {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //applicable to all  scripts
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
			 // explicit wait	
		WebDriverWait obj = new WebDriverWait (driver , Duration.ofSeconds(5));
		obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))); // applicable to scripts on which we use it
				
	
          
}
}

//types of Waits
// impliciot
// explicit
// fluent
/*
 * Fluent Wait Fluent Wait in Selenium is used to define maximum for the web
 * driver to wait for a condition, as well as the frequency with which we want
 * to check the condition before throwing an "ElementNotVisibleException"
 * exception. It checks for the web element at regular intervals until the
 * object is found or timeout happens.
 */
/*
 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) .withTimeout(30,
 * TimeUnit.SECONDS) .pollingEvery(5, TimeUnit.SECONDS)
 */
