package com.tianan.odb.public_infunction;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CreateActivityPages;
import com.tianan.odb.android_pages.LoginActivityPages;
import com.tianan.odb.android_pages.mine.MineActivityPages;
import com.tianan.odb.android_pages.GuideActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class login_success {
  installorsetup is = new installorsetup();
  LoginActivityPages loginPages = new LoginActivityPages();
  GuideActivityPages guide = new GuideActivityPages();
  MineActivityPages mine = new MineActivityPages();
  CreateActivityPages pages = new CreateActivityPages();
  Androidswipe androidswipe = new Androidswipe();
  private static MyLogger logger = MyLogger.getLogger(login_success.class);

  public AndroidDriver<AndroidElement> login(AndroidDriver<AndroidElement> driver) {
	CreateActivityPages pages = new CreateActivityPages();
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
   *          滑动次数
   */
  public void login(int num) {
	// 判断是否有升级
	try {
	  WebElement canle = loginPages.odbUpdateCanale();
	  canle.click();
	  logger.info("取消app升级");
	  getTitle(num);
	} catch (NoSuchElementException e) {
	  getTitle(num);
	}
  }

  /**
   * 获取标题栏，如果未获取到滑动屏幕
   * 
   * @author 张豆豆
   * @param num
   *          滑动次数
   */
  public void getTitle(int num) {
	try {
	  WebElement title = loginPages.odbTitleBar();
	  if (title.getText().equals("登录")) {
		// 开始登陆
		logger.info("app未登录，开始进行登录");
		loginApp();
	  } else {
		logger.info("app已登录");
	  }
	} catch (NoSuchElementException e) {
	  logger.info("初次安装，开始进行欢迎页滑动");
	  for (int i = 0; i < num; i++) {
		Androidswipe.customSwipe(9, 1, 10, 1000);
		HolmosBaseUtils.sleep(1000);
	  }
	  ConfigurationAndroid.driver.tap(1, 500, 500, 500);
	  loginApp();
	}
  }

  /**
   * 登录app
   * 
   * @author 张豆豆
   */
  public void loginApp() {
	// 开始登陆系统
	logger.info("开始登录系统");
	loginPages.odbLoginUsernametxt().sendKeys("13888881111");
	HolmosBaseUtils.sleep(1000);
	loginPages.odbLoginPasswdtxt().sendKeys("123456");
	HolmosBaseUtils.sleep(1000);
	loginPages.odbLoginBtn().click();
	HolmosBaseUtils.sleep(5000);
  }

  /**
   * app退出登录
   * 
   * @author 张豆豆
   */
  public void logoutApp() {
	logger.info("app退出登录");
	// 点击导航栏→我的
	guide.odbMine().click();
	HolmosBaseUtils.sleep(2000);
	androidswipe.swipeToUp(200);
	HolmosBaseUtils.sleep(2000);
	// 点击退出按钮
	mine.odbMineQuitBtn().click();
	HolmosBaseUtils.sleep(2000);
  }
  public void quitAppium() {
	ConfigurationAndroid.driver.quit();
  }
}
