package com.tianan.odb.grid_view;
import org.testng.annotations.Test;

import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CreateActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.login_success;

import io.appium.java_client.TouchAction;
public class test_GridView_zhoubian_driveruser_4s {
	
	@Test
	public void test_GridView_zhoubian_driveruser_4s(){
		ConfigurationAndroid con = new ConfigurationAndroid();
		CreateActivityPages page = new CreateActivityPages();
		login_success login = new login_success();
		//调用ConfigurationAndroid预制方法
		con.SetUp();
		//进行登录
		login.login(con.driver);
		//使用appium下的TouchAction类中的，TouchAction方法，需要传driver
		TouchAction tac = new TouchAction(con.driver);
		HolmosBaseUtils.sleep(2000);
		//点击周边出行
		 tac = new TouchAction(con.driver);
		tac.tap(page.odb_GridView_zhoubian()).perform();
		HolmosBaseUtils.sleep(2000);
		//定位司机当前位置
		 tac = new TouchAction(con.driver);
		tac.tap(page.odb_GridView_zhoubian_driveruser()).perform();
		HolmosBaseUtils.sleep(2000);
		//点击维修点
		
		
		
		
	}

}
