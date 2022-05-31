package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	WebDriver driver;
	
	
	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
}
	
	

	public void clickMember()
	{
		  WebElement member= driver.findElement(By.xpath("//li[@class='dropdown']/a"));
	      member.click();
	}
	
	public void sendUsername()
	{
		WebElement userName =driver.findElement(By.id("myusername"));
		userName.sendKeys("jyo123");
        
	}
	public void sendPassword()
	{
		WebElement password =driver.findElement(By.id("mypassword"));
		password.sendKeys("Alpha1@3");
	}
	
	
	public void clickLogin() 
	{
		WebElement login = driver.findElement(By.id("submit"));
		login.click();
	}

}
