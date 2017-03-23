package com.tianan.odb.android_pages.carserver;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * 代驾服务页面元素定位
 * @author: 张豆豆
 * @create: Mar 21, 2017
 */
public class CarServiceDrivingActivityPages {
  /**
   * 
   * @return 标题栏
   */
  public WebElement odbTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  /**
   * 
   * @return 返回按钮
   */
  public WebElement odbBackBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }

  /**
   * 
   * @return 手机号码
   */
  public WebElement odbCarServiceDrivingPhoneNum() {
	return ConfigurationAndroid.driver
		.findElementByXPath("//android.widget.Image/following::android.view.View[1]/android.widget.EditText");
  }

  /**
   * 
   * @return 获取验证码按钮
   */
  public WebElement odbCarServiceDrivingGetVerification() {
	return ConfigurationAndroid.driver
		.findElementByXPath("//android.widget.Image/following::android.view.View[1]/android.widget.Button");
  }

  /**
   * 
   * @return 验证码输入框
   */
  public WebElement odbCarServiceDrivingVerificationText() {
	return ConfigurationAndroid.driver
		.findElementByXPath("//android.widget.Image/following::android.view.View[2]/android.widget.EditText");
  }

  /**
   * 
   * @return 提交按钮
   */
  public WebElement odbCarServiceDrivingSubmitBtn() {
	return ConfigurationAndroid.driver.findElementByXPath("//android.widget.Image/following::android.widget.Button");
  }
}
