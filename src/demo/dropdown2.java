package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class dropdown2 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\OneDrive\\Desktop\\Selenium\\chrome driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
			driver.findElement(By.xpath("//a[@text='Pune (PNQ)']")).click();
	        //driver.findElement(By.linkText("Surat (STV)")).click();
	        //driver.findElement(By.linkText("Goa (GOI)")).click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
			driver.findElement(By.xpath("(//a[@text='Udaipur (UDR)'])[2]")).click();
			////a[@text='Udaipur (UDR)']
		}

	}
	//a[@value='STV']
	//div[@id='username_container']//input)[1]
	//li[@class='city_selected ']//a[1]
	//driver.findElement(By.xpath("//li[@class='city_selected ']//a[1]")).click();

	
	

