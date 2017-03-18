package com.tianan.odb.public_infunction;

import org.openqa.selenium.WebElement;

import com.tianan.odb.configuration_device.ConfigurationAndroid;

import io.appium.java_client.TouchAction;

public class TouchActionUtils {
	private TouchAction tAction = null;
	//点击元素
	public void tap(WebElement element){
		tAction = new TouchAction(ConfigurationAndroid.driver);
		tAction.tap(element).perform();
	}
}
