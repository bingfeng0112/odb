package com.tianan.odb.android_pages.mine;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * 我的 —— 车辆信息页面元素定位
 * 
 * @author: 张豆豆
 * @create: Mar 29, 2017
 */
public class MineCarInfoActivityPages {

  public WebElement odbback() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }

  public WebElement odbTitle() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  /**
   * @return 车牌号
   */
  public WebElement odbMineCarInfoCarNumBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rl_car_number");
  }

  /**
   * @return 车牌号的值
   */
  public WebElement odbMineCarInfoCarNum() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_car_number");
  }

  /**
   * @return 车牌号输入框
   */
  public WebElement odbMineCarInfoCarNumEdit() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_nickname");
  }

  /**
   * @return 车牌号保存按钮
   */
  public WebElement odbMineCarInfoCarNumSaveBtn() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_carnumber_save");
  }

  /**
   * @return 车颜色
   */
  public WebElement odbMineCarInfoCarColorBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rl_car_color");
  }

  /**
   * @return 车颜色的值
   */
  public WebElement odbMineCarInfoCarColor() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_car_color");
  }

  /**
   * @return 车颜色列表
   */
  public WebElement odbMieCarInfoCarColorList(String text) {
	return ConfigurationAndroid.driver.findElementByXPath("//android.widget.TextView[@text='" + text + "']");
  }

  /**
   * @return 车颜色页面保存按钮
   */
  public WebElement odbMineCarInfoCarColorSaveBtn() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_car_color_save");
  }

  /**
   * @return 车类型
   */
  public WebElement odbMineCarInfoCarTypeBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rl_car_type");
  }

  /**
   * @return 车类型
   */
  public WebElement odbMineCarInfoCarType() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_car_type");
  }

  /**
   * @return 发动机号值
   */
  public WebElement odbMineCarInfoEngineNo() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_car_engine");
  }

  /**
   * @return 发动机号编辑框
   */
  public WebElement odbMineCarInfoEngineEdit() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_engine");
  }

  /**
   * @return 发动机号保存按钮
   */
  public WebElement odbMineCarInfoEngineSaveBtn() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_carnumber_save");
  }

  /**
   * @return VIN值
   */
  public WebElement odbMineCarInfoVIN() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_car_vin");
  }

  /**
   * @return VIN编辑框
   */
  public WebElement odbMineCarInfoVINEdit() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_framenum");
  }

  /**
   * @return VIN保存按钮
   */
  public WebElement odbMineCarInfoVINSaveBtn() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_save");
  }

  /**
   * @return 购买日期
   */
  public WebElement odbMineCarInfoBuyDate() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_buy_time");
  }

  /**
   * @return 投保日期
   */
  public WebElement odbMineCarInfoCoverDate() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_cover_date");
  }

  /**
   * @return 获取日期控件当前月份
   */
  public WebElement odbDateTitle() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title");
  }

  /**
   * @return 日期控件上月
   */
  public WebElement odbDatePreMonth() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_pre_month");
  }

  /**
   * @return 日期控件下月
   */
  public WebElement odbDateNextMonth() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_next_month");
  }

  /**
   * @param day
   *          传入要点击的天数
   * @return 日期日控件
   */
  public WebElement odbDateDay(int day) {
	return ConfigurationAndroid.driver.findElementByXPath("//android.widget.TextView[@text='" + day + "']");
  }
}
