package com.tianan.odb.android_pages.carserver;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * 套餐订购页面元素定位, 本页为WEBVIEW
 * 
 * @author: 张豆豆
 * @create: Mar 22, 2017
 */
public class CarServericePackageOrderActivityPages {
  public WebElement odbTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  public WebElement odbBack() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }

  public WebElement odbServicePackageOrder3G() {
	return ConfigurationAndroid.driver.findElementByName("3G 118.00元");
  }

  public WebElement odbServicePackageOrder6G() {
	return ConfigurationAndroid.driver.findElementByName("6G 198.00元");
  }

  public WebElement odbServicePackageOrder12G() {
	return ConfigurationAndroid.driver.findElementByName("12G 398.00元");
  }

  public WebElement odbServicePackageOrder100M() {
	return ConfigurationAndroid.driver.findElementByName("100M 6.00元");
  }

  public WebElement odbServicePackageOrder200M() {
	return ConfigurationAndroid.driver.findElementByName("200M 10.00元");
  }

  public WebElement odbServicePackageOrder300M() {
	return ConfigurationAndroid.driver.findElementByName("300M 12.00元");
  }

  public WebElement odbServicePackageOrder500M() {
	return ConfigurationAndroid.driver.findElementByName("500M 20.00元");
  }

  public WebElement odbServicePackageOrder1G() {
	return ConfigurationAndroid.driver.findElementByName("1G 36.00元");
  }

  public WebElement odbServicePackageOrder6Month() {
	return ConfigurationAndroid.driver.findElementByName("6个月 168.00元");
  }

  public WebElement odbServicePackageOrder12Month() {
	return ConfigurationAndroid.driver.findElementByName("12个月 268.00元");
  }

  public WebElement odbServicePackageOrder24Month() {
	return ConfigurationAndroid.driver.findElementByName("24个月 398.00元");
  }

  public WebElement odbServicePackageOrder36Month() {
	return ConfigurationAndroid.driver.findElementByName("36个月 598.00元");
  }

  public WebElement odbServicePackageOrderBuyNow() {
	return ConfigurationAndroid.driver.findElementByName("立即购买");
  }
  public WebElement odbServicePackageOrderAlipay() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/ll_pay_by_alipay");
  }
  public WebElement odbServicePackageOrderWX() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/ll_pay_by_wx");
  }
  public WebElement odbServicePackageOrderPayBtn() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/become_member_btn");
  }
  
}
