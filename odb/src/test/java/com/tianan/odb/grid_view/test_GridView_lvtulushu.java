package com.tianan.odb.grid_view;
import java.util.NoSuchElementException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CreateActivityPages;
import com.tianan.odb.configuration_adb.adbDevice;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.TouchActionUtils;
import com.tianan.odb.public_infunction.login_success;

import io.appium.java_client.TouchAction;
public class test_GridView_lvtulushu {
	private static MyLogger logger = MyLogger.getLogger(test_GridView_lvtulushu.class);
	@Test
	public void test_GridView_lvtulushu(){
		adbDevice adb =new adbDevice();
		ConfigurationAndroid con = new ConfigurationAndroid();
		CreateActivityPages page = new CreateActivityPages();
		login_success login = new login_success();
		//清除/storage/sdcard0/Android/data/com.tian.obd.android/files/image/*下的文件
		adb.deleteImage();
		//调用ConfigurationAndroid预制方法
		con.SetUp();
		//调用登录方法，传driver[传int3指的是第一次安装时，有4页欢迎页，需要滑动3次
		login.login(3);
		//调取点击方法
		TouchActionUtils tau = new TouchActionUtils();
		//点击旅途路书
		tau.tap(page.odb_GridView_lvtu());
		HolmosBaseUtils.sleep(2000);
		//点击相机快门
		tau.tap(page.odb_GridView_lvtu_xiangjikuaimen());
		HolmosBaseUtils.sleep(2000);
		//拉取storage/sdcard0/Android/data/com.tian.obd.android/files/image下的文件信息
		String imagename = adb.getImagename();
		//判断是否正确获取图片名称
		if(!imagename.isEmpty()){
				
			logger.info("测试通过！");
			
		}
		else{
			logger.error("测试存在问题，请检查！");
			con.driver.quit();
			throw new NoSuchElementException();
			
		}
			
			
		
	}
	
	@AfterTest
	public void tearDown() throws Exception{
	
	ConfigurationAndroid.driver.quit();
	logger.info("资源释放成功");
	
}

}
