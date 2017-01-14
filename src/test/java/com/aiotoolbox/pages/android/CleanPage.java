/*
 * Author: ishan.s@outlook.com
 * Created on: January 12, 2017
 * Summary: This class contains objects of clean page and various methods to perform functional operations on the boost feature 
 */

package com.aiotoolbox.pages.android;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.aiotoolbox.utils.AppiumFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CleanPage 
{
	@AndroidFindBy(id="imoblife.toolbox.full:id/toolbar_button2_tv")
	private MobileElement cleanButtonMobileElement;
	
	public CleanPage(){
		PageFactory.initElements(new AppiumFieldDecorator(AppiumFactory.driver, 30, TimeUnit.SECONDS), this);
	}
	
	public void clickOnCleanButton()
	{
		cleanButtonMobileElement.click();
	}

}
