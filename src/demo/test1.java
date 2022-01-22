package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		// js.executeScript("window.scrollBy(0,2000)");
		System.out.println(driver.getTitle()); // to get the title
		System.out.println(driver.getCurrentUrl()); // to get url

		// driver.navigate().forward();
		// Thread.sleep(1000);
		// driver.navigate().refresh();

		// By using text syntax //tagName(text()='value')]
		driver.findElement(By.xpath("//*[text()='Forgot Your Password?']")).click();
		// We can use * instead of tagName ,if we are not sure which tagName to use..
		// for child -parent traversal syntax xpath /parent::tagName

		// in css child-parent traversal is not possible

		// Interview question - get & navigate difference -: in navigate script might be
		// fail because navigate does not wait till full load
		// close & Quit difference

	}

}
//id         driver.findElement(By.id("username")).sendKeys("Dipen");
//classname  
//name         driver.findElement(By.name("pw"))
//tagname       tagname[atribute='value']
//xpath =   driver.findElement(By.xpath("//a[@text='Pune (PNQ)']"))   
            // driver.findElement(By.xpath("//*[text()='Forgot Your Password?']"))
            //driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))
            //driver.findElement(By.xpath("(//a[@text='Udaipur (UDR)'])[2]"))
            //driver.findElement(By.xpath("(//form[@id='login_form']//input)[22]"))

//css 		driver.findElement(By.cssSelector(" div[id='username_container'] input:nth-child(2)"))

//linktext           //driver.findElement(By.linkText("Surat (STV)")).click();
//partial linktext         driver.findElement(By.partialLinkText("Your")).click();
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