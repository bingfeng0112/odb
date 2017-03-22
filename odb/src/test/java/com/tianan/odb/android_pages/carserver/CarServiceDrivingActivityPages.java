package com.tianan.odb.android_pages.carserver;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * @author: 张豆豆
 * @create: Mar 21, 2017
 */
public class CarServiceDrivingActivityPages {
  /**
   * 
   * @return
   */
  public WebElement odbTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  /**
   * 
   * @return
   */
  public WebElement odbBackBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }

  /**
   * 
   * @return
   */
  public WebElement odbCarServiceDrivingPhoneNum() {
	return ConfigurationAndroid.driver
		.findElementByXPath("//android.widget.Image/following::android.view.View[1]/android.widget.EditText");
  }

  /**
   * 
   * @return
   */
  public WebElement odbCarServiceDrivingGetVerification() {
	return ConfigurationAndroid.driver
		.findElementByXPath("//android.widget.Image/following::android.view.View[1]/android.widget.Button");
  }

  /**
   * 
   * @return
   */
  public WebElement odbCarServiceDrivingVerificationText() {
	return ConfigurationAndroid.driver
		.findElementByXPath("//android.widget.Image/following::android.view.View[2]/android.widget.EditText");
  }

  /**
   * 
   * @return
   */
  public WebElement odbCarServiceDrivingSubmitBtn() {
	return ConfigurationAndroid.driver.findElementByXPath("//android.widget.Image/following::android.widget.Button");
  }
}
