package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  
		/*//to scroll down the page
		js.executeScript("window.scrollBy(0,600 )");
		Thread.sleep(2000);
		
		//to scroll up on page
		js.executeScript("window.scrollBy(600,0 )");
		Thread.sleep(2000);*/
		
	
		  //This will scroll the page till the element is found		                // This is the best suited method
    //  js.executeScript("arguments[0].scrollIntoView();", "WebElement");
	////button[@id='mousehover']
		WebElement obj=driver.findElement(By.xpath("//button[@id='mousehover']"));
		js.executeScript("arguments[0].scrollIntoView();",obj);
}
}