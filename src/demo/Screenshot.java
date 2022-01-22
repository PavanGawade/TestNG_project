package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//WebElement obj = driver.findElement(By.xpath("//input[@id='name']"));
	WebElement obj = driver.findElement(By.xpath("(//table[@id='product'])[1]"));
	
    File src = obj.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src, new File("C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\Screenshot_selenium\\test.png"));
}
}
