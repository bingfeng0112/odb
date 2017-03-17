package com.tianan.odb.grid_view;

import java.util.NoSuchElementException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CreateActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.login_success;

import io.appium.java_client.TouchAction;

public class test_GridView_yiwaibaoxian {
	
	private static MyLogger logger = MyLogger.getLogger(test_GridView_yiwaibaoxian.class);
	
	//意外保险
	@Test
	public void test_GridView_yiwaibaoxian() {
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
		//点击天天福利
		tac.tap(page.odb_GridView_yiwaibaoxian()).perform();
		HolmosBaseUtils.sleep(7000);
		//获取天天福利页面xml
		String xmls =con.driver.getPageSource();
		//判断意外保险入口是否正常打开
		if(xmls.contains("热销产品")){
			
			logger.info("意外保险测试通过");
			
		}
		else{
			
			logger.error("意外保险存在问题，请检查！");
			con.driver.quit();
			throw new NoSuchElementException();
		}
		
		
			
	}
	
	
		@AfterTest
	public void tearDown() throws Exception{
		
		logger.info("资源释放成功");
		ConfigurationAndroid.driver.quit();
		

}
}