package com.tianan.odb.android_pages.mine;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * 意见反馈页面元素定位
 * 
 * @author: 张豆豆
 * @create: Mar 20, 2017
 */
public class MineFeedbackActivityPages {
  /**
   * 
   * @author 张豆豆
   * @return 标题栏
   */
  public WebElement odbMineFeedbackTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  /**
   * 
   * @author 张豆豆
   * @return 意见内容输入框
   */
  public WebElement odbMineFeedbackText() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_suggestion");
  }

  /**
   * 
   * @author 张豆豆
   * @return 提交按钮
   */
  public WebElement odbMineFeedbackSubmit() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/right_btn");
  }

  /**
   * 
   * @author 张豆豆
   * @return 返回按钮
   */
  public WebElement odbMineFeedbackBack() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }
}
