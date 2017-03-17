package com.tianan.odb.configuration_device;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import com.tianan.odb.configuration_adb.adbDevice;

public class CheckApp {
	
	public AppiumDriver driver;
	adbDevice adb = new adbDevice();
	StringBuilder message = new StringBuilder();
	ConfigurationAndroid configuration = new ConfigurationAndroid();

	 public void TestLogin() throws MalformedURLException  {
	    	//判断app是否安装 
	    	if(adb.isInstalled("com.ruijie.anan.bizlayer")){
	    		System.out.println("不需要安装应用程序，直接激活应用程序");
	    		message.append("不需要安装应用程序，直接激活应用程序");
	    		driver =  configuration.SetUp();
	    		
	    	}else{
	    		System.out.println("需要安装应用程序，直接激活应用程序");
	    		message.append("需要安装应用程序，直接激活应用程序");
//	    		driver =  configuration.SetUp1();
	    		 try {
	    				Thread.sleep(10000);
	    			} catch (InterruptedException e) {
	    				
	    				e.printStackTrace();
	    			}
	    		adb.swipeToRight();
	    		System.out.println("向右滑动一次");
	    		message.append("向右滑动一次");
	    		 try {
	    				Thread.sleep(10000);
	    			} catch (InterruptedException e) {
	    				
	    				e.printStackTrace();
	    			}
	    		adb.swipeToRight();
	    		System.out.println("向右滑动一次");
	    		message.append("向右滑动一次");
	    		 try {
	    				Thread.sleep(10000);
	    			} catch (InterruptedException e) {
	    				
	    				e.printStackTrace();
	    			}
	    		adb.swipeToRight();
	    		System.out.println("向右滑动一次");
	    		message.append("向右滑动一次");
	    		 try {
	    				Thread.sleep(10000);
	    			} catch (InterruptedException e) {
	    				
	    				e.printStackTrace();
	    			}
	    		adb.swipeToRight();
	    		System.out.println("向右滑动一次");
	    		message.append("向右滑动一次");
	    		
	    	}

}
}
