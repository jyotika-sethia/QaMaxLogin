package stepdefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginPage;

public class LoginStepDef {
		WebDriver driver;
		public LoginPage loginpage=new LoginPage();

		@Given("^I got to QaMax$")
	    public void i_got_to_qamax() {
			System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\sethi\\\\\\\\Desktop\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
			driver= new ChromeDriver();
			System.getProperty("https://qa.max.com/home/");
			driver.manage().window().maximize();
	    }

	    @When("^I click member login$")
	    public void i_click_member_login() {
	        loginpage.clickMember();
	    }

	    @Then("^I enter valid username $")
	    public void i_enter_valid_username() {
	    	loginpage.sendUsername();
	    }

	    @And("^I enter valid password$")
	    public void i_enter_valid_password() {
	    	loginpage.sendPassword();
     
	    }
	    
	    @Then("^I click on Login button$")
	    public void i_click_on_login_button() {
		
			loginpage.clickLogin();
			
	    }

	    @Then("^I go to the home page$")
	    public void i_go_to_the_home_page() {
	       String actualtitle= driver.getTitle();
	       String expected="Max International - The Glutathione Company";
	       System.out.println("The current title is"+actualtitle);
	       Assert.assertEquals(actualtitle, expected);
	    }

	   


}
