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

public class test_Carinfo_tuhu {
    private static MyLogger logger = MyLogger.getLogger(test_Carinfo_tuhu.class);
  @Test
  public void test_Carinfo_tuhu() {
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
	//点击车信息→途虎商城
	tau.tap(page.odb_carinfo_tuhu());
	HolmosBaseUtils.sleep(10000);
	//获取途虎商城xml信息
	String xmls =ConfigurationAndroid.driver.getPageSource();
	//判断途虎商城是否被正常打开
	if(xmls.contains("天天秒杀")) {
	    logger.info("测试通过！");
	}
	else {
	    
	    logger.error("测试途虎商城功能存在问题，请检查！");
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
