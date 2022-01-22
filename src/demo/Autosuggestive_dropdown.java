package demo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autosuggestive_dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
        Thread.sleep(1000);
        List<WebElement>obj = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
        for (WebElement obj1 : obj) {
        	if (obj1.getText().equalsIgnoreCase("India")) {
        		obj1.click();
        		break;
        	}
        }
        
	}
}
