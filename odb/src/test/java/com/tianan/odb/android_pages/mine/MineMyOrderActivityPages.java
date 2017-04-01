package com.tianan.odb.android_pages.mine;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * 我的订单页面元素
 * 
 * @author: 张豆豆
 * @create: Mar 27, 2017
 */
public class MineMyOrderActivityPages {
  public WebElement date() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.TextView[@resource-id='com.tian.obd.android:id/order_common_content_tv2'][1]");
  }

  public WebElement del() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.TextView[@resource-id='com.tian.obd.android:id/order_common_content_right_iv2'][1]");
  }

  public WebElement ok() {
	return ConfigurationAndroid.driver.findElementByName("确定");
  }
}
