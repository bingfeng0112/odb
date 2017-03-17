package com.tianan.odb.configuration_device;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.tianan.odb.configuration_adb.adbDevice;

//import com.tianan.odb.android_pages.CreateActivityPages;

//import com.holmos.webtest.log.MyLogger;

public class ZhangHang {

	//private static MyLogger logger = MyLogger.getLogger(ZhangHang.class);
	StringBuilder message = new StringBuilder();
	    public String port;
	    public String udid;
	    private AndroidDriver<AndroidElement> driver;
	    
	    public static WebElement waitForElement(By by, int timeout, WebDriver driver) {
	        WebDriverWait wait = new WebDriverWait(driver, timeout);
	        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));

	        return element;
	      }
	  @Test
	  public void switches() throws InterruptedException {
		  
		  //CreateActivityPages pages = new CreateActivityPages();
		  
		    Thread.sleep(1000);
		    //输入用户名
		    //System.out.println( driver.getPageSource());
		  /*  driver.findElementByXPath("//EditText[@id='username']").clear();
		    driver.findElementByXPath("//EditText[@id='username']").sendKeys("123");*/	 
		    driver.findElementByXPath("//EditText[@id='username']").clear();
		    
		    Thread.sleep(1000);
		    AndroidElement logi = driver.findElementByXPath("//android.widget.Button/parent::android.widget.LinearLayout/child::android.widget.EditText[1]");
		    logi.sendKeys("122222222223");
		    Thread.sleep(5000);
		    //输入密码
		    //点击登录
		    driver.findElementByXPath("//Button[@id='login']").click();
		    Thread.sleep(1000);
		   // driver.findElementByXPath("//Button[@id='login']").click();
		 //   Toast.
		    System.out.println("0000000000000000000");
		   WebElement toast = waitForElement(By.linkText("用户名123未找到"), 10, driver);
		    
		   // WebElement toast = waitForElement(By.partialLinkText("用户名123未找到"), 50, driver);
		   // driver.findElementByXPath("//Button[@id='login']").click();
		   // Thread.sleep(1000);
		    
		    System.out.println("11111111111111111111");
		    System.out.println(toast);
		    System.out.println("222222222222222222222");
		    Assert.assertNotNull(toast);
		    System.out.println("333333333333333333333");
	  }
	  @BeforeSuite
	  //@Parameters({ "port", "udid" })
	  public void beforeSuite() {
	      port = "4723";
	     // port = "8080";
	    //  udid = "022AQQ7N36018047";
	  }
	  @BeforeClass
	  public void beforeClass() throws MalformedURLException{
		  	adbDevice adb =new adbDevice();
	        System.out.println("port is " + port );//+ ", udid is " + udid);
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot,"apps/app");	
			File app = new File(appDir, "un_SmartHome.apk");	
	        capabilities.setCapability("deviceName",adb.getAndroidModel());
	        //capabilities.setCapability("automationName","Selendroid");
	        capabilities.setCapability("automationName","Appium");
	        capabilities.setCapability("platformVersion", adb.getAndroidVersion());
	      //  capabilities.setCapability("udid", adb.AdbDeviceUid());
		    capabilities.setCapability("app", app.getAbsolutePath());
	        capabilities.setCapability("appPackage", "com.asiainfo.smarthome");
	        capabilities.setCapability("appActivity", ".LoginActivity_");
	        //capabilities.setCapability("appActivity", "com.ruijie.anan.ui.im.SelectSchoolActivity");
//	        capabilities.setCapability("appPackage", "com.sina.merp");
//	        capabilities.setCapability("appActivity", "com.sina.merp.Entrance");
	        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:" + port + "/wd/hub"), capabilities);
	  }

	  @AfterClass
	  public void afterClass() {
	      driver.quit();

	  }

}
