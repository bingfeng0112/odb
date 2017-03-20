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
		//调用登录方法，传driver[传int3指的是第一次安装时，有4页欢迎页，需要滑动3次
		login.login(3);
		//调取点击方法
		TouchActionUtils tau = new TouchActionUtils();
		HolmosBaseUtils.sleep(2000);
		//点击发现
		tau.tap(page.odb_guide_finder());
		HolmosBaseUtils.sleep(2000);
		//点击天天福利
		tau.tap(page.odb_GridView_tiantianfuli());
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
