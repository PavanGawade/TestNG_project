package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class static_dropdown2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	WebElement obj = driver.findElement(By.xpath("(//select[@id='ctl00_mainContent_DropDownListCurrency'])[1]"));
	Select s = new Select (obj);
    s.selectByIndex(2);
    s.selectByValue("INR");
    s.selectByVisibleText("USD");
    //If we find select tagname then use this
    
	
}
}
