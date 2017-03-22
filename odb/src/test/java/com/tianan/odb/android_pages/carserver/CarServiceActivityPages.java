package com.tianan.odb.android_pages.carserver;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * 车服务页面元素定位
 * @author: 张豆豆
 * @create: Mar 20, 2017
 */
public class CarServiceActivityPages {
  /**
   * @return 标题栏
   */
  public WebElement odbCarServiceTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  /**
   * @return 违章查询
   */
  public WebElement odbCarServiceViolation() {
	return ConfigurationAndroid.driver.findElementByName("违章查询");
  }

  /**
   * @return 代驾服务
   */
  public WebElement odbCarServiceDriving() {
	return ConfigurationAndroid.driver.findElementByName("代驾服务");
  }

  /**
   * @return 紧急救援
   */
  public WebElement odbCarServiceRescue() {
	return ConfigurationAndroid.driver.findElementByName("紧急救援");
  }

  /**
   * @return 4s保养
   */
  public WebElement odbCarServiceMaintain() {
	return ConfigurationAndroid.driver.findElementByName("4s保养");
  }

  /**
   * @return 仪表手册
   */
  public WebElement odbCarServiceInstrumentManual() {
	return ConfigurationAndroid.driver.findElementByName("仪表手册");
  }

  /**
   * @return 车辆估价
   */
  public WebElement odbCarServiceCarAssess() {
	return ConfigurationAndroid.driver.findElementByName("车辆估价");
  }
}
