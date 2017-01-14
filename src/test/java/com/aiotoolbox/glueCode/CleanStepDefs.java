package com.aiotoolbox.glueCode;

import com.aiotoolbox.pages.android.CleanPage;
import com.aiotoolbox.pages.android.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CleanStepDefs 
{
	HomePage hp = new HomePage();
	CleanPage cp = new CleanPage();
	
	@Given("^user is on clean page$")
	public void user_is_on_boost_page()  
	{
	 hp.clickOnCleanButton();      
	}

	@When("^user clicked on clean button$")
	public void user_clicked_on_boost_selected_button()  
	{    
	   cp.clickOnCleanButton();
	}

	@Then("^user should get message system performance is improved$")
	public void user_should_get_message_system_performance_is_improved()  
	{
	       
	}

}
