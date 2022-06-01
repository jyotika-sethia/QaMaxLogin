package PageObject;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazonpo {
	
	WebDriver driver;
	public Amazonpo(WebDriver driver) {
		this.driver=driver;
	}
	public void enter_value()
	{
		WebElement value = driver.findElement(By.id("twotabsearchtextbox"));
		value.sendKeys("iphone 13");
	}
	public void clickSearch()
	{
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();
	}
	
	public void selectproduct()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		WebElement product = driver.findElement(By.xpath("//span[text()='Apple iPhone 13, 128GB, Blue - Unlocked (Renewed)']"));
		product.click();
	}

	public void addCart()
	{
			
		WebElement cart = driver.findElement(By.xpath("//span[@id='submit.add-to-cart']"));
		cart.click();
	}
}
