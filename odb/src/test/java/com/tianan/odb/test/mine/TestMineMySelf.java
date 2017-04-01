package com.tianan.odb.test.mine;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.GuideActivityPages;
import com.tianan.odb.android_pages.mine.MineActivityPages;
import com.tianan.odb.android_pages.mine.MineUserInfoActivityPages;
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
  private MineUserInfoActivityPages userInfo = new MineUserInfoActivityPages();

  /**
   * 修改个人信息 —— 修改昵称
   */
  @Test(priority = 1)
  public void testMyselfInfoChangeNike() {

	String oldNike = aea.getText(userInfo.odbMineUserInfoNikename());
	userInfo.odbMineUserInfoNikenameTips().click();
	userInfo.odbMineUserInfoNikenameChangeText().sendKeys(oldNike + "1");
	userInfo.odbMineUserInfoChangeNameSaveBtn().click();
	HolmosBaseUtils.sleep(2000);
	String newNike = aea.getText(userInfo.odbMineUserInfoNikename());
	if (oldNike.equals(newNike)) {
	  logger.error("修改昵称---失败");
	  throw new NoSuchElementException("修改昵称---失败");
	} else {
	  logger.info("修改昵称---成功");
	}
  }

  /**
   * 修改个人信息 —— 修改性别
   */
  @Test(priority = 2)
  public void testMyselfInfoChangeSex() {
	String oldSex = aea.getText(userInfo.odbMineUserInfoSex());
	userInfo.odbMineUserInfoSexTips().click();
	if ("男".equals(oldSex)) {
	  userInfo.odbMineUserInfoSexWoman().click();
	} else {
	  userInfo.odbMineUserInfoSexMan().click();
	}
	String newSex = aea.getText(userInfo.odbMineUserInfoSex());
	if (oldSex.equals(newSex)) {
	  logger.info("修改性别 ---成功");
	} else {
	  logger.error("修改性别---失败");
	  throw new NoSuchElementException("修改性别---失败");
	}
  }

  /**
   * 修改个人信息 —— 修改姓名
   */
  @Test(priority = 3)
  public void testMyselfInfoChangeName() {
	String oldName = aea.getText(userInfo.odbMineUserInfoSex());
	userInfo.odbMineUserInfoSexTips().click();
	userInfo.odbMineUserInfoChangeName().sendKeys(oldName + "1");
	userInfo.odbMineUserInfoChangeNameSaveBtn().click();
	HolmosBaseUtils.sleep(2000);
	String newName = aea.getText(userInfo.odbMineUserInfoSex());
	if (oldName.equals(newName)) {
	  logger.info("修改性别 ---成功");
	} else {
	  logger.error("修改性别---失败");
	  throw new NoSuchElementException("修改性别---失败");
	}
  }

  /**
   * 修改个人信息 —— 修改密码
   */
  public void testMyselfInfoChangePwd() {
	// TODO
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
