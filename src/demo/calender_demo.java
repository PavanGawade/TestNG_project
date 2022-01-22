package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender_demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//Date box
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		//Month select
		driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).click();
		//wait 1 sec
		//Thread.sleep(1000);
		//Month select
		//Finding month
		List<WebElement> obj2 = driver.findElements(By.xpath(" //span[@class='month']"));
		for (int j = 0; j < obj2.size(); j++) {
			String text2 = obj2.get(j).getText();
			if (text2.equalsIgnoreCase("Apr")) {
				obj2.get(j).click();
			    break;
			}
		}
		
		List<WebElement> obj1 = driver.findElements(By.xpath("//td[@class='day']")); 
		for (int i = 0; i < obj1.size(); i++) {
			String text = obj1.get(i).getText();
			if (text.equalsIgnoreCase("15")) {
				obj1.get(i).click();

			}

		}
			 
		}
	}

