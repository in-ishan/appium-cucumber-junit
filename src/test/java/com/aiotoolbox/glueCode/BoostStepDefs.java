package com.aiotoolbox.glueCode;

import com.aiotoolbox.pages.android.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BoostStepDefs 
{
	HomePage hp=new HomePage();
	
	@Given("^user is on boost page$")
	public void user_is_on_boost_page()  {
	      hp.clickOnBoostButton();
	}

	@When("^user clicked on boost button$")
	public void user_clicked_on_boost_button()  {
	    
	    
	}

	@Then("^user should get message system performance is boost$")
	public void user_should_get_message_system_performance_is_boost()  {
	    
	    
	}

}
