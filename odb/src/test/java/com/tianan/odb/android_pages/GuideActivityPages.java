package com.tianan.odb.android_pages;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * @author: 张豆豆
 * @create: Mar 20, 2017
 */
public class GuideActivityPages {
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
   * @return 菜单 车信息
   */
  public WebElement odbCarInfo() {
	WebElement home = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/home_rd_btn");
	return home;
  }
  /**
   * 
   * @author 张豆豆
   * @return 菜单 车服务
   */
  public WebElement odbCarService() {
	WebElement analyze = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/analyze_rd_btn");
	return analyze;
  }
  /**
   * 
   * @author 张豆豆
   * @return 菜单 发现
   */
  public WebElement odbDiscover() {
	WebElement discover = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/travel_rd_btn");
	return discover;
  }
  /**
   * 
   * @author 张豆豆
   * @return 菜单 我的
   */
  public WebElement odbMine() {
	WebElement my = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/share_rd_btn");
	return my;
  }
}

