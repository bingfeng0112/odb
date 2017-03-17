package com.tianan.odb.login;
import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CreateActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.Androidswipe;

import io.appium.java_client.android.AndroidElement;
public class test_login {
	@Test
	public void login_success() throws  MalformedURLException{
		Androidswipe swipe = new Androidswipe();
		CreateActivityPages pages = new CreateActivityPages();
		ConfigurationAndroid con = new ConfigurationAndroid();
		test_login login = new test_login();
		con.SetUp();//调用启动app方法
			//判断是否已经进行了登录
		if(pages.odb_titlename().getText().equals("发现")){
			//点击导航栏→我的
			try{
			AndroidElement aElement =ConfigurationAndroid.driver.findElement(By.id("com.tian.obd.android:id/share_rd_btn"));
			aElement.click();
			System.out.println(aElement.getText());
			} catch (NoSuchElementException e) {
				System.out.println("NoSuchElementException");
			}
			pages.odb_guide_Mine().click();
			HolmosBaseUtils.sleep(2000);
			//向上滑动200个像素（为了让退出按钮显示出来）
			swipe.swipeToUp(ConfigurationAndroid.driver, 200);
			HolmosBaseUtils.sleep(2000);
			//点击退出按钮
			pages.odb_guide_Mine_Quit().click();
			HolmosBaseUtils.sleep(2000);
			/* --------------------进行登录-------------------------*/
			//设置登录账号
			pages.odb_login_usernametxt().sendKeys("18618192101");
			HolmosBaseUtils.sleep(1000);
			//设置登录密码
			pages.odb_login_passwdtxt().sendKeys("123456");
			HolmosBaseUtils.sleep(1000);
			//点击登录按钮
			pages.odb_login_btn().click();
			HolmosBaseUtils.sleep(5000);
			//校验是否登录成功
			Assert.assertEquals(pages.odb_guide_finder().getText(), "发现");
			HolmosBaseUtils.sleep(1000);
			con.driver.quit();
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
			//校验是否登录成功
			Assert.assertEquals(pages.odb_guide_finder().getText(), "发现");
			HolmosBaseUtils.sleep(1000);
			con.driver.quit();
		}
	}
}
