package com.tianan.odb.test.car_service;

import org.testng.annotations.Test;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.GuideActivityPages;
import com.tianan.odb.android_pages.carserver.CarServiceActivityPages;
import com.tianan.odb.android_pages.carserver.CarServiceRescueActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.login_success;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestCarServiceInstrument {
  private static MyLogger logger = MyLogger.getLogger(TestCarServiceRescue.class);
  private ConfigurationAndroid con = new ConfigurationAndroid();
  private login_success lSuccess = new login_success();
  private GuideActivityPages guideActivityPages = new GuideActivityPages();
  private CarServiceActivityPages carservice = new CarServiceActivityPages();
  private CarServiceRescueActivityPages rescue = new CarServiceRescueActivityPages();

  @Test
  public void f() {
	//TODO
  }

  @BeforeClass
  public void beforeClass() {
	con.SetUp();
	lSuccess.login(3);
	guideActivityPages.odbCarService().click();
	carservice.odbCarServiceRescue().click();
	HolmosBaseUtils.sleep(1000);
	logger.info("打开仪表手册页面");
  }

  @AfterClass
  public void afterClass() {
	lSuccess.quitAppium();
	logger.info("退出appium，回收session");
  }

}
