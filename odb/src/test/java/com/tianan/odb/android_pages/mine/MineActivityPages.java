package com.tianan.odb.android_pages.mine;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * 我的页面菜单元素定位
 * @author: 张豆豆
 * @create: Mar 20, 2017
 */
public class MineActivityPages {
  /**
   * @return 标题栏
   */
  public WebElement odbTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }
  public WebElement odbMineMyOrder() {
	return ConfigurationAndroid.driver.findElementByName("我的订单");
  }
  /**
   * @return 实名验证
   */
  public WebElement odbMineRealNameTips() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_realname_tips");
  }

  /**
   * @return 实名验证状态 ｛未认证、已认证｝
   */
  public WebElement odbMineRealNameStatus() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_realname_status");
  }

  /**
   * @return 设备绑定
   */
  public WebElement odbMineDevicebind() {
	return ConfigurationAndroid.driver.findElementByName("设备绑定");
  }

  /**
   * @return 设备绑定状态｛已绑定、未绑定｝
   */
  public WebElement odbMineDeviceBindStatus() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_device_status");
  }

  /**
   * @return 设备更换
   */
  public WebElement odbMineDeviceChange() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_change_device");
  }

  /**
   * @return 消息提醒
   */
  public WebElement odbMineMessage() {
	return ConfigurationAndroid.driver.findElementByName("消息提醒");
  }

  /**
   * @return 轨迹记录
   */
  public WebElement odbMineTracks() {
	return ConfigurationAndroid.driver.findElementByName("轨迹记录");
  }

  /**
   * @return 轨迹记录状态
   */
  public WebElement odbMineTracksStatus() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/cb_runtrack");
  }

  /**
   * @return 个人信息
   */
  public WebElement odbMineUserInfo() {
	return ConfigurationAndroid.driver.findElementByName("个人信息");
  }

  /**
   * @return 车辆信息
   */
  public WebElement odbMineCarInfo() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_carInfo");
  }

  /**
   * @return 第三方账户
   */
  public WebElement odbMineTheirAccount() {
	return ConfigurationAndroid.driver.findElementByName("第三方账户");
  }

  /**
   * @return 账户自动登录
   */
  public WebElement odbMineAutoLogin() {
	return ConfigurationAndroid.driver.findElementByName("账户自动登录");
  }

  /**
   * @return 账户自动登录状态
   */
  public WebElement odbMineAutoLoginStatus() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/cb_autologin");
  }

  /**
   * @return 意见反馈
   */
  public WebElement odbMineFeedBack() {
	return ConfigurationAndroid.driver.findElementByName("意见反馈");
  }

  /**
   * @return 关于天安车宝
   */
  public WebElement odbMineAbout() {
	return ConfigurationAndroid.driver.findElementByName("关于天安车宝");
  }

  /**
   * @return 导航 我的 —— 退出
   */
  public WebElement odbMineQuitBtn() {
	WebElement quitBtn = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_quit");
	return quitBtn;
  }
}
