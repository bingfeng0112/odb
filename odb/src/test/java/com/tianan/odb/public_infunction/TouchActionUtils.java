package com.tianan.odb.public_infunction;

import com.tianan.odb.configuration_device.ConfigurationAndroid;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;

public class TouchActionUtils {
	private TouchAction tAction = null;
	//点击元素
	public void tap(AndroidElement element){
		tAction = new TouchAction(ConfigurationAndroid.driver);
		tAction.tap(element);
	}
}
