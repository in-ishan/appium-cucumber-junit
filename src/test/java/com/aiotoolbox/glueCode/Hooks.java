package com.aiotoolbox.glueCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.aiotoolbox.utils.AppiumFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Hooks 
{
	@AndroidFindBy(id="imoblife.toolbox.full:id/titlebar_back_iv")
	private MobileElement batchUninstallPageBackButtonMobileElement;
	
	@AndroidFindBy(id="imoblife.toolbox.full:id/back_iv")
	private MobileElement backToMainPageButtonMobileElement;
	
	public Hooks(){
		PageFactory.initElements(new AppiumFieldDecorator(AppiumFactory.driver, 30, TimeUnit.SECONDS), this);
	}
	
	
	@After("@ss")
	public void embedScreenshot(Scenario scenario)
	{
		final byte[] screenshot = ((TakesScreenshot) AppiumFactory.driver)
                .getScreenshotAs(OutputType.BYTES);
         scenario.embed(screenshot, "image/png"); 
	}
	
	
	@After("@batch_uninstall")
	public void backToToolboxPage()
	{
		if(batchUninstallPageBackButtonMobileElement.isDisplayed())
			batchUninstallPageBackButtonMobileElement.click();
	}
	
	@After
	public void backToMainPage()
	{
		if(backToMainPageButtonMobileElement.isDisplayed())
			backToMainPageButtonMobileElement.click();
	}

}
