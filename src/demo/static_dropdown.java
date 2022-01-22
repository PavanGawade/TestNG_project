package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class static_dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//*[@text='Ahmedabad (AMD)']")).click();
        //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
        //driver.findElement(By.xpath("//input[@selectedtext='Goa (GOI)']")).click();
        
        // to clear input 
        driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).clear();
	
	}
}