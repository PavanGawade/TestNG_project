
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathandcssselector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Pavan");
		// driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass@123");
		// parent child traversal if element are dynamic
		driver.findElement(By.cssSelector(" div[id='username_container'] input:nth-child(2)")).sendKeys("Pavan");
		//driver.findElement(By.xpath("(//div[@id='username_container']//input)[1]")).sendKeys("Pavan");
		driver.findElement(By.xpath("(//form[@id='login_form']//input)[22]")).sendKeys("Pass@123");

		
		
		driver.findElement(By.cssSelector("input[id='Login']")).click();
		// div[@id='username_container'] input:nth-child(2)             it is wrong css path
		// div[id='username_container'] input:nth-child(2)
		// Absolute Xpath --it uses complete path from root element---parent-child

		// Relative xpath--You can simply start by referencing the element you want and
		// go from there.---// Relative Xpaths are always preferred as they are not the
		// complete paths from the root element

	}
}

/*
 * input[@id='username'] xpath syntax:
 * 
 * //tagname[@atribute='value']
 * 
 * //input[@id='username']
 * 
 * 
 * 
 * css selector syntax:
 * 
 * tagname[atribute='value']
 * 
 * input[type='email']
 * 
 * 
 * 
 * pink color- tagname and first word red color-attribute blue color-value
 */