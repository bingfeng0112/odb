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
 * 车机已经和app绑定，车信息模块→当月行驶里程（行驶里程）测试用例
 */
public class test_Carinfo_Mmileage_mileage {
    private static MyLogger logger = MyLogger.getLogger(test_Carinfo_Mmileage_mileage.class);
  @Test
  public void test_Carinfo_Mmileage() {
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
	//点击车信息→当月形式里程
	tau.tap(page.odb_carinfo_Mmileage());
	HolmosBaseUtils.sleep(2000);
	//点击车信息→当月形式里程→行驶里程
	tau.tap(page.odb_carinfo_Mmileage_mileage());
	HolmosBaseUtils.sleep(2000);
	//判断本周行驶数据是否加载成功
	if(page.odb_carinfo_Mmileage_mileage_number().isEnabled()) {
	    String num = page.odb_carinfo_Mmileage_mileage_number().getText();
	    logger.info("本周行驶里程:"+num);
	    logger.info("本周行驶里程测试通过");
	    //切换到上周页面
	    tau.tap(page.odb_carinfo_Mmileage_mileage_lefttab());
	    HolmosBaseUtils.sleep(3000);
	    //判断上周行驶数据是否加载成功
	    if(page.odb_carinfo_Mmileage_mileage_number_next().isEnabled()) {
		String num_next=page.odb_carinfo_Mmileage_mileage_number_next().getText();
		logger.info("上周行驶里程:"+num_next);
		logger.info("上周行驶里程测试通过");
	    }else {
		    logger.error("上周行驶里程功能存在问题，请检查！");
		    HolmosBaseUtils.sleep(1000);
		    ConfigurationAndroid.driver.quit();
		    HolmosBaseUtils.sleep(1000);
		    throw new NoSuchElementException();
	    }
	    
	}else {
	    
	    logger.error("本周行驶里程功能存在问题，请检查！");
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
