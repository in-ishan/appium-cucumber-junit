package com.aiotoolbox.pages.android;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import com.aiotoolbox.utils.AppiumFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	@AndroidFindBy(uiAutomator="new UiSelector().text(\"Clean\")")
	private MobileElement cleanButtonMobileElement;
	
	@AndroidFindBy(uiAutomator="new UiSelector().text(\"Toolbox\")")
	private MobileElement toolboxMobileElement;
	
	@AndroidFindBy(uiAutomator="new UiSelector().text(\"Boost\")")
	private MobileElement boostButtonMobileElement;
	
	public HomePage(){
		PageFactory.initElements(new AppiumFieldDecorator(AppiumFactory.driver, 30, TimeUnit.SECONDS), this);
	}
	
	public void clickToolbox() throws InterruptedException {
		toolboxMobileElement.click();
	}
	
	public void clickOnCleanButton()
	{
		cleanButtonMobileElement.click();
	}
	
	public void clickOnBoostButton()
	{
		boostButtonMobileElement.click();
	}

}
