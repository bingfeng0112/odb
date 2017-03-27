package com.tianan.odb.test.car_service;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.GuideActivityPages;
import com.tianan.odb.android_pages.carserver.CarServiceActivityPages;
import com.tianan.odb.android_pages.carserver.CarServiceRescueActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.login_success;

public class TestCarServiceRescue {
  private static MyLogger logger = MyLogger.getLogger(TestCarServiceRescue.class);
  private ConfigurationAndroid con = new ConfigurationAndroid();
  private login_success lSuccess = new login_success();
  private GuideActivityPages guideActivityPages = new GuideActivityPages();
  private CarServiceActivityPages carservice = new CarServiceActivityPages();
  private CarServiceRescueActivityPages rescue = new CarServiceRescueActivityPages();
  // private ResourceBundle br =
  // ResourceBundle.getBundle("/CarServiceRescueTelNum.properties");
  private Map<String, String> telNum = new HashMap<String, String>();

  /**
   * 测试打电话
   */
  // @Test
  public void testCarServiceRescueCall() {
	rescue.odbCarServiceRescueAAChina().click();
	rescue.odbGetTelBtn().click();
	rescue.odbOK().click();
	HolmosBaseUtils.sleep(1000);
  }

  public void data() {
	telNum.put("Sunshine", "电话：95510");
	telNum.put("CPIC", "电话：95500");
	telNum.put("Pingan", "电话：4008-000-000");
	telNum.put("PinganVIP", "电话：400-889-5511");
	telNum.put("PICC", "电话：4001234567");
	telNum.put("AAChina", "电话：400-810-8208");
	telNum.put("Allianz", "电话：400-656-0050");
	telNum.put("CAA", "电话：400-818-1010");
	telNum.put("Sinopec", "电话：95105988");
	telNum.put("Michelin", "电话：400-8890088");
  }

  /**
   * 测试获取所有电话
   */
  @Test
  public void testCarServiceRescueAllTelNum() {
	data();
	int i = 0;
	String err = "";
	rescue.odbCarServiceRescueSunshine().click();
	if (telNum.get("Sunshine").equals(rescue.odbGetTel().getText())) {
	  i = i + 1;
	} else {
	  err = err + "\t阳光车险" + rescue.odbGetTel().getText();
	}
	rescue.odbCarServiceRescueSunshine().click();
	HolmosBaseUtils.sleep(1000);

	rescue.odbCarServiceRescueCPIC().click();
	if (telNum.get("CPIC").equals(rescue.odbGetTel().getText())) {
	  i = i + 1;
	} else {
	  err = err + "\t太平洋车险" + rescue.odbGetTel().getText();
	}
	rescue.odbCarServiceRescueCPIC().click();
	HolmosBaseUtils.sleep(1000);

	rescue.odbCarServiceRescuePingan().click();
	if (telNum.get("Pingan").equals(rescue.odbGetTel().getText())) {
	  i = i + 1;
	} else {
	  err = err + "\t平安车险" + rescue.odbGetTel().getText();
	}
	rescue.odbCarServiceRescuePingan().click();
	HolmosBaseUtils.sleep(1000);

	rescue.odbCarServiceRescuePinganVIP().click();
	if (telNum.get("PinganVIP").equals(rescue.odbGetTel().getText())) {
	  i = i + 1;
	} else {
	  err = err + "\t平安VIP俱乐部" + rescue.odbGetTel().getText();
	}
	rescue.odbCarServiceRescuePinganVIP().click();
	HolmosBaseUtils.sleep(1000);

	rescue.odbCarServiceRescuePICC().click();
	if (telNum.get("PICC").equals(rescue.odbGetTel().getText())) {
	  i = i + 1;
	} else {
	  err = err + "\t人保车险" + rescue.odbGetTel().getText();
	}
	rescue.odbCarServiceRescuePICC().click();
	HolmosBaseUtils.sleep(1000);

	rescue.odbCarServiceRescueAAChina().click();
	if (telNum.get("AAChina").equals(rescue.odbGetTel().getText())) {
	  i = i + 1;
	} else {
	  err = err + "\t中联车盟全国道路救援" + rescue.odbGetTel().getText();
	}
	rescue.odbCarServiceRescueAAChina().click();
	HolmosBaseUtils.sleep(1000);

	rescue.odbCarServiceRescueAllianz().click();
	if (telNum.get("Allianz").equals(rescue.odbGetTel().getText())) {
	  i = i + 1;
	} else {
	  err = err + "\t安联全球救援" + rescue.odbGetTel().getText();
	}
	rescue.odbCarServiceRescueAllianz().click();
	HolmosBaseUtils.sleep(1000);

	rescue.odbCarServiceRescueCAA().click();
	if (telNum.get("CAA").equals(rescue.odbGetTel().getText())) {
	  i = i + 1;
	} else {
	  err = err + "\t大陆汽车俱乐部" + rescue.odbGetTel().getText();
	}
	rescue.odbCarServiceRescueCAA().click();
	HolmosBaseUtils.sleep(1000);

	rescue.odbCarServiceRescueSinopec().click();
	if (telNum.get("Sinopec").equals(rescue.odbGetTel().getText())) {
	  i = i + 1;
	} else {
	  err = err + "\t中国石化道路救援" + rescue.odbGetTel().getText();
	}
	rescue.odbCarServiceRescueSinopec().click();
	HolmosBaseUtils.sleep(1000);

	rescue.odbCarServiceRescueMichelin().click();
	if (telNum.get("Michelin").equals(rescue.odbGetTel().getText())) {
	  i = i + 1;
	} else {
	  err = err + "\t米其林随你行" + rescue.odbGetTel().getText();
	}
	rescue.odbCarServiceRescueMichelin().click();
	HolmosBaseUtils.sleep(1000);
	if (i == 10) {
	  logger.info("所有电话显示正确");
	} else {
	  logger.error("部分电话显示错误" + err);
	  throw new NoSuchElementException("部分电话显示错误" + err);
	}

  }

  @BeforeClass
  public void beforeClass() {
	con.SetUp();
	lSuccess.login(3);
	guideActivityPages.odbCarService().click();
	carservice.odbCarServiceRescue().click();
	HolmosBaseUtils.sleep(1000);
	logger.info("打开紧急救援页面");
  }

  @AfterClass
  public void afterClass() {
	lSuccess.quitAppium();
	logger.info("退出appium，回收session");
  }

}
