package com.tianan.odb.test.mine;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.GuideActivityPages;
import com.tianan.odb.android_pages.mine.MineActivityPages;
import com.tianan.odb.android_pages.mine.MineRealnameActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.AndroidElementAttribute;
import com.tianan.odb.public_infunction.login_success;

/**
 * 测试实名验证功能测试
 * 
 * @author 张豆豆
 *
 */
public class TestMineRealname {
  private static MyLogger logger = MyLogger.getLogger(TestMineRealname.class);
  private ConfigurationAndroid con = new ConfigurationAndroid();
  private login_success lSuccess = new login_success();
  private GuideActivityPages guideActivityPages = new GuideActivityPages();
  private MineActivityPages mine = new MineActivityPages();
  private MineRealnameActivityPages realName = new MineRealnameActivityPages();
  private AndroidElementAttribute aea = new AndroidElementAttribute();

  /**
   * 实名认证申请，只有未认证的用户才可以
   */
  @Test
  public void testRealNameAuthentication() {
	if (!"已认证".equals(aea.getText(mine.odbMineRealNameStatus()))) {
	  try {
		realName.odbMineRealnameIdnum().sendKeys("130682198011024821");
		realName.odbMineRealnameName().sendKeys("逗豆豆");
		realName.odbMineRealnameIdpic().click();
		realName.odbDIMCPic().click();
		realName.odbMineRealnameSubmitBtn().click();
		realName.odbMineRealnameOkBtn().click();
		logger.info("提交实名认证申请");
	  } catch (NoSuchElementException e) {
		logger.error("提交实名认证申请失败");
		e.printStackTrace();
	  }
	} else {
	  logger.error("当前用户已认证，无法进行实名验证");
	  throw new NoSuchElementException("当前用户已认证，无法进行实名验证");
	}
	HolmosBaseUtils.sleep(5000);
  }

  @BeforeClass
  public void beforeClass() {
	con.SetUp();
	lSuccess.login(3);
	guideActivityPages.odbMine().click();
	mine.odbMineRealNameTips().click();
	HolmosBaseUtils.sleep(2000);
	logger.info("打开实名验证页面");
  }

  @AfterClass
  public void afterClass() {
	lSuccess.quitAppium();
	logger.info("退出appium，回收session");
  }

}
