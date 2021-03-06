package com.tianan.odb.carinfo;

import java.util.NoSuchElementException;
/**
 * @author: 张行
 * 车机已经和app绑定，车信息模块→向上滑动手机号信息栏→当月行驶里程（驾乘次数）测试用例
 */

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CarinfoActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.Androidswipe;
import com.tianan.odb.public_infunction.TouchActionUtils;
import com.tianan.odb.public_infunction.login_success;

public class test_Carinfo_phonenum_drivernum {
    private static MyLogger logger = MyLogger.getLogger(test_Carinfo_phonenum_drivernum.class);
  @Test
  public void test_Carinfo_phonenum_drivernum() {
	CarinfoActivityPages page = new CarinfoActivityPages();
	login_success login = new login_success();
	ConfigurationAndroid con = new ConfigurationAndroid();
	Androidswipe  asp= new Androidswipe();
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
	//向上滑动手机号提示框
	asp.elementSwipeToUp(page.odb_carinfo_phonenumber(), 1000);
	HolmosBaseUtils.sleep(2000);
	//点击隐藏页面上的驾驶统计按钮
	tau.tap(page.odb_carinfo_phonenumber_drivernum());
	HolmosBaseUtils.sleep(2000);
	//点击车信息→当月形式里程→驾乘次数
	tau.tap(page.odb_carinfo_Mmileage_driver_num());
	//判断本周驾乘次数是否加载成功
	if(page.odb_carinfo_Mmileage_mileage_number().isEnabled()) {
	    String num = page.odb_carinfo_Mmileage_mileage_number().getText();
	    logger.info("本周驾乘次数:"+num);
	    logger.info("本周驾乘次数测试通过");
	    //切换到上周页面
	    tau.tap(page.odb_carinfo_Mmileage_mileage_lefttab());
	    HolmosBaseUtils.sleep(5000);
	    //判断上周驾乘次数数据是否加载成功
	    if(page.odb_carinfo_Mmileage_mileage_number_next().isEnabled()) {
		String num_next=page.odb_carinfo_Mmileage_mileage_number_next().getText();
		logger.info("上周驾乘次数:"+num_next);
		logger.info("上周行驾乘次数测试通过");
	    }else {
		    logger.error("上周驾乘次数功能存在问题，请检查！");
		    HolmosBaseUtils.sleep(1000);
		    ConfigurationAndroid.driver.quit();
		    HolmosBaseUtils.sleep(1000);
		    throw new NoSuchElementException();
	    }
	    
	}else {
	    
	    logger.error("本周驾乘次数功能存在问题，请检查！");
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
