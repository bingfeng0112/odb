package com.tianan.odb.grid_view;

import java.util.NoSuchElementException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CreateActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.TouchActionUtils;
import com.tianan.odb.public_infunction.login_success;

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
		//调用登录方法，传driver[传int3指的是第一次安装时，有4页欢迎页，需要滑动3次
		login.login(3);
		//调取点击方法
		TouchActionUtils tau = new TouchActionUtils();
		HolmosBaseUtils.sleep(2000);
		//点击发现
		tau.tap(page.odb_guide_finder());
		HolmosBaseUtils.sleep(2000);
		//点击意外保险
		tau.tap(page.odb_GridView_yiwaibaoxian());
		HolmosBaseUtils.sleep(7000);
		//获取天天福利页面xml
		String xmls =con.driver.getPageSource();
		//判断意外保险入口是否正常打开
		if(xmls.contains("热销产品")){
			
			logger.info("意外保险测试通过");
			
		}
		else{
			
			logger.error("意外保险存在问题，请检查！");
			ConfigurationAndroid.driver.quit();
			throw new NoSuchElementException();
		}
		
		
			
	}
	
	
		@AfterTest
	public void tearDown() throws Exception{
		
		logger.info("资源释放成功");
		ConfigurationAndroid.driver.quit();
		

}
}