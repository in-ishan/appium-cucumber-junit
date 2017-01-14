package com.aiotoolbox.pages.android.toolbox;

import java.util.List;
import com.aiotoolbox.utils.AppiumFactory;
import io.appium.java_client.android.AndroidElement;

public class ToolboxPage extends AppiumFactory
{	
	private List<AndroidElement> toolboxButtons = null;

		public void clickBatchUninstall()
		{ 
		toolboxButtons = AppiumFactory.driver.findElementsById("imoblife.toolbox.full:id/iv_tool");
		toolboxButtons.get(3).click();
		}
}
