package com.tianan.odb.login;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.login_success;

public class test_loging_demo {
  @Test
  public void f() {
	ConfigurationAndroid con = new ConfigurationAndroid();
	con.SetUp();
	login_success lSuccess = new login_success();
	lSuccess.login();
  }
  @AfterTest
  public void tearDown(){
	ConfigurationAndroid.driver.quit();
  }
}
