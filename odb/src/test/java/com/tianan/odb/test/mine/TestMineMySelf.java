package com.tianan.odb.test.mine;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.GuideActivityPages;
import com.tianan.odb.android_pages.mine.MineActivityPages;
import com.tianan.odb.android_pages.mine.MineMessageActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.AndroidElementAttribute;
import com.tianan.odb.public_infunction.login_success;

/**
 * 个人信息测试
 * 
 * @author 张豆豆
 *
 */
public class TestMineMySelf {
  private static MyLogger logger = MyLogger.getLogger(TestMineMessage.class);
  private ConfigurationAndroid con = new ConfigurationAndroid();
  private login_success lSuccess = new login_success();
  private AndroidElementAttribute aea = new AndroidElementAttribute();
  private GuideActivityPages guideActivityPages = new GuideActivityPages();
  private MineActivityPages mine = new MineActivityPages();
  private MineMessageActivityPages message = new MineMessageActivityPages();

  /**
   * 修改个人信息
   */
  @Test
  public void testEditMyselfInfo() {
	
  }

  @BeforeClass
  public void beforeClass() {
	con.SetUp();
	lSuccess.login(3);
	guideActivityPages.odbMine().click();
	mine.odbMineUserInfo().click();
	HolmosBaseUtils.sleep(1000);
	logger.info("打开个人信息页面");
  }

  @AfterClass
  public void afterClass() {
	lSuccess.quitAppium();
	logger.info("退出appium，回收session");
  }
}
