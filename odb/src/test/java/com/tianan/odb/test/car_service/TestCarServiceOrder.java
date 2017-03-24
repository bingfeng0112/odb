package com.tianan.odb.test.car_service;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.GuideActivityPages;
import com.tianan.odb.android_pages.carserver.CarServericePackageOrderActivityPages;
import com.tianan.odb.android_pages.carserver.CarServiceActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.AndroidElementAttribute;
import com.tianan.odb.public_infunction.login_success;

/**
 * 检查套餐订购页面所有套餐是否可以被选中，并购买一个套餐
 * 
 * @author: 张豆豆
 * @create: Mar 23, 2017
 */
public class TestCarServiceOrder {
  private static MyLogger logger = MyLogger.getLogger(TestCarServiceOrder.class);
  private ConfigurationAndroid con = new ConfigurationAndroid();
  private login_success lSuccess = new login_success();
  private GuideActivityPages guideActivityPages = new GuideActivityPages();
  private CarServiceActivityPages carservice = new CarServiceActivityPages();
  private AndroidElementAttribute elementAttribute = new AndroidElementAttribute();
  private CarServericePackageOrderActivityPages packageOrder = new CarServericePackageOrderActivityPages();

  @BeforeClass
  private void setUp() {
	// 启动app并登录
	con.SetUp();
	lSuccess.login(3);

	// 打开套餐订购
	guideActivityPages.odbCarService().click();
	carservice.odbCarServicePackageOder().click();
  }

  /**
   * 检查套餐列表中所有套餐是否可以点击
   */
  @Test
  public void testCheckOrder() {
	logger.info("开始检查所有套餐是否能被选中");
	int i = 0;
	List<String> order = new ArrayList<String>();
	packageOrder.odbServicePackageOrder3G().click();
	if (elementAttribute.isFocused(packageOrder.odbServicePackageOrder3G())) {
	  i = i + 1;
	} else {
	  order.add("3G 118.00元无法选中");
	}
	order.size();
	packageOrder.odbServicePackageOrder6G().click();
	if (elementAttribute.isFocused(packageOrder.odbServicePackageOrder6G())) {
	  i = i + 1;
	} else {
	  order.add("6G 198.00元无法选中");
	}
	packageOrder.odbServicePackageOrder12G().click();
	if (elementAttribute.isFocused(packageOrder.odbServicePackageOrder12G())) {
	  i = i + 1;
	} else {
	  order.add("12G 398.00元无法选中");
	}
	packageOrder.odbServicePackageOrder100M().click();
	if (elementAttribute.isFocused(packageOrder.odbServicePackageOrder100M())) {
	  i = i + 1;
	} else {
	  order.add("100M 6.00元无法选中");
	}
	packageOrder.odbServicePackageOrder200M().click();
	if (elementAttribute.isFocused(packageOrder.odbServicePackageOrder200M())) {
	  i = i + 1;
	} else {
	  order.add("200M 10.00元无法选中");
	}
	packageOrder.odbServicePackageOrder300M().click();
	if (elementAttribute.isFocused(packageOrder.odbServicePackageOrder300M())) {
	  i = i + 1;
	} else {
	  order.add("300M 12.00元无法选中");
	}
	packageOrder.odbServicePackageOrder500M().click();
	if (elementAttribute.isFocused(packageOrder.odbServicePackageOrder500M())) {
	  i = i + 1;
	} else {
	  order.add("500M 20.00元无法选中");
	}
	packageOrder.odbServicePackageOrder1G().click();
	if (elementAttribute.isFocused(packageOrder.odbServicePackageOrder1G())) {
	  i = i + 1;
	} else {
	  order.add("1G 36.00元无法选中");
	}
	packageOrder.odbServicePackageOrder6Month().click();
	if (elementAttribute.isFocused(packageOrder.odbServicePackageOrder6Month())) {
	  i = i + 1;
	} else {
	  order.add("6个月 168.00元无法选中");
	}
	packageOrder.odbServicePackageOrder12Month().click();
	if (elementAttribute.isFocused(packageOrder.odbServicePackageOrder12Month())) {
	  i = i + 1;
	} else {
	  order.add("12个月 268.00元无法选中");
	}
	packageOrder.odbServicePackageOrder24Month().click();
	if (elementAttribute.isFocused(packageOrder.odbServicePackageOrder24Month())) {
	  i = i + 1;
	} else {
	  order.add("24个月 398.00元无法选中");
	}
	packageOrder.odbServicePackageOrder36Month().click();
	if (elementAttribute.isFocused(packageOrder.odbServicePackageOrder36Month())) {
	  i = i + 1;
	} else {
	  order.add("36个月 598.00元无法选中");
	}
	if (i == 12) {
	  logger.info("所有套餐都可以被选中");
	} else {
	  String errOrder = "无法选中的订单有";
	  for (int index = 0; index < order.size(); index++) {
		errOrder = errOrder + "\t" + order.get(index);
	  }
	  logger.error(errOrder);
	  throw new NoSuchElementException(errOrder);
	}
	HolmosBaseUtils.sleep(2000);
  }

  @Test(dependsOnMethods = "testCheckOrder")
  public void testBuyOrder() {
	logger.info("测试购买一个套餐");
	packageOrder.odbServicePackageOrder100M().click();
	packageOrder.odbServicePackageOrderBuyNow().click();
	HolmosBaseUtils.sleep(500);
	packageOrder.odbServicePackageOrderPayBtn().click();
	HolmosBaseUtils.sleep(3000);
	try {
	  packageOrder.odbTitleBar();
	  logger.error("未打开支付页面");
	  throw new NoSuchElementException("未打开支付页面");
	} catch (NoSuchElementException e) {
	  logger.info("已打开支付页面");
	}
  }

  @AfterClass
  private void tearDown() {
	ConfigurationAndroid.driver.quit();
  }
}
