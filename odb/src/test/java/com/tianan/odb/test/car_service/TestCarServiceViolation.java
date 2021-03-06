package com.tianan.odb.test.car_service;

import java.util.Set;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.GuideActivityPages;
import com.tianan.odb.android_pages.carserver.CarServiceActivityPages;
import com.tianan.odb.android_pages.carserver.CarServiceViolationActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.AndroidElementAttribute;
import com.tianan.odb.public_infunction.login_success;
/**
 * 测试违章查询页面
 * @author 张豆豆
 *
 */
//TODO
public class TestCarServiceViolation {
  private static MyLogger logger = MyLogger.getLogger(TestCarServiceViolation.class);
  private ConfigurationAndroid con = new ConfigurationAndroid();
  private login_success lSuccess = new login_success();
  private AndroidElementAttribute aea = new AndroidElementAttribute();
  private GuideActivityPages guideActivityPages = new GuideActivityPages();
  private CarServiceActivityPages carservice = new CarServiceActivityPages();
  private CarServiceViolationActivityPages violation = new CarServiceViolationActivityPages();

  @Test
  public void testAddCarInfo() {
	// TODO 无法定位到元素
	System.out.println(ConfigurationAndroid.driver.getPageSource());
	HolmosBaseUtils.sleep(10000);
	Set<String> set = ConfigurationAndroid.driver.getContextHandles();
	for(String string : set){
	  logger.info(string);
	}
	logger.info(violation.odbcc().getText());
	HolmosBaseUtils.sleep(10000);
  }

  @BeforeClass
  public void beforeClass() {
	con.SetUp();
	lSuccess.login(3);
	guideActivityPages.odbCarService().click();
	carservice.odbCarServiceViolation().click();
	HolmosBaseUtils.sleep(5000);
	logger.info("打开违章查询页面");
  }

  @AfterClass
  public void afterClass() {
	lSuccess.quitAppium();
	logger.info("退出appium，回收session");
  }

}
