package com.tianan.odb.public_infunction;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CreateActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class login_success {
	installorsetup is = new installorsetup();
	CreateActivityPages pages = new CreateActivityPages();
	private static MyLogger logger = MyLogger.getLogger(login_success.class);
	public  AndroidDriver<AndroidElement> login( AndroidDriver<AndroidElement> driver) {
		Androidswipe swipe = new Androidswipe();
		CreateActivityPages pages = new CreateActivityPages();
		ConfigurationAndroid con = new ConfigurationAndroid();
		AndroidDriver<AndroidElement> login_driver = driver;
			//判断是否已经进行了登录
		if(pages.odb_titlename().getText().equals("发现")){
			return login_driver;			
		}
		else{
			//设置登录账号
			pages.odb_login_usernametxt().sendKeys("18618192101");
			HolmosBaseUtils.sleep(1000);
			//设置登录密码
			pages.odb_login_passwdtxt().sendKeys("123456");
			HolmosBaseUtils.sleep(1000);
			//点击登录按钮
			pages.odb_login_btn().click();
			HolmosBaseUtils.sleep(5000);
			return login_driver;
		}
	}
}
