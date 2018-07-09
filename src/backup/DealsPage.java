package backup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsPage {
	
	WebDriver driver;
	
	@Given("^Login to Free CRM$")
	public void Login_to_Free_CRM()  {
		
		driver= new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		
	}
	
	@When("^Providing valid username and password$")
	public void Providing_valid_username_and_password(DataTable credentials) throws Throwable {
	   
	}

	@Then("^Go to deals page , create new deal by entering title, company, and amount$")
	public void Go_to_deals_page_create_new_deal_by_entering_title_company_and_amount(DataTable details) throws Throwable {
	    
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	   
	}

}
