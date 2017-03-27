package com.tianan.odb.test.car_service;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.GuideActivityPages;
import com.tianan.odb.android_pages.carserver.CarServiceActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.login_success;

public class TestCarService4S {
  private static MyLogger logger = MyLogger.getLogger(TestCarServiceOrder.class);
  private ConfigurationAndroid con = new ConfigurationAndroid();
  private login_success lSuccess = new login_success();
  private GuideActivityPages guideActivityPages = new GuideActivityPages();
  private CarServiceActivityPages carservice = new CarServiceActivityPages();
  
  @Test
  public void odbCarService4SOpenPage() {
	String pageInfo = ConfigurationAndroid.driver.getPageSource();
	if (pageInfo.contains("乐车邦APP")) {
	  logger.info("已打开乐车邦网站");
	} else {
	  logger.error("未打开乐车邦网站");
	  throw new NoSuchElementException("未打开乐车邦网站");
	}
  }
  @BeforeClass
  public void beforeClass() {
	con.SetUp();
	lSuccess.login(3);
	guideActivityPages.odbCarService().click();
	carservice.odbCarServiceMaintain().click();
	HolmosBaseUtils.sleep(5000);
	logger.info("打开4S保养页面");
  }

  @AfterClass
  public void afterClass() {
	lSuccess.quitAppium();
	logger.info("退出appium，回收session");
  }

}
