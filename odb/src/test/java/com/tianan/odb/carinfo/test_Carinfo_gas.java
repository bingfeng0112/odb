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
 * 车机已经和app绑定，车信息模块→加油站功能测试用例
 */
public class test_Carinfo_gas {
    private static MyLogger logger = MyLogger.getLogger(test_Carinfo_gas.class);
  @Test
  public void test_Carinfo_gas() {
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
	//点击车信息→加油站
	tau.tap(page.odb_carinfo_gas());
	HolmosBaseUtils.sleep(2000);
	//点击车信息→加油站→发送到我的智能车载系统
	tau.tap(page.odb_carinfo_gas_Issued());
	HolmosBaseUtils.sleep(2000);
	//点击车信息→加油站→发送到我的智能车载系统→确定发送按钮
	tau.tap(page.odb_carinfo_gas_Issued_yes());
	HolmosBaseUtils.sleep(5000);
	//校验信息是否发送成功
	if(page.odb_carinfo_gas_Issued_success().getText().equals("目的地发送成功!")) {
	    
	    logger.info("测试通过！");
	    //点击确定按钮
	    tau.tap(page.odb_carinfo_gas_Issued_success_submit());
	    HolmosBaseUtils.sleep(2000);
	    
	}else {
	    logger.error("测试加油站功能存在问题，请检查！");
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
