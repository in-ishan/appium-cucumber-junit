package com.aiotoolbox.glueCode.toolbox;

import java.util.List;
import org.junit.Assert;
import com.aiotoolbox.pages.android.HomePage;
import com.aiotoolbox.pages.android.toolbox.BatchUninstallPage;
import com.aiotoolbox.pages.android.toolbox.ToolboxPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BatchUninstallStepDefs {
	
	HomePage hp=new HomePage();
	ToolboxPage tb = new ToolboxPage();
	BatchUninstallPage bu = new BatchUninstallPage();
	private List<List<String>> appNameStringList;
	
	@Given("^user is on batch uninstall page$")
	public void user_is_on_batch_uninstall_page() {
		try
		{
			hp.clickToolbox();
		    tb.clickBatchUninstall();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@When("^user select below apps$")
	public void user_selected_below_apps(DataTable appNameListDataTable) 
	{
		int i=0;
		appNameStringList = appNameListDataTable.raw();
		for(List<String> appNameString:appNameStringList)
		{
			if(i==0)
			{
				i++;
			}
			else
			{
				bu.selectApp(appNameString.get(0).toString());
			}
		}
	}

	@When("^click on uninstall selected button$")
	public void click_on_uninstall_selected_button() 
	{
		bu.clickUninstallSelectedButton();
	}

	@When("^accept all confirmations$")
	public void accept_all_confirmations()  
	{
		bu.acceptConfirmations(appNameStringList.size()-1);
	}

	@Then("^user get uninstall finished message$")
	public void user_get_uninstall_finished_message() 
	{
	   
	}

	@Then("^number of apps selected count is displayed on the uninstall selected button$")
	public void number_of_apps_selected_count_is_displayed_on_the_uninstall_selected_button()  
	{
		Assert.assertTrue(bu.getSelectedAppCount().contains(new Integer(appNameStringList.size()-1).toString()));
	}
}
