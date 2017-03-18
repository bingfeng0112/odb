package com.tianan.odb.grid_view;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CreateActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.TouchActionUtils;
import com.tianan.odb.public_infunction.login_success;

import io.appium.java_client.TouchAction;
public class test_GridView_zhoubian_dirveruser_gas {
	private static MyLogger logger = MyLogger.getLogger(test_GridView_zhoubian_dirveruser_gas.class);
	@Test
	public void test_GridView_zhoubian_dirver_gas(){
		ConfigurationAndroid con = new ConfigurationAndroid();
		CreateActivityPages page = new CreateActivityPages();
		login_success login = new login_success();
		//调用ConfigurationAndroid预制方法
		con.SetUp();
		//进行登录
		login.login(ConfigurationAndroid.driver);
		//调取点击方法
		TouchActionUtils tau = new TouchActionUtils();
		HolmosBaseUtils.sleep(2000);
		//点击周边出行
		 tau.tap(page.odb_GridView_zhoubian());
		HolmosBaseUtils.sleep(2000);
		//定位司机当前位置
		tau.tap(page.odb_GridView_zhoubian_driveruser());
		HolmosBaseUtils.sleep(2000);
		//点击加油站
		tau.tap(page.odb_GridView_zhoubian_gas());
		HolmosBaseUtils.sleep(2000);
		//点击查看
		tau.tap(page.odb_GridView_zhoubian_gas_check());
		HolmosBaseUtils.sleep(2000);
		//校验是否已进入加油站详情页面(执行脚本时，需要在硅谷亮城办公室)
		Assert.assertEquals(page.odb_GridView_zhoubian_gas_check_name().getText(), "北体加油站");
		HolmosBaseUtils.sleep(1000);
	}
	@AfterTest
	public void tearDown() throws Exception{
	
	ConfigurationAndroid.driver.quit();
	logger.info("资源释放成功");
}
}
