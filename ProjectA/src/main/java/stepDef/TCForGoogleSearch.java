package stepDef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TCForGoogleSearch {
	@Given("^navigate to Google search$")
	public void navigate_to_Google_search() throws Throwable {
	   System.out.println("i am in Given method ");
	   System.setProperty("Webdriver.driver.chrome", "");
	}

	@When("^enter search keyword$")
	public void enter_search_keyword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^click on First search$")
	public void click_on_First_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	}


