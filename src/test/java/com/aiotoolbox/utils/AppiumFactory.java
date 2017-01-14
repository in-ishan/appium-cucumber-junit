package com.aiotoolbox.utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumFactory {
	
	public static AppiumDriver<AndroidElement> driver;
	private AppiumDriverLocalService service;
	private DesiredCapabilities dc;
	public static WebDriverWait wait;
	public static TouchAction ta;
	
	public void init() {
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		dc=new DesiredCapabilities();
	    //dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"6.0.1");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi Note 3");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "imoblife.toolbox.full");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "imoblife.toolbox.full.AMain2");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60");
		driver=new AndroidDriver<AndroidElement>(service.getUrl(),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,60);
		ta=new TouchAction(driver);
	}
	
	public void quit() {
		driver.quit();
		service.stop();
	}
}
