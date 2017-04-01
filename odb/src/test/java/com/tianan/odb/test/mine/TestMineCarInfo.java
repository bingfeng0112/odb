package com.tianan.odb.test.mine;

import java.util.Random;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.GuideActivityPages;
import com.tianan.odb.android_pages.mine.MineActivityPages;
import com.tianan.odb.android_pages.mine.MineCarInfoActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.AndroidElementAttribute;
import com.tianan.odb.public_infunction.AndroidKeyboard;
import com.tianan.odb.public_infunction.DateChangeUtils;
import com.tianan.odb.public_infunction.JavaUtils;
import com.tianan.odb.public_infunction.login_success;

/**
 * 车辆信息页面
 * 
 * @author 张豆豆
 *
 */
public class TestMineCarInfo {
  private static MyLogger logger = MyLogger.getLogger(TestMineCarInfo.class);
  private ConfigurationAndroid con = new ConfigurationAndroid();
  private login_success lSuccess = new login_success();
  private AndroidElementAttribute aea = new AndroidElementAttribute();
  private GuideActivityPages guideActivityPages = new GuideActivityPages();
  private MineActivityPages mine = new MineActivityPages();
  private MineCarInfoActivityPages carInfo = new MineCarInfoActivityPages();

  /**
   * 修改车牌号
   */
  @Test(priority = 1)
  public void testMineCarInfoChangeCarNo() {
	String oleNo = aea.getText(carInfo.odbMineCarInfoCarNum());
	carInfo.odbMineCarInfoCarNum().click();
	if ("京N12345".equals(oleNo)) {
	  carInfo.odbMineCarInfoCarNumEdit().sendKeys("京N54321");
	} else {
	  carInfo.odbMineCarInfoCarNumEdit().sendKeys("京N12345");
	}
	carInfo.odbMineCarInfoCarNumSaveBtn().click();
	try {
	  String newNo = aea.getText(carInfo.odbMineCarInfoCarNum());
	  if (newNo.equals(oleNo)) {
		logger.error("车牌号修改失败，新值与旧值相同");
		throw new NoSuchElementException("车牌号修改失败，新值与旧值相同");
	  } else {
		logger.info("车牌号修改成功");
		HolmosBaseUtils.sleep(3000);
	  }
	} catch (NoSuchElementException e) {
	  logger.error("车牌号修改失败，未返回详情页面");
	  String title = aea.getText(carInfo.odbTitle());
	  if ("修改车牌号".equals(title))
		carInfo.odbback().click();
	  throw new NoSuchElementException("车牌号修改失败，未返回详情页面");
	}
  }

  /**
   * 修改颜色
   */
  @Test(priority = 2)
  public void testMineCarInfoChangeColor() {
	String color[] = { "时尚黑", "极地白", "星月银", "凯茵紫", "水晶蓝", "优雅金", "其他颜色" };
	Random random = new Random();
	int index = random.nextInt(7);
	carInfo.odbMineCarInfoCarColor().click();
	HolmosBaseUtils.sleep(2000);
	carInfo.odbMieCarInfoCarColorList(color[index]).click();
	carInfo.odbMineCarInfoCarColorSaveBtn().click();
	HolmosBaseUtils.sleep(2000);
	try {
	  String newColor = aea.getText(carInfo.odbMineCarInfoCarColor());
	  if (color[index].equals(newColor)) {
		logger.info("成功修改车辆颜色");
	  } else {
		logger.error("修改车辆颜色失败，未将颜色更新为选择的颜色");
		throw new NoSuchElementException("修改车辆颜色失败，未将颜色更新为选择的颜色");
	  }
	} catch (NoSuchElementException e) {
	  String title = aea.getText(carInfo.odbTitle());
	  if ("选择车辆颜色".equals(title)) {
		logger.error("修改车辆颜色失败，未返回详情列表");
		carInfo.odbback().click();
		throw new NoSuchElementException("修改车辆颜色失败，未返回详情列表");
	  } else {
		throw new NoSuchElementException("修改车辆颜色失败，未将颜色更新为选择的颜色或未获取到新颜色值");
	  }
	}
  }

  /**
   * 修改车型
   */
  @Test(priority = 3)
  public void testMineCarInfoChangeCarType() {
	//TODO
  }

  /**
   * 修改发动机号
   */
  @Test(priority = 4)
  public void testMineCarInfoChangeEngineNo() {
	String oldEngineNo = aea.getText(carInfo.odbMineCarInfoEngineNo());
	carInfo.odbMineCarInfoEngineNo().click();
	int lastNum = JavaUtils.random(10);
	carInfo.odbMineCarInfoEngineEdit().sendKeys(oldEngineNo + lastNum);
	carInfo.odbMineCarInfoEngineSaveBtn().click();
	HolmosBaseUtils.sleep(2000);
	try {
	  String newEngineNo = aea.getText(carInfo.odbMineCarInfoEngineNo());
	  if (newEngineNo.equals(oldEngineNo)) {
		logger.error("发动机号修改失败，原值未改变");
		throw new NoSuchElementException("发动机号修改失败，原值未改变");
	  } else {
		logger.info("发动机号修改成功");
	  }
	} catch (NoSuchElementException e) {
	  String title = aea.getText(carInfo.odbTitle());
	  if ("车辆信息".equals(title)) {
		throw new NoSuchElementException("发动机号修改失败，原值未改变");
	  } else {
		logger.error("发动机号修改失败，未返回详情列表");
		carInfo.odbback().click();
		throw new NoSuchElementException("发动机号修改失败，未返回详情列表");
	  }
	}
  }

