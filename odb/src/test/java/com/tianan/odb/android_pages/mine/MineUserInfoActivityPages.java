package com.tianan.odb.android_pages.mine;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

/**
 * @author: 张豆豆
 * @create: Mar 20, 2017
 */
public class MineUserInfoActivityPages {
  /**
   * 
   * @author 张豆豆
   * @return 标题栏
   */
  public WebElement odbMineUserInfoTitleBar() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/title_text");
  }

  /**
   * 
   * @author 张豆豆
   * @return 返回按钮
   */
  public WebElement odbMineUserInfoBack() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/left_btn");
  }

  /**
   * 
   * @author 张豆豆
   * @return 头像
   */
  public WebElement odbMineUserInfoHeader() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_header");
  }

  /**
   * 
   * @author 张豆豆
   * @return 头像图片
   */
  public WebElement odbMineUserInfoHeaderImage() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rimv_head");
  }

  /**
   * 
   * @author 张豆豆
   * @return 昵称
   */
  public WebElement odbMineUserInfoNikenameTips() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_nickname_tips");
  }

  /**
   * 
   * @author 张豆豆
   * @return 昵称值，默认注册手机号
   */
  public WebElement odbMineUserInfoNikename() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_nickname");
  }

  /**
   * 
   * @author 张豆豆
   * @return 修改昵称输入框
   */
  public WebElement odbMineUserInfoNikenameChangeText() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_nickname");
  }

  /**
   * 
   * @author 张豆豆
   * @return 修改昵称和姓名保存按钮
   */
  public WebElement odbMineUserInfoChangeNameSaveBtn() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_nickname_save");
  }

  /**
   * 
   * @author 张豆豆
   * @return 性别
   */
  public WebElement odbMineUserInfoSexTips() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_sex_tips");
  }

  /**
   * 
   * @author 张豆豆
   * @return 性别值
   */
  public WebElement odbMineUserInfoSex() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_sex");
  }

  /**
   * 
   * @author 张豆豆
   * @return 性别列表：男
   */
  public WebElement odbMineUserInfoSexMan() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_male");
  }

  /**
   * 
   * @author 张豆豆
   * @return 性别列表：女
   */
  public WebElement odbMineUserInfoSexWoman() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_female");
  }

  /**
   * 
   * @author 张豆豆
   * @return 姓名
   */
  public WebElement odbMineUserInfoNameTips() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_name_tips");
  }

  /**
   * 
   * @author 张豆豆
   * @return 姓名值
   */
  public WebElement odbMineUserInfoName() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_name");
  }

  /**
   * 
   * @author 张豆豆
   * @return 修改姓名输入框
   */
  public WebElement odbMineUserInfoChangeName() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_nickname");
  }

  /**
   * 
   * @author 张豆豆
   * @return 姓名修改保存按钮
   */
  public WebElement odbMineUserInfoSaveBtn() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_nickname_save");
  }

  /**
   * 
   * @author 张豆豆
   * @return 在分享中展示注册手机号
   */
  public WebElement odbMineUserInfoSharePhoneNumberTips() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_share_tips");
  }

  /**
   * 
   * @author 张豆豆
   * @return 在分享中展示注册手机号状态
   */
  public WebElement odbMineUserInfoSharePhoneNumberStatus() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/ckb_share_mobile_toggel");
  }

  /**
   * 
   * @author 张豆豆
   * @return 安全设置
   */
  public WebElement odbMineUserInfoSecurity() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_security_tips");
  }

  /**
   * 
   * @author 张豆豆
   * @return 修改密码
   */
  public WebElement odbMineUserInfoChangePasswd() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_pass");
  }

  /**
   * 
   * @author 张豆豆
   * @return 旧密码输入框
   */
  public WebElement odbMineUserInfoChangePasswdOldPasswd() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_oldpassword");
  }

  /**
   * 
   * @author 张豆豆
   * @return 新密码输入框
   */
  public WebElement odbMineUserInfoChangePasswdNewPasswd() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_newpassword");
  }

  /**
   * 
   * @author 张豆豆
   * @return 再次输入新密码
   */
  public WebElement odbMineUserInfoChangePasswdResumePasswd() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_re_newpassword");
  }

  /**
   * 
   * @author 张豆豆
   * @return 显示密码
   */
  public WebElement odbMineUserInfoChangePasswdShowPasswd() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/cb_show_password");
  }

  /**
   * 
   * @author 张豆豆
   * @return 提交密码
   */
  public WebElement odbMineUserInfoChangePasswdSubmitBtn() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_save");
  }

  /**
   * 
   * @author 张豆豆
   * @return 修改注册手机号
   */
  public WebElement odbMineUserInfoMobileTips() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_mobile_tips");
  }

  /**
   * 
   * @author 张豆豆
   * @return 注册手机号值
   */
  public WebElement odbMineUserInfoMobile() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_mobile");
  }

  /**
   * 
   * @author 张豆豆
   * @return 新手机号
   */
  public WebElement odbMineUserInfoMobileNewPhone() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_phonenumber_modify");
  }

  /**
   * 
   * @author 张豆豆
   * @return 获取验证码
   */
  public WebElement odbMineUserInfoMobileGetVerification() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_verify_code");
  }

  /**
   * 
   * @author 张豆豆
   * @return 输入验证码
   */
  public WebElement odbMineUserInfoMobileInputVerification() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_code");
  }

  /**
   * 
   * @author 张豆豆
   * @return 再次获取验证码
   */
  public WebElement odbMineUserInfoMobileRegetVerification() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_re_verify");
  }

  /**
   * 
   * @author 张豆豆
   * @return 提交修改注册手机号
   */
  public WebElement odbMineUserInfoMobileSubmitBtn() {
	return ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_confirm");
  }
}
