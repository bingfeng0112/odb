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
public class test_GridView_tiantainfuli {
	private static MyLogger logger = MyLogger.getLogger(test_GridView_tiantainfuli.class);
	@Test
	//天天福利
	public void test_GridView_tiantainfuli() {
		
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
		tac.tap(page.odb_GridView_tiantianfuli()).perform();
		HolmosBaseUtils.sleep(7000);
		//获取webview-xml信息
		String xmls =con.driver.getPageSource();
		
		if(xmls.contains("优惠券")){
			
			logger.info("天天福利验证通过");
		}
		else{
			
			logger.error("天天福利存在问题，请检查！");
			HolmosBaseUtils.sleep(1000);
			ConfigurationAndroid.driver.quit();
			HolmosBaseUtils.sleep(1000);
			throw new NoSuchElementException();
			
		}
		
		
				//切换webview
/*		Set<String> contexts =con.driver.getContextHandles();
			
				System.out.println("1111111111");
			for(String srt:contexts){
				
				System.out.println(srt);
			}*/
		
	}
	
	
	
		@AfterTest
	public void tearDown() throws Exception{
		
		ConfigurationAndroid.driver.quit();
		logger.info("资源释放成功");
		
	}

}
