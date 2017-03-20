package com.tianan.odb.public_infunction;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
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

    public AndroidDriver<AndroidElement> login(
	    AndroidDriver<AndroidElement> driver) {
	Androidswipe swipe = new Androidswipe();
	CreateActivityPages pages = new CreateActivityPages();
	ConfigurationAndroid con = new ConfigurationAndroid();
	AndroidDriver<AndroidElement> login_driver = driver;
	// 判断是否已经进行了登录
	if (pages.odb_titlename().getText().equals("发现")) {
	    return login_driver;
	} else {
	    // 设置登录账号
	    pages.odb_login_usernametxt().sendKeys("18618192101");
	    HolmosBaseUtils.sleep(1000);
	    // 设置登录密码
	    pages.odb_login_passwdtxt().sendKeys("123456");
	    HolmosBaseUtils.sleep(1000);
	    // 点击登录按钮
	    pages.odb_login_btn().click();
	    HolmosBaseUtils.sleep(5000);
	    return login_driver;
	}
    }

    /**
     * 登录功能，取消升级、滑动欢迎页面，登录app
     * 
     * @author 张豆豆
     * @param num
     *            滑动次数
     */
    public void login(int num) {
	CreateActivityPages pages = new CreateActivityPages();
	// 判断是否有升级
	try {
	    WebElement canle = pages.odb_canale();
	    canle.click();
	    logger.info("取消app升级");
	    getTitle(num);
	} catch (NoSuchElementException e) {
	    getTitle(num);
	}
    }

    public void getTitle(int num) {
	CreateActivityPages pages = new CreateActivityPages();
	try {
	    WebElement title = pages.odb_titlename();
	    if (title.getText().equals("登录")) {
		// 开始登陆
		logger.info("app未登录，开始进行登录");
		loginApp();
	    } else {
		logger.info("app已登录");
	    }
	} catch (NoSuchElementException e) {
	    logger.info("初次安装，开始进行欢迎页滑动");
	    Androidswipe androidswipe = new Androidswipe();
	    for (int i = 0; i < num; i++) {
		androidswipe.customSwipe(9, 1, 10, 1000);
		HolmosBaseUtils.sleep(1000);
	    }
	    ConfigurationAndroid.driver.tap(1, 500, 500, 500);
	    loginApp();
	}
    }

    public void loginApp() {
	// 开始登陆系统
	logger.info("开始登录系统");
	pages.odb_login_usernametxt().sendKeys("18618192101");
	HolmosBaseUtils.sleep(1000);
	pages.odb_login_passwdtxt().sendKeys("123456");
	HolmosBaseUtils.sleep(1000);
	pages.odb_login_btn().click();
	HolmosBaseUtils.sleep(5000);
    }

    public void logoutApp() {
	// 点击导航栏→我的
	pages.odb_guide_Mine().click();
	HolmosBaseUtils.sleep(2000);
	Androidswipe androidswipe = new Androidswipe();
	// 向上滑动200个像素（为了让退出按钮显示出来）
	androidswipe.swipeToUp(200);
	HolmosBaseUtils.sleep(2000);
	// 点击退出按钮
	pages.odb_guide_Mine_Quit().click();
	HolmosBaseUtils.sleep(2000);
    }
}
