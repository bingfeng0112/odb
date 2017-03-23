package com.tianan.odb.android_pages.carserver;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * 流量查询页面元素定位
 * 
 * @author: 张豆豆
 * @create: Mar 22, 2017
 */
public class CarServiceGPRSActivityPages {
  public WebElement odbTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  public WebElement odbBack() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }

  /**
   * 
   * @return 购买流量套餐按钮
   */
  public WebElement odbCarServiceGPRSBuy() {
	// return ConfigurationAndroid.driver.findElementByName("购买流量套餐");
	return ConfigurationAndroid.driver
		.findElementByXPath("//android.webkit.WebView/android.view.View[2]/android.view.View");
  }

  /**
   * 
   * @return 流量汇总
   */
  public WebElement odbCarServiceGPRSCount() {
	return ConfigurationAndroid.driver
		.findElementByXPath("//android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View");
  }

  /**
   * 
   * @return 已用流量百分比
   */
  public WebElement odbCarServiceGPRSUseing() {
	return ConfigurationAndroid.driver
		.findElementByXPath("//android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.view.View");
  }
}