  /**
   * 修改VIN
   */
  @Test(priority = 5)
  public void testMineCarInfoChangeVIN() {
	String oldVIN = aea.getText(carInfo.odbMineCarInfoVIN());
	carInfo.odbMineCarInfoVIN().click();
	String newVIN = oldVIN.substring(1, oldVIN.length());
	int lastNum = JavaUtils.random(10);
	carInfo.odbMineCarInfoVINEdit().sendKeys(newVIN + lastNum);
	carInfo.odbMineCarInfoVINSaveBtn().click();
	HolmosBaseUtils.sleep(2000);
	try {
	  newVIN = aea.getText(carInfo.odbMineCarInfoVIN());
	  if (newVIN.equals(oldVIN)) {
		logger.error("VIN修改失败，原值未改变");
		throw new NoSuchElementException("VIN修改失败，原值未改变");
	  } else {
		logger.info("VIN修改成功");
	  }
	} catch (NoSuchElementException e) {
	  String title = aea.getText(carInfo.odbTitle());
	  if ("车辆信息".equals(title)) {
		throw new NoSuchElementException("VIN修改失败，原值未改变");
	  } else {
		logger.error("VIN修改失败，未返回详情列表");
		carInfo.odbback().click();
		throw new NoSuchElementException("VIN修改失败，未返回详情列表");
	  }
	}
  }

  /**
   * 修改购买时间
   */
  @Test(priority = 6)
  public void testMineCarInfoChangeBuyDate() {
	carInfo.odbMineCarInfoBuyDate().click(); // 打开日期控件
	for (int i = 0; i < 3; i++) {
	  carInfo.odbDatePreMonth().click(); // 上一月
	  HolmosBaseUtils.sleep(500);
	}
	// 获取当前月份
	String currentDate = aea.getText(carInfo.odbDateTitle());
	String month = currentDate.split("\\s+")[0];
	String year = currentDate.split("\\s+")[1];
	month = DateChangeUtils.dateNumber(month);
	// 获取要点击的日期
	int day = JavaUtils.random(28);
	day = day + 1;
	carInfo.odbDateDay(day).click();
	String day1 = DateChangeUtils.da(day);
	String date = year + "-" + month + "-" + day1;
	try {
	  String newDate = aea.getText(carInfo.odbMineCarInfoBuyDate());
	  if (newDate.equals(date)) {
		logger.info("购买日期修改成功");
	  } else {
		logger.error("购买日期修改失败，原值未改变");
		throw new NoSuchElementException("购买日期修改失败，原值未改变");
	  }
	} catch (NoSuchElementException e) {
	  AndroidKeyboard.back();
	  String title = aea.getText(carInfo.odbTitle());
	  if ("我的".equals(title)) {
		mine.odbMineCarInfo().click();
		throw new NoSuchElementException("购买日期修改失败，原值未改变");
	  } else {
		logger.error("购买日期修改失败，未返回详情列表");
		throw new NoSuchElementException("购买日期修改失败，未返回详情列表");
	  }
	}
  }

  /**
   * 修改投保日期
   */
  @Test(priority = 7)
  public void testMineCarInfoChangeCoverDate() {
	carInfo.odbMineCarInfoCoverDate().click(); // 打开日期控件
	for (int i = 0; i < 3; i++) {
	  carInfo.odbDatePreMonth().click(); // 上一月
	  HolmosBaseUtils.sleep(500);
	}
	// 获取当前月份
	String currentDate = aea.getText(carInfo.odbDateTitle());
	String month = currentDate.split("\\s+")[0];
	String year = currentDate.split("\\s+")[1];
	month = DateChangeUtils.dateNumber(month);
	// 获取要点击的日期
	int day = JavaUtils.random(28);
	day = day + 1;
	carInfo.odbDateDay(day).click();
	// 拼接自己选中的日期为实际格式如：2016-01-12
	String day1 = DateChangeUtils.da(day);
	String date = year + "-" + month + "-" + day1;
	try {
	  String newDate = aea.getText(carInfo.odbMineCarInfoCoverDate());
	  if (newDate.equals(date)) {
		logger.info("投保日期修改成功");
	  } else {
		logger.error("投保日期修改失败，原值未改变");
		throw new NoSuchElementException("投保日期修改失败，原值未改变");
	  }
	} catch (NoSuchElementException e) {
	  AndroidKeyboard.back();
	  String title = aea.getText(carInfo.odbTitle());
	  if ("我的".equals(title)) {
		mine.odbMineCarInfo().click();
		throw new NoSuchElementException("投保日期修改失败，原值未改变");
	  } else {
		logger.error("投保日期修改失败，未返回详情列表");
		throw new NoSuchElementException("投保日期修改失败，未返回详情列表");
	  }
	}
  }

  @BeforeClass
  public void beforeClass() {
	con.SetUp();
	lSuccess.login(3);
	guideActivityPages.odbMine().click();
	mine.odbMineCarInfo().click();
	HolmosBaseUtils.sleep(1000);
	logger.info("打开车辆信息页面");
  }

  @AfterClass
  public void afterClass() {
	lSuccess.quitAppium();
	logger.info("退出appium，回收session");
  }
}
