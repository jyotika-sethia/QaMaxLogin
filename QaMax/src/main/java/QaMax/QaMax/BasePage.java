package QaMax.QaMax;

//import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\sethi\\\\\\\\Desktop\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qa.max.com/");
		driver.manage().window().maximize();	
		Thread.sleep(2000);
		
		JavascriptExecutor scroll =(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.xpath("//h3[text()='United States']"));
		country.click();
		Thread.sleep(2000);
		
		WebElement member =driver.findElement(By.xpath("//li[@class='dropdown']/a"));
		member.click();
		Thread.sleep(2000);
		
		WebElement member1 =driver.findElement(By.xpath("//a[text()='Create your Account.']"));
		member1.click();
		Thread.sleep(2000);
		
		
		
		WebElement member11 = driver.findElement(By.xpath("//button[text()='Shop and Join']"));
		member11.click();		
		Thread.sleep(2000);
		
		WebElement product = driver.findElement(By.id("2981"));
		product.click();		
		Thread.sleep(2000);
		
		WebElement product1 = driver.findElement(By.xpath("//div/child::a[@id='checkout-btn'][1]"));
		product1.click();
		Thread.sleep(2000);
		
		WebElement later = driver.findElement(By.xpath("//button[@id='btn-autoship-disagree']"));
		later.click();
		Thread.sleep(2000);
//		WebElement discount = driver.findElement(By.xpath("//button[@id='btn-autoship-agree']"));
//		discount.click();
		
		WebElement fName = driver.findElement(By.xpath("//div[@id='firstName']/preceding::input[1]"));
		fName.sendKeys("Jyotika");
		Thread.sleep(2000);
		

		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB);
		action.sendKeys("Sethia").build().perform();
		action.sendKeys(Keys.TAB);
		action.sendKeys("jyotikachoraria@gmail.com").build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();	
		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		action.sendKeys(Keys.TAB);
		action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		action.sendKeys(Keys.TAB);
		
//		WebElement number = driver.findElement(By.xpath("//div[@id='phone-number']/preceding::input[1]"));
//		number.sendKeys("9123456789");
//             Thread.sleep(2000);

		action.sendKeys("9133266006").build().perform();
//		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();	
//		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		action.sendKeys(Keys.TAB);
//		action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		action.sendKeys("9133266006").build().perform();
		action.sendKeys(Keys.TAB);
		action.sendKeys(Keys.TAB);
		
		action.sendKeys("Jyoo123").build().perform();
		action.sendKeys(Keys.TAB);
		
		action.sendKeys("Alpha1@3").build().perform();
		action.sendKeys(Keys.TAB);
		
		action.sendKeys("Alpha1@3").build().perform();

		action.sendKeys(Keys.TAB);
		WebElement sponsor=driver.findElement(By.xpath("//p[@class='contain-right1']/a[1]"));
		sponsor.click();
		action.sendKeys(Keys.TAB);
		
//		action.sendKeys(Keys.TAB);
		
		action.sendKeys("Jyotika Sethia").build().perform();
		action.sendKeys(Keys.TAB);
		
		action.sendKeys("4769001082871436").build().perform();
		action.sendKeys(Keys.TAB);
		
		action.sendKeys("1").build().perform();
		action.sendKeys(Keys.TAB);
		
		action.sendKeys("25").build().perform();
		action.sendKeys(Keys.TAB);
		
		action.sendKeys("389").build().perform();
		action.sendKeys(Keys.TAB);
		
		action.sendKeys("13221 Hardy Street").build().perform();
		action.sendKeys(Keys.TAB);
		
		action.sendKeys("Apt 12201").build().perform();
		action.sendKeys(Keys.TAB);
		
		action.sendKeys("Overland Park").build().perform();
		action.sendKeys(Keys.TAB);
		
		action.sendKeys(Keys.TAB);
		
		WebElement dd= driver.findElement(By.xpath("//div[@id='billing-info-state']/preceding::select[1]"));
		Select s= new Select(dd);
		s.selectByValue("KS");
		Thread.sleep(2000);
//		action.sendKeys(Keys.TAB);
		
		JavascriptExecutor down = (JavascriptExecutor)driver;
		down.executeScript("window.scrollBy(0,350)","");
		
		
		
		
//		action.sendKeys("66213").build().perform();
		WebElement code=driver.findElement(By.xpath("//div[@id='billing-info-postal']/preceding::input[1]"));
		code.sendKeys("66213");
		action.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
//		action.click().build().perform();

		WebElement dc= driver.findElement(By.xpath("//label[text()=' I Agree ']"));
		dc.click();
		WebElement dc1= driver.findElement(By.xpath("//input[@id='shipping-details']"));
		dc1.click();
		
		Thread.sleep(2000);
		JavascriptExecutor down1=(JavascriptExecutor)driver;
		down1.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(6000);
		
		WebElement s1 = driver.findElement(By.xpath("//select[@id='ship_method_choice']"));
		Select s2 =new Select(s1);
		s2.selectByValue("14");
//		ship.selectByValue("1049");
//		ship.selectByVisibleText("Next Day Air (34.95)");
//		ship.selectByIndex(2);
		
		JavascriptExecutor down2=(JavascriptExecutor)driver;
		down2.executeScript("window.scrollBy(0,200)","");
		WebElement review =driver.findElement(By.id("review-order-button"));
		review.click();

		Thread.sleep(2000);
		WebElement agree =driver.findElement(By.xpath("//label[text()=' I AGREE ']"));
		agree.click();
		
//		WebElement confirm =driver.findElement(By.id("//button[@id='process-order-button']"));
//		confirm.click();
		
		WebElement cancel =driver.findElement(By.id("cancel-order-button"));
		cancel.click();
		
//		driver.quit();
		
	}

}
