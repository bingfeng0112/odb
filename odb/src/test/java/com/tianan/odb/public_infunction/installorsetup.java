package com.tianan.odb.public_infunction;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

//import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.configuration_device.ConfigurationAndroid;;

public class installorsetup {
	
	
	//private static MyLogger logger = MyLogger.getLogger(installorsetup.class);  //生成日志输出对象
	
	ConfigurationAndroid con = new ConfigurationAndroid();  //生成PC与appium对象 、appium与手机设备对象
	
	@Test
	public void installorsetupTest() throws MalformedURLException {
		
		//CreateActivityPages pages = new CreateActivityPages(); //pages库
		
		
		con.SetUp(); //调用app安装或直接启动方法
		
		
		
		
		
/*		//切换webview
	Set<String> contexts =con.driver.getContextHandles();
		
			System.out.println("1111111111");
		for(String srt:contexts){
			
			System.out.println(srt);
		}*/
	/*	for(int i=0;i<contexts.size();i++){
			
			System.out.println(	con.driver.context((String) contexts.toArray()[i] ));
			
		}*/
		
		//con.driver.context("WEBVIEW_com.android.tianmall");
	
	
		//con.driver.quit();
		
		
		HolmosBaseUtils.sleep(1000);

		
	}
	
	
/*//	@AfterTest
////	public void tearDown() throws Exception{
////		
////		ConfigurationAndroid.driver.quit();
////		System.out.println("资源释放成功");
////		
////	}
*/
}
