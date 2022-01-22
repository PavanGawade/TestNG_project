package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(5000);
		driver.switchTo().alert().accept();           // to accept the alert
        //driver.switchTo().alert().dismiss();       // To dismiss the alert
        //driver.switchTo().alert().getText();
		
		
        // to enter any value in alert field following code need to use:
		//driver.switchTo().alert().sendKeys(" value we need to 

}
}
