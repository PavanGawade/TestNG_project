package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_handling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("http://jqueryui.com/droppable/");
		WebElement obj = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(obj);             // to pass control to frame

       Actions a = new Actions(driver);
       WebElement obj1 = driver.findElement(By.xpath("//div[@id='draggable']"));
       WebElement obj2 = driver.findElement(By.xpath("//div[@id='droppable']"));
       a.dragAndDrop(obj1, obj2).build().perform();          // we are performing chaining of actions thats why we are using build here.        // To get control from frame to
	    driver.switchTo().defaultContent();  //Normal window
	    
}
}