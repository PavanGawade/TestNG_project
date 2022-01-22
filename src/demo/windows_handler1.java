package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_handler1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> obj = driver.getWindowHandles(); // Parent window and child window we will get in obj
		Iterator<String> obj1 = obj.iterator(); // to store all windows in obj using iterator
		String ParentWindow = obj1.next();
		String ChildWindow = obj1.next();
		driver.switchTo().window(ChildWindow); // to pass the control to child window
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getCurrentUrl()); // to pass the control to parent window

	}
}
/*
 * Syntax
 * 
 * get.windowhandle(): This method helps to get the window handle of the current
 * window get.windowhandles(): This method helps to get the handles of all the
 * windows opened set: This method helps to set the window handles in the form
 * of a string. set<string> set= driver.get.windowhandles() switch to: This
 * method helps to switch between the windows action: This method helps to
 * perform certain actions on the windows
 */
