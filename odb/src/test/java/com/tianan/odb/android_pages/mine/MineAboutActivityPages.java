package com.tianan.odb.android_pages.mine;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * @author: 张豆豆
 * @create: Mar 20, 2017
 */
public class MineAboutActivityPages {
  /**
   * @author 张豆豆
   * @return 标题栏
   */
  public WebElement odbTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  /**
   * 
   * @author 张豆豆
   * @return 返回按钮
   */
  public WebElement odbBack() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }

  /**
   * 
   * @author 张豆豆
   * @return 关于天安车宝 —— 使用帮助
   */
  public WebElement odbMineAboutHelp() {
	return ConfigurationAndroid.driver.findElementByName("使用帮助");
  }

  /**
   * 
   * @author 张豆豆
   * @return 关于天安车宝 —— 使用帮助 —— 客服业务受理
   */
  public WebElement odbMineAboutHelpUserHelp() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rl_use_help");
  }

  /**
   * 
   * @author 张豆豆
   * @return 关于天安车宝 —— 使用帮助 —— 客服业务受理文本框
   */
  public WebElement odbMineAboutHelpUserHelpText() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.RelativeLayout[@resource-id='com.tian.obd.android:id/rl_use_help']/android.widget.TextView");
  }

  /**
   * 
   * @author 张豆豆
   * @return 关于天安车宝 —— 使用帮助 —— 客服业务受理 —— 文本内容：客服热线为您提供以下服务
   */
  public WebElement odbMineAboutHelpUserHelpService() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_service_help_tip");
  }

  /**
   * 
   * @author 张豆豆
   * @return 关于天安车宝 —— 使用帮助 —— 客服业务受理 —— 人工导航
   */
  public WebElement odbMineAboutHelpUserHelpConsultation() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.LinearLayout[@resource-id='com.tian.obd.android:id/ll_car_condition_consultation']/android.widget.TextView");
  }

  /**
   * 
   * @author 张豆豆
   * @return 关于天安车宝 —— 使用帮助 —— 客服业务受理 —— 意见反馈
   */
  public WebElement odbMineAboutHelpUserHelpFeedback() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.LinearLayout[@resource-id='com.tian.obd.android:id/ll_maintenance_reservation']/android.widget.TextView");
  }

  /**
   * 
   * @author 张豆豆
   * @return 关于天安车宝 —— 使用帮助 —— 客服业务受理 —— 客服热线
   */
  public WebElement odbMineAboutHelpUserHelpMoblie() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_moblie");
  }

  /**
   * 
   * @author 张豆豆
   * @return 关于天安车宝 —— 版本标签
   */
  public WebElement odbMineAboutVersionTips() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_version");
  }

  /**
   * 
   * @author 张豆豆
   * @return 关于天安车宝 —— 版本号
   */
  public WebElement odbMineAboutVersion() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_version_name");
  }

  /**
   * @author 张豆豆
   * @return 取消升级按钮
   */
  public WebElement odbUpdateCanale() {
	WebElement canle = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/sdl__negative_button");
	return canle;
  }

  /**
   * @author 张豆豆
   * @return 确认升级按钮
   */
  public WebElement odbUpdateOk() {
	WebElement ok = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/sdl__positive_button");
	return ok;
  }

  /**
   * @author 张豆豆
   * @return 升级提示栏内容
   */
  public WebElement odbUpdateMessage() {
	WebElement message = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/sdl__message");
	return message;
  }

  /**
   * @author 张豆豆
   * @return 升级提示框标题
   */
  public WebElement odbUpdateTitleBar() {
	WebElement titleBar = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/sdl__title");
	return titleBar;
  }

  /**
   * 
   * @author 张豆豆
   * @return 关于天安车宝 —— 天安车宝介绍
   */
  public WebElement odbMineAboutAppInfo() {
	return ConfigurationAndroid.driver.findElementByName("天安车宝介绍");
  }

  /**
   * 
   * @author 张豆豆
   * @return 关于天安车宝 —— 天安车宝介绍 —— 详细内容文本框
   */
  public WebElement odbMineAboutAppInfoText() {
	return ConfigurationAndroid.driver
		.findElementByXPath("//android.widget.ScrollView/android.widget.RelativeLayout/android.widget.TextView");
  }

  /**
   * 
   * @author 张豆豆
   * @return 关于天安车宝 —— 用户协议 。 用户协议内容在webview中，点击打开切换webview模式后获取内容
   */
  public WebElement odbMineAboutUserAgreement() {
	return ConfigurationAndroid.driver.findElementByName("用户协议");
  }
}
