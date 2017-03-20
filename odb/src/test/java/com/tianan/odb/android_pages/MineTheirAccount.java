package com.tianan.odb.android_pages;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * @author: 张豆豆
 * @create: Mar 20, 2017
 */
public class MineTheirAccount {
  /**
   * 
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
   * @return 新浪logo
   */
  public WebElement sinaLogo() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/iv_logo_sn");
  }

  /**
   * 
   * @author 张豆豆
   * @return 新浪账号
   */
  public WebElement sina() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_bind_sina");
  }

  /**
   * 
   * @author 张豆豆
   * @return 新浪账号绑定状态
   */
  public WebElement sinaBindStatus() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_bind_status");
  }
}
