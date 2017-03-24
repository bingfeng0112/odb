package com.tianan.odb.carinfo;

import java.util.NoSuchElementException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CarinfoActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.TouchActionUtils;
import com.tianan.odb.public_infunction.login_success;
/**
 * @author: 张行
 * 车机已经和app绑定，车信息模块→周边门店测试用例
 */
public class test_Carinfo_zhoubian {
    private static MyLogger logger = MyLogger.getLogger(test_Carinfo_zhoubian.class);
  @Test
  public void test_Carinfo_zhoubian() {
	CarinfoActivityPages page = new CarinfoActivityPages();
	login_success login = new login_success();
	ConfigurationAndroid con = new ConfigurationAndroid();
	//调用ConfigurationAndroid预制方法
	con.SetUp();
	//调用登录方法，传driver[传int3指的是第一次安装时，有4页欢迎页，需要滑动3次
	login.login(3);
	//调取点击方法
	TouchActionUtils tau = new TouchActionUtils();
	HolmosBaseUtils.sleep(2000);
	//点击车信息
	tau.tap(page.odb_grid_carinfo());
	HolmosBaseUtils.sleep(2000);
	//点击车信息→周边门店
	tau.tap(page.odb_carinfo_zhoubian());
	HolmosBaseUtils.sleep(10000);
	//获取周边门店信息的xml
	String xmls =ConfigurationAndroid.driver.getPageSource();
	HolmosBaseUtils.sleep(2000);
	System.out.println(xmls);
	//校验易车生活是否被正确打开
	if(xmls.contains("易车生活")) {
	    logger.info("测试通过");
	    
	}else {
	    logger.error("测试周边门店功能存在问题，请检查！");
	    HolmosBaseUtils.sleep(1000);
	    ConfigurationAndroid.driver.quit();
	    HolmosBaseUtils.sleep(1000);
	    throw new NoSuchElementException();
	}
	
  }
  @AfterTest
  public void tearDown() throws Exception{
	ConfigurationAndroid.driver.quit();
	logger.info("资源释放成功");
	
}
}
