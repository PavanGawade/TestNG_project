package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class seleniumLocators {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=eu");
			driver.findElement(By.id("username")).sendKeys("Dipen");
			driver.findElement(By.name("pw")).sendKeys("asdf");
			driver.findElement(By.id("Login")).click();
			driver.findElement(By.id("error")).getText();
			System.out.println(driver.findElement(By.id("error")).getText());
			//driver.findElement(By.linkText("Forgot Your Password?")).click();
			driver.findElement(By.partialLinkText("Your")).click();
		}


	// Locators Techniques:-
	//id
	//classname
	//name
	//tagname
	//xpath
	//css
	//link text
	//partial link text

	
	

}
