package stepdefinitons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LoginPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	WebDriver driver;
	static LoginPageObject loginpo;
	
	@Given("I go to QAMAX webpage")
	public void i_go_to_qamax_webpage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\sethi\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\OneDrive\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://qa.max.com/home/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		loginpo = new LoginPageObject(driver);
	}

	@When("I select member login")
	public void i_select_member_login() {
		loginpo.clickMember();
	   
	}

	@Then("I enter data in email field")
	public void i_enter_data_in_email_field() {
	  loginpo.sendUsername();
	}

	@Then("I enter data in password field")
	public void i_enter_data_in_password_field() {
	  loginpo.sendPassword();
	}

	@Then("I click on button")
	public void i_click_on_button() {
		loginpo.clickLogin();
	 
	}

	@Then("i go to home page")
	public void i_go_to_home_page() {
		 String actualtitle= driver.getTitle();
	       String expected="Max International - The Glutathione Company";
	       System.out.println("The current title is"+actualtitle);
	       Assert.assertEquals(actualtitle, expected);
	   
	}

}
