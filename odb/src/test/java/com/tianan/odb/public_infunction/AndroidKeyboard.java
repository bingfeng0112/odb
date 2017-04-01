package com.tianan.odb.public_infunction;

import com.tianan.odb.configuration_device.ConfigurationAndroid;
import io.appium.java_client.android.AndroidKeyCode;

/**
 * @author: 张豆豆
 * @create: Mar 31, 2017
 */
public class AndroidKeyboard {
  /**
   * 点击返回按钮
   */
  public static void back() {
	ConfigurationAndroid.driver.pressKeyCode(AndroidKeyCode.BACK);
  }
}

