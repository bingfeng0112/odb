package com.tianan.odb.carinfo;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CarinfoActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.TouchActionUtils;
import com.tianan.odb.public_infunction.login_success;

public class test_Carinfo_souku {
   private static MyLogger logger = MyLogger.getLogger(test_Carinfo_souku.class);
  @Test
  public void test_Carinfo_souku() {
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
	try {
	    //点击车信息→嗖酷
	    tau.tap(page.odb_carinfo_kuso());
	    HolmosBaseUtils.sleep(2000);
	    //点击嗖酷位置搜索框
	    tau.tap(page.odb_carinfo_kuso_search1());
	    HolmosBaseUtils.sleep(2000);
	    //输入输入搜索地址
	    page.odb_carinfo_kuso_search2().sendKeys("北京南站");
	    HolmosBaseUtils.sleep(2000);
	    //点击搜索按钮
	    tau.tap(page.odb_carinfo_kuso_serarch_commit());
	    HolmosBaseUtils.sleep(2000);
	    //点击搜索列表中，第一个地址信息
	    tau.tap(page.odb_carinfo_kuso_serarch_content_NO1());
	    HolmosBaseUtils.sleep(2000);
	    //点击发送至车机设备
	    tau.tap(page.odb_carinfo_kuso_serarch_location_Issued());
	    HolmosBaseUtils.sleep(2000);
	    //确认向车机设备发送地址
	    tau.tap(page.odb_carinfo_kuso_serarch_location_Issued_yes());
	    HolmosBaseUtils.sleep(8000);
	    //验证是否发送成功
	    if(page.odb_carinfo_kuso_success().getText().equals("目的地发送成功!")) {
		    logger.info("测试通过!");
		    HolmosBaseUtils.sleep(1000);
		    //点击确定按钮
		    tau.tap(page.odb_carinfo_kuso_success_btn());
		    HolmosBaseUtils.sleep(1000);
	    }else {
		//测试存在问题，扔出元素未找到的异常
		throw new NoSuchElementException("测试存在问题");
	    }
	}
  	
	catch(NoSuchElementException e) {
	    
	    logger.error("未绑定设备或测试存在问题，请检查或绑定设备后再进行测试!");
	    ConfigurationAndroid.driver.quit();
	    throw new NoSuchElementException("未绑定设备或测试存在问题，请检查或绑定设备后再进行测试!");
	    
	}
      
  
}
	@AfterTest
	public void tearDown() throws Exception{
	
	ConfigurationAndroid.driver.quit();
	logger.info("资源释放成功");
	}
  
}