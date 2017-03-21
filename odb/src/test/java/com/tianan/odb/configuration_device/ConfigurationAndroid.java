package com.tianan.odb.configuration_device;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.holmos.webtest.log.MyLogger;
import com.tianan.odb.configuration_adb.adbDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ConfigurationAndroid {

	//public static AppiumDriver driver;
	
	public static AndroidDriver<AndroidElement> driver;
	
	//AndroidDriver<AndroidElement>
	private static MyLogger logger = MyLogger.getLogger(ConfigurationAndroid.class);
	adbDevice adb =new adbDevice();
	public String port="4723";
	public String udid;
	
	// 不需要安装应用程序，直接激活应用程序
	public AppiumDriver<AndroidElement> SetUp()  {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		adbDevice adb =new adbDevice();
		
		// 配置webdriver,配置appium与手机连接
		capabilities.setCapability(CapabilityType.BROWSER_NAME,"");
		//capabilities.setCapability("device","Appium");
		capabilities.setCapability("automationName","Appium");//选择测试框架appium 
		//如不声明automationName，则默认使用Appium模式
		capabilities.setCapability("deviceName",adb.getAndroidModel()); //获取连接设备的名称
		capabilities.setCapability("platformVersion",adb.getAndroidVersion()); //当前设备安卓版本号
		capabilities.setCapability("platformName","Android");  //需要测试的手机系统
		capabilities.setCapability("udid",adb.getDeviceId());  //获取当前设备的编号
		capabilities.setCapability("unicodeKeyboard",true);  // 使用 Unicode 输入法
		capabilities.setCapability("resetKeyboard",true);
		//判断测试程序包是否安装到了设备
		if (adb.isInstalled("com.tian.obd.android")==false) {
			
			logger.info("未安装指定app，进行安装app操作");
			
			File appDir = new File("apps/app");
			File app = new File(appDir, "HiWay_1.2.6_release.apk");	//测试app名称
			capabilities.setCapability("app", app.getAbsolutePath());//安装包的绝对路径设置
		}
		capabilities.setCapability("appPackage", "com.tian.obd.android"); //设置测试app包名
		capabilities.setCapability("appActivity","com.tian.obd.android.SplashActivity");//测试app启动页
		try {
			driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:"+port+"/wd/hub"),
					capabilities);			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		logger.info("app启动成功！");
		// 设置超时
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

//	// 需要安装应用程序，直接激活应用程序
//	public AppiumDriver SetUp1() {
//
//		File classpathRoot = new File(System.getProperty("user.dir"));
//		File appDir = new File("apps/app");
//		File app = new File(appDir, "Whistle_android_test.apk");
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//
//		// 配置webdriver
//		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
//		capabilities.setCapability("device", "Appium");
//		capabilities.setCapability("deviceName", adb.getAndroidModel());
//		capabilities.setCapability("platformVersion", adb.getAndroidVersion());
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("udid", adb.getDeviceId());
//		capabilities.setCapability("unicodeKeyboard", true);  
//		capabilities.setCapability("resetKeyboard", true);  
//		capabilities.setCapability("app", app.getAbsolutePath());
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		capabilities.setCapability("appPackage", "com.ruijie.anan.bizlayer");
//		capabilities.setCapability("appActivity",
//				"com.ruijie.anan.ui.WelcomeActivity");
//
//		try {
//			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
//					capabilities);
//		} catch (MalformedURLException e) {
//
//			e.printStackTrace();
//		}
//		// 设置超时
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		return driver;
//	}
//	
//	//判断登录成功后是否弹出升级的提示框
//	
//
//	public AppiumDriver SetUp2(String deviceName,String platformVersion,String udid,String appPackage,String appActivity,String url,String appName) {
//
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		// 閰嶇疆webdriver
//		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
//		capabilities.setCapability("device", "Appium");
//		capabilities.setCapability("deviceName", deviceName);
//		capabilities.setCapability("platformVersion", platformVersion);
//		capabilities.setCapability("platformName","Android");
//		capabilities.setCapability("udid", udid);
//		
//		capabilities.setCapability("unicodeKeyboard", true);  
//		capabilities.setCapability("resetKeyboard", true);  
//		capabilities.setCapability("appPackage", appPackage);
//		capabilities.setCapability("appActivity",appActivity);
//
//		if (adb.isInstalled(appPackage)==false) {
//			// 鎺у埗鍙版墦鍗版棩蹇 
//			logger.info("install apk");
//			
//			File appDir = new File("apps/app");
//			File app = new File(appDir, appName);	
//			capabilities.setCapability("app", app.getAbsolutePath());
//		}
//		System.out.println(deviceName +","+ platformVersion +","+ udid +","+ appPackage +","+ appActivity +","+ url);
//		try {
//			driver = new AndroidDriver(new URL(url), capabilities);
//			
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		System.out.println(driver);
//		// 璁剧疆瓒呮椂
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		return driver;
//	}

	
}
