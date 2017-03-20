package com.tianan.odb.android_pages;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * @author: 张豆豆
 * @create: Mar 20, 2017
 */
public class MineDeviceBindActivityPages {
  /**
   * 
   * @author 张豆豆
   * @return 标题栏
   */
  public WebElement odbMineDevicebindTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  /**
   * 
   * @author 张豆豆
   * @return 返回按钮
   */
  public WebElement odbMineDevicebindBack() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }

  /**
   * 
   * @author 张豆豆
   * @return 带屏终端标签选择按钮
   */
  public WebElement odbMineDevicebindDisplayerTerminal() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/fragment_bind_device_tab_rab1");
  }

  /**
   * 请输入终端编号(IMEI)
   * 
   * @author 张豆豆
   * @return 终端号输入框
   */
  public WebElement odbMineDevicebindDispalyerTerminalImei() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/edt_imei");
  }

  /**
   * 请输入您的初始里程(Km)
   * 
   * @author 张豆豆
   * @return 初始里程输入框
   */
  public WebElement odbMineDevicebindDispalyerTerminalKilometers() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/edt_kilometers");
  }

  /**
   * 为了保障您的后续服务，请确保IMEI号和初始里程真实准确！
   * 
   * @author 张豆豆
   * @return 提示信息
   */
  public WebElement odbMineDevicebindDispalyerTerminalTips() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.RelativeLayout[@resource-id='com.tian.obd.android:id/cstm_title']/following::android.widget.TextView[3]");
  }

  /**
   * 
   * @author 张豆豆
   * @return 绑定按钮
   */
  public WebElement odbMineDevicebindDispalyerTerminalBindBtn() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_device_bind");
  }

  /**
   * 终端编号IMEI在哪？
   * 
   * @author 张豆豆
   * @return 帮助
   */
  public WebElement odbMineDevicebindDispalyerTerminalIMEIWhere() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.RelativeLayout[@resource-id='com.tian.obd.android:id/cstm_title']/following::android.widget.LinearLayout/android.widget.TextView[1]");
  }

  /**
   * 打开“天安车联网/一键通” -- 找到 “服务帮助” -- 点击进入 -- 顶部 “车机注册信息” 展示中IMEI
   * 
   * @author 张豆豆
   * @return 查找IMEI步骤
   */
  public WebElement odbMineDevicebindDispalyerTerminalFindIMEIStep() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.RelativeLayout[@resource-id='com.tian.obd.android:id/cstm_title']/following::android.widget.LinearLayout/android.widget.TextView[2]");
  }

  /**
   * 
   * @author 张豆豆
   * @return CDC设备标签选择按钮
   */
  public WebElement odbMineDevicebindCDCTerminal() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/fragment_bind_device_tab_rab2");
  }

  /**
   * 请输入需要安装终端车辆的VIN
   * 
   * @author 张豆豆
   * @return VIN码输入框
   */
  public WebElement odbMineDevicebindCDCTerminalVIN() {
	return ConfigurationAndroid.driver.findElementById("");
  }

  /**
   * 请选择您的车型
   * 
   * @author 张豆豆
   * @return 车辆型号选择
   */
  public WebElement odbMineDevicebindCDCTerminalEngine() {
	return ConfigurationAndroid.driver.findElementById("");
  }

  /**
   * 车辆验证
   * 
   * @author 张豆豆
   * @return 验证按钮
   */
  public WebElement odbMineDevicebindCDCTerminalVerify() {
	return ConfigurationAndroid.driver.findElementById("");
  }

  /**
   * 车辆VIN码和发动机号在哪?
   * 
   * @author 张豆豆
   * @return 查找VIN提示
   */
  public WebElement odbMineDevicebindCDCTerminalVINWhere() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.RelativeLayout[@resource-id='com.tian.obd.android:id/cstm_title']/following::android.widget.LinearLayout/android.widget.TextView");
  }

  /**
   * 行驶证图片
   * 
   * @author 张豆豆
   * @return 图片
   */
  public WebElement odbMineDevicebindCDCTerminalVINPic() {
	return ConfigurationAndroid.driver.findElementByXPath(
		"//android.widget.RelativeLayout[@resource-id='com.tian.obd.android:id/cstm_title']/following::android.widget.LinearLayout/android.widget.ImageView");
  }

  /**
   * 
   * @author 张豆豆
   * @return 下一步按钮
   */
  public WebElement odbMineDevicebindNextBtn() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_next");
  }

  /**
   * 带屏终端提示信息：请确保带屏终端已成功安装,并完成激活 点击下一步进入带屏终端绑定流程 CDC设备提示信息：点击下一步进入CDC设备绑定流程
   * 
   * @author 张豆豆
   * @return 提示信息显示框
   */
  public WebElement odbMineDevicebindTerminalMarked() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_bind_next_tip");
  }
}
