package com.tianan.odb.android_pages.mine;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * 消息提醒页面元素定位
 * 
 * @author: 张豆豆
 * @create: Mar 20, 2017
 */
public class MineMessageActivityPages {
  /**
   * 
   * @author 张豆豆
   * @return 标题栏
   */
  public WebElement odbMineMessageTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  /**
   * 
   * @author 张豆豆
   * @return 返回按钮
   */
  public WebElement odbMineMessageBack() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }

  /**
   * 
   * @author 张豆豆
   * @return 推广信息
   */
  public WebElement odbMineMessageIllegal() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_illegal");
  }

  /**
   * 
   * @author 张豆豆
   * @return 设置推广消息提醒
   */
  public WebElement odbMineMessageIllegalTips() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.RelativeLayout[@resource-id='com.tian.obd.android:id/rl_illegal']/android.widget.TextView[2]");
  }

  /**
   * 
   * @author 张豆豆
   * @return 推广信息开启状态
   */
  public WebElement odbMineMessageIllegalStatus() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/ckb_illegal_toggel");
  }

  /**
   * 
   * @author 张豆豆
   * @return 违章提醒
   */
  public WebElement odbMineMessagePop() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_pop");
  }

  /**
   * 
   * @author 张豆豆
   * @return 设置车辆新的违章信息推送提醒
   */
  public WebElement odbMineMessagePopTips() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.RelativeLayout[@resource-id='com.tian.obd.android:id/rl_pop']/android.widget.TextView[2]");
  }

  /**
   * 
   * @author 张豆豆
   * @return 违章提醒开启状态
   */
  public WebElement odbMineMessagePopStatus() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/ckb_pop_toggel");
  }
}
