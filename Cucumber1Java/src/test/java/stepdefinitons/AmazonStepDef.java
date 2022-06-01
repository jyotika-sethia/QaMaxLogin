package stepdefinitons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Amazonpo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class AmazonStepDef {
	
		WebDriver driver;
		 Amazonpo amazonpo;
	
	 @Given("^User go the webpage$")
	    public void user_go_the_webpage() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\sethi\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\OneDrive\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 driver.manage().window().maximize();
		 amazonpo = new Amazonpo(driver);
	    }

	    @Then("^User enter value in search box$")
	    public void user_enter_value_in_search_box() throws Throwable {
	    	amazonpo.enter_value();
	    	Thread.sleep(2000);
	       
	    }

	    @And("^User click on search$")
	    public void user_click_on_search() throws Throwable {
	       amazonpo.clickSearch();
	       Thread.sleep(2000);
	    }
	    
	    @Then("^user select a product$")
	    public void user_select_a_product() throws Throwable {
	       amazonpo.selectproduct();
	       Thread.sleep(2000);
	    }

	    @Then("^user click add to cart$")
	    public void user_click_add_to_cart() throws Throwable {
	    	amazonpo.addCart();
	    	Thread.sleep(2000);
	    }

	 


}
