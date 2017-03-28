package com.tianan.odb.android_pages.mine;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * 实名认证页面元素定位
 * 
 * @author: 张豆豆
 * @create: Mar 20, 2017
 */
public class MineRealnameActivityPages {
  /**
   * 标题栏
   */
  public WebElement odbMineRealnameTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  /**
   * 返回按钮
   */
  public WebElement odbMineRealnameBack() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }

  /**
   * 请输入您的姓名
   */
  public WebElement odbMineRealnameName() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_name");
  }

  /**
   * 请输入您的身份证号
   */
  public WebElement odbMineRealnameIdnum() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_idcard");
  }

  /**
   * 选择身份证
   */
  public WebElement odbMineRealnameIdpic() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/img_add_first");
  }

  /**
   * 提交按钮
   */
  public WebElement odbMineRealnameSubmitBtn() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_confirm");
  }

  /**
   * 小米手机第一张图片
   */
  public WebElement odbDIMCPic() {
	return ConfigurationAndroid.driver
		.findElementByXPath("//android.widget.ImageView[@resource-id='com.miui.gallery:id/micro_thumb'][1]");
  }

  /**
   * 提交成功提示
   */
  public WebElement odbMineRealnameOkBtn() {
	return ConfigurationAndroid.driver.findElementByName("确定");
  }
}
