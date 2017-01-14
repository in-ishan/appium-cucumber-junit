package com.aiotoolbox.pages.android.toolbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.aiotoolbox.utils.AppiumFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class BatchUninstallPage extends AppiumFactory {

	@AndroidFindBy(id="imoblife.toolbox.full:id/toolbar_button_tv")
	private MobileElement uninstallSelectedButtonMobileElement;
	
	@AndroidFindBy(id="imoblife.toolbox.full:id/buttonDefaultPositive")
	private MobileElement appConfirmationYesButtonMobileElement;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button1\")")
	private MobileElement osConfirmationOkButtonMobileElement;
	
	@AndroidFindBy(id="imoblife.toolbox.full:id/processList")
	private MobileElement appListMobileElement;
	
	@SuppressWarnings("unused")
	private AndroidElement appScrollerMobileElement;
	private List<MobileElement> appNameContainerList;
	
	public BatchUninstallPage(){
		PageFactory.initElements(new AppiumFieldDecorator(AppiumFactory.driver, 30, TimeUnit.SECONDS), this);
	}

	public void selectApp(String appName) 
	{
		AppiumFactory.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("imoblife.toolbox.full:id/iv_titlebar_right")));
		appScrollerMobileElement =  (AndroidElement) ((AndroidElement) appListMobileElement).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().className(\"android.widget.LinearLayout\").childSelector(new UiSelector().text("+"\""+appName+"\""+")))");
		appNameContainerList = appListMobileElement.findElementsById("imoblife.toolbox.full:id/name_tv");
		int index = 0;
		for(MobileElement ele:appNameContainerList)
		{
			if(ele.getText().equals(appName))
			{
				if(appNameContainerList.size() == appListMobileElement.findElementsById("imoblife.toolbox.full:id/checkbox_cb").size())
				{
					appListMobileElement.findElementsById("imoblife.toolbox.full:id/checkbox_cb").get(index).click();
				}
				else if(appNameContainerList.size() > appListMobileElement.findElementsById("imoblife.toolbox.full:id/checkbox_cb").size())
				{
					appListMobileElement.findElementsById("imoblife.toolbox.full:id/checkbox_cb").get(index+1).click();
				}
				else if(appNameContainerList.size() < appListMobileElement.findElementsById("imoblife.toolbox.full:id/checkbox_cb").size())
				{
					appListMobileElement.findElementsById("imoblife.toolbox.full:id/checkbox_cb").get(index-1).click();
				}
			}
			index++;
		}
	}  //end of selectApp method
	
	public void clickUninstallSelectedButton()
	{
		uninstallSelectedButtonMobileElement.click();
	}
	
	public void acceptConfirmations(int numberOfApps)
	{
		appConfirmationYesButtonMobileElement.click();
		for(int i=0;i<numberOfApps;i++)
			osConfirmationOkButtonMobileElement.click();
	}
	
	public String getSelectedAppCount()
	{
		return uninstallSelectedButtonMobileElement.getText();
	}
	
}
