package com.tianan.odb.test.car_service;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.GuideActivityPages;
import com.tianan.odb.android_pages.carserver.CarServiceActivityPages;
import com.tianan.odb.android_pages.carserver.CarServiceGPRSActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.AndroidElementAttribute;
import com.tianan.odb.public_infunction.login_success;

/**
 * 测试流量查询页面
 * 
 * @author: 张豆豆
 * @create: Mar 24, 2017
 */
public class TestCarServiceGPRS {
  private static MyLogger logger = MyLogger.getLogger(TestCarServiceOrder.class);
  private ConfigurationAndroid con = new ConfigurationAndroid();
  private login_success lSuccess = new login_success();
  private GuideActivityPages guideActivityPages = new GuideActivityPages();
  private CarServiceActivityPages carservice = new CarServiceActivityPages();
  private CarServiceGPRSActivityPages gprs = new CarServiceGPRSActivityPages();
  private AndroidElementAttribute aea = new AndroidElementAttribute();

  @Test(priority = 1)
  public void testUsedCheckGPRS() {
	HolmosBaseUtils.sleep(2000);
	String use = aea.getContentDESC(gprs.odbCarServiceGPRSUseing());
	String useNum = use.split(":")[1].split("%")[0];
	//if (Integer.valueOf(useNum) >= 0 && Integer.valueOf(useNum) <= 100) {
	if(Float.parseFloat(useNum) >= 0 && Float.parseFloat(useNum) <= 100){
	  logger.info("已使用数据数值显示正常");
	  gprs.odbBack().click();
	} else {
	  logger.error("已使用数据数值显示不正确，显示结果为：" + useNum);
	  gprs.odbBack().click();
	  throw new NoSuchElementException("已使用数据数值显示不正确，显示结果为：" + useNum);
	}
  }

  @Test(priority = 2)
  public void testBuyGPRS() {
	carservice.odbCarServiceGPRS().click();
	HolmosBaseUtils.sleep(2000);
	gprs.odbCarServiceGPRSBuy().click();
	String title = aea.getText(gprs.odbTitleBar());
	if ("套餐订购".equals(title)) {
	  logger.info("已打开流量套餐页面");
	  gprs.odbBack().click();
	} else {
	  logger.error("未打开流量套餐页面，打开页面为：" + title);
	  gprs.odbBack().click();
	  throw new NoSuchElementException("未打开流量套餐页面，打开页面为：" + title);
	}
  }

  @BeforeClass
  public void setUp() {
	con.SetUp();
	lSuccess.login(3);
	guideActivityPages.odbCarService().click();
	carservice.odbCarServiceGPRS().click();
	logger.info("打开流量查询页面");
  }

  @AfterClass
  public void tearDown() {
	lSuccess.quitAppium();
	logger.info("退出appium，回收session");
  }
}
