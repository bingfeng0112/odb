package com.tianan.odb.grid_view;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CreateActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.login_success;

import io.appium.java_client.TouchAction;
public class test_GridView_zhoubian_driveruser_park {
	private static MyLogger logger = MyLogger.getLogger(test_GridView_zhoubian_driveruser_park.class);
	@Test
	public void test_GridView_zhoubian_driveruser(){
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
		tac.tap(page.odb_GridView_zhoubian()).perform();
		HolmosBaseUtils.sleep(2000);
		//定位司机当前位置
		tac.tap(page.odb_GridView_zhoubian_driveruser()).perform();
		HolmosBaseUtils.sleep(2000);
		//点击停车场
		tac.tap(page.odb_GridView_zhoubian_park()).perform();
		HolmosBaseUtils.sleep(2000);
		//点击查看
		tac.tap(page.odb_GridView_zhoubian_park_check()).perform();
		HolmosBaseUtils.sleep(2000);
		//校验是否已进入停车场详情页面(执行脚本时，需要在硅谷亮城办公室)
		Assert.assertEquals(page.odb_GridView_zhoubian_park_check_name().getText(),"停车场(硅谷亮城2号楼A座东南)");
		HolmosBaseUtils.sleep(2000);				
		
	}
	@AfterTest
	public void tearDown() throws Exception{
	
	ConfigurationAndroid.driver.quit();
	logger.info("资源释放成功");

}
}
