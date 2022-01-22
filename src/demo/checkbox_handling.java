package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox_handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("//input[@value='option1']")).click();
		//driver.findElement(By.xpath("//input[@value='option2']")).click();
		WebElement obj = driver.findElement(By.xpath("//input[@value='option2']"));
		
		
		List<WebElement>obj1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(obj1.size());
		
		/*for(WebElement obj2 : obj1 ) {
			 obj2.click();
			
		}*/
		
		for (int i=0 ; i<obj1.size();i++) {
			 obj1.get(i).click();
			
		}
		
		System.out.println(obj.isSelected());
		System.out.println(obj.isDisplayed());
		System.out.println(obj.isEnabled());
		
}
}
