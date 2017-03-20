package com.tianan.odb.android_pages;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * @author: 张豆豆
 * @create: Mar 20, 2017
 */
public class MineActivityPages {
  /**
   * 
   * @author 张豆豆
   * @return 导航 我的  —— 退出
   */
  public WebElement MineQuitBtn() {
	WebElement quitBtn = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_quit");
	return quitBtn;
  }
}

