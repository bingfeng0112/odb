package com.tianan.odb.android_pages.mine;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * @author: 张豆豆
 * @create: Mar 20, 2017
 */
public class MineRealnameActivityPages {
  /**
   * 标题栏
   * 
   * @author 张豆豆
   */
  public WebElement odbMineRealnameTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  /**
   * 返回按钮
   * 
   * @author 张豆豆
   */
  public WebElement odbMineRealnameBack() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }

  /**
   * 请输入您的姓名
   * 
   * @author 张豆豆
   * @return
   */
  public WebElement odbMineRealnameName() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_name");
  }

  /**
   * 请输入您的身份证号
   * 
   * @author 张豆豆
   * @return
   */
  public WebElement odbMineRealnameIdnum() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_idcard");
  }

  /**
   * 选择身份证
   * 
   * @author 张豆豆
   * @return
   */
  public WebElement odbMineRealnameIdpic() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/img_add_first");
  }

  /**
   * 提交按钮
   * 
   * @author 张豆豆
   * @return
   */
  public WebElement odbMineRealnameSubmitBtn() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_confirm");
  }
}
