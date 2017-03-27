package com.tianan.odb.android_pages.carserver;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * 紧急救援页面元素定位
 * 
 * @author: 张豆豆
 * @create: Mar 27, 2017
 */
public class CarServiceRescueActivityPages {
  /**
   * @return 标题栏
   */
  public WebElement odbCarServiceTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  /**
   * @return 返回按钮
   */
  public WebElement odbCarServiceBackBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }

  /**
   * 保险 —— 阳光保险
   */
  public WebElement odbCarServiceRescueSunshine() {
	return ConfigurationAndroid.driver.findElementByName("阳光保险");
  }

  /**
   * 保险 —— 太平洋保险
   */
  public WebElement odbCarServiceRescueCPIC() {
	return ConfigurationAndroid.driver.findElementByName("太平洋保险");
  }

  /**
   * 保险 —— 平安车险
   */

  public WebElement odbCarServiceRescuePingan() {
	return ConfigurationAndroid.driver.findElementByName("平安车险");
  }

  /**
   * 保险 —— 平安VIP俱乐部
   */

  public WebElement odbCarServiceRescuePinganVIP() {
	return ConfigurationAndroid.driver.findElementByName("平安VIP俱乐部");
  }

  /**
   * 保险 —— 人保车险
   */
  public WebElement odbCarServiceRescuePICC() {
	return ConfigurationAndroid.driver.findElementByName("人保车险");
  }

  /**
   * 道路救援 —— 中联车盟全国道路救援
   */
  public WebElement odbCarServiceRescueAAChina() {
	return ConfigurationAndroid.driver.findElementByName("中联车盟全国道路救援");
  }

  /**
   * 道路救援 —— 安联全球救援
   */
  public WebElement odbCarServiceRescueAllianz() {
	return ConfigurationAndroid.driver.findElementByName("安联全球救援");
  }

  /**
   * 道路救援 —— 大陆汽车俱乐部
   */
  public WebElement odbCarServiceRescueCAA() {
	return ConfigurationAndroid.driver.findElementByName("大陆汽车俱乐部");
  }

  /**
   * 送油 —— 中国石化道路救援
   */
  public WebElement odbCarServiceRescueSinopec() {
	return ConfigurationAndroid.driver.findElementByName("中国石化道路救援");
  }

  /**
   * 换胎 —— 米其林随你行
   */
  public WebElement odbCarServiceRescueMichelin() {
	return ConfigurationAndroid.driver.findElementByName("米其林随你行");
  }

  public WebElement odbGetTel() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.TextView[@resource-id='com.tian.obd.android:id/rescue_item_common_bottom_tv2']");
  }
  public WebElement odbGetTelBtn() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.TextView[@resource-id='com.tian.obd.android:id/rescue_item_common_bottom_tv3']");
  }
  public WebElement odbOK() {
	return ConfigurationAndroid.driver.findElementByName("允许一次");
  }
}
