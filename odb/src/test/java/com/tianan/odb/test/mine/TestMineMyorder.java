package com.tianan.odb.test.mine;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.GuideActivityPages;
import com.tianan.odb.android_pages.mine.MineActivityPages;
import com.tianan.odb.android_pages.mine.MineMyOrderActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.AndroidElementAttribute;
import com.tianan.odb.public_infunction.login_success;
import com.tianan.odb.test.car_service.TestCarServiceViolation;

/**
 * 我的订单页面测试流程
 * 
 * @author 张豆豆
 *
 */
public class TestMineMyorder {
  private static MyLogger logger = MyLogger.getLogger(TestMineMyorder.class);
  private ConfigurationAndroid con = new ConfigurationAndroid();
  private login_success lSuccess = new login_success();
  private AndroidElementAttribute aea = new AndroidElementAttribute();
  private GuideActivityPages guideActivityPages = new GuideActivityPages();
  private MineActivityPages mine = new MineActivityPages();
  private MineMyOrderActivityPages order = new MineMyOrderActivityPages();

  @Test
  public void f() {
	String date = aea.getText(order.date());
	order.del().click();
	order.ok().click();
	String newDate = aea.getText(order.date());
	logger.info("old date: " + date + "\tnew date: " + newDate);
  }

  @BeforeClass
  public void beforeClass() {
	con.SetUp();
	lSuccess.login(3);
	guideActivityPages.odbMine().click();
	mine.odbMineMyOrder().click();
	HolmosBaseUtils.sleep(5000);
	logger.info("打开违章查询页面");
  }

  @AfterClass
  public void afterClass() {
	lSuccess.quitAppium();
	logger.info("退出appium，回收session");
  }
}
