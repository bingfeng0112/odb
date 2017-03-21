package com.tianan.odb.android_pages;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * 违章查询页面元素定位
 * 
 * @create: Mar 21, 2017
 */
public class CarServiceViolationActivityPages {
  /**
   * @return 标题栏
   */
  public WebElement odbTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  /**
   * @return 返回按钮
   */
  public WebElement odbBack() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }

  /**
   * 传入要选择的省，eg：北京：京北京、河北：冀河北
   * 
   * @param province
   */
  public WebElement odbCarServiceViolationProvinceList(String province) {
	return ConfigurationAndroid.driver.findElementByName(province);
  }

  /**
   * 车牌号码省缩写
   */
  public WebElement odbCarServiceViolationProvinec() {
	return ConfigurationAndroid.driver.findElementByName("粤 Link");
  }

  /**
   * 车牌号输入框
   */
  public WebElement odbCarServiceViolationCarNum() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.view.View[@content-desc='粤 Link']/following::android.view.View[1]/android.widget.EditText");
  }

  /**
   * 发动机输入框
   */
  public WebElement odbCarServiceViolationVIN() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.view.View[@content-desc='粤 Link']/following::android.view.View[3]/android.widget.EditText");
  }

  /**
   * 手机号输入框
   */
  public WebElement odbCarServiceViolationPhoneNum() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.view.View[@content-desc='粤 Link']/following::android.view.View[5]/android.widget.EditText");
  }

  /**
   * 已阅读并同意复选框
   */
  public WebElement odbCarServiceViolationAgree() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.view.View[@content-desc='手机号码']/following::android.view.View[2]/android.view.View[1]/android.widget.CheckBox");
  }

  /**
   * 授权协议
   */
  public WebElement odbCarServiceViolationAgreement() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.view.View[@content-desc='手机号码']/following::android.view.View[2]/android.view.View[2]");
  }

  /**
   * 提交按钮
   */
  public WebElement odbCarServiceViolationSave() {
	return ConfigurationAndroid.driver.findElementByName("提交 Link");
  }
}
