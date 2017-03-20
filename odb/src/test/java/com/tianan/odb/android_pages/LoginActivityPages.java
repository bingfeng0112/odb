package com.tianan.odb.android_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * @author: 张豆豆
 * @create: Mar 20, 2017
 */
public class LoginActivityPages {
  /**
   * @author 张豆豆
   * @return 取消升级按钮
   */
  public WebElement odbUpdateCanale() {
	WebElement canle = ConfigurationAndroid.driver.findElement(By.id("com.tian.obd.android:id/sdl__negative_button"));
	return canle;
  }

  /**
   * @author 张豆豆
   * @return 确认升级按钮
   */
  public WebElement odbUpdateOk() {
	WebElement ok = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/sdl__positive_button");
	return ok;
  }
  /**
   * @author 张豆豆
   * @return 升级提示栏内容
   */
  public WebElement odbUpdateMessage() {
	WebElement message = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/sdl__message");
	return message;
  }
  /**
   * @author 张豆豆
   * @return 升级提示框标题
   */
  public WebElement odbUpdateTitleBar() {
	WebElement titleBar = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/sdl__title");
	return titleBar;
  }
  /**
   * @author 张豆豆
   * @return app标题栏
   */
  public WebElement odbTitleBar() {
	WebElement titleBar = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
	return titleBar;
  }

  /**
   * 
   * @author 张豆豆
   * @return 用户名
   */
  public WebElement odbLoginUsernametxt() {
	WebElement loginUsernametxt = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/edt_user");
	return loginUsernametxt;
  }

  /**
   * 
   * @author 张豆豆
   * @return 密码
   */
  public WebElement odbLoginPasswdtxt() {
	WebElement loginPasswdtxt = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/edt_pass");
	return loginPasswdtxt;
  }

  /**
   * @author 张豆豆
   * @return 登录按钮
   */
  public WebElement odbLoginBtn() {
	WebElement loginBtn = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_login");
	return loginBtn;
  }
  /**
   * @author 张豆豆
   * @return 注册按钮
   */
  public WebElement odbRegistBtn(){
	WebElement registBtn = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_2Register");
	return registBtn;
  }
  /**
   * 
   * @author 张豆豆
   * @return 忘记密码
   */
  public WebElement odbForgetPasswd(){
	WebElement forgetPasswd = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_forget_pass");
	return forgetPasswd;
  }
  /**
   * 
   * @author 张豆豆
   * @return 版本信息
   */
  public WebElement odbVersion() {
	WebElement version = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_version");
	return version;
  }
}
