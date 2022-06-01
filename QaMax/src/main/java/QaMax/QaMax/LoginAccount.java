package QaMax.QaMax;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginAccount {

	WebDriver driver;
		@BeforeMethod
		public void configure() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\sethi\\\\\\\\Desktop\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://qa.max.com/");
		driver.manage().window().maximize();	
		Thread.sleep(2000);
		}
		
		@BeforeMethod
		public void country() throws InterruptedException
		{
		JavascriptExecutor scroll =(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.xpath("//h3[text()='United States']"));
		country.click();
		Thread.sleep(2000);
		}
		
		@Test(dataProvider="information",dataProviderClass=DataProviderInfo.class)
		public void memberLogin(String username,String pass) throws InterruptedException
		{
		WebElement member =driver.findElement(By.xpath("//li[@class='dropdown']/a"));
		member.click();
		Thread.sleep(2000);
		
		WebElement userName =driver.findElement(By.id("myusername"));
		userName.sendKeys(username);
		Thread.sleep(2000);

		WebElement password =driver.findElement(By.id("mypassword"));
		password.sendKeys(pass);
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.id("submit"));
		login.click();
		Thread.sleep(6000);
		
		System.out.println(driver.getTitle());
		}
		
		@AfterMethod
		public void afterLogin()
		{
			driver.quit();
		}
		

	}


