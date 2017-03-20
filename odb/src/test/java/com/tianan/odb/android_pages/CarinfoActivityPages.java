package com.tianan.odb.android_pages;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;

public class CarinfoActivityPages {

    // 获取车信息导航位置
    public WebElement odb_grid_carinfo() {
	WebElement grid_carinfo = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/home_rd_btn");
	return grid_carinfo;
    }
    //获取车信息页面中的搜酷位置
    public WebElement odb_carinfo_kuso() {
	
	WebElement carinfo_kuso = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/ll_c3_1");
	return carinfo_kuso;
    }
    //获取导航信息下发终端成功通知消息位置
    public WebElement odb_carinfo_kuso_success() {
	
	WebElement carinfo_kuso_success=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_result");
	return carinfo_kuso_success;
    }
    //获取导航信息下发成功页面的确定按钮位置
    public WebElement odb_carinfo_kuso_success_btn() {
	WebElement carinfo_kuso_success_btn=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_poi_conform");
	return carinfo_kuso_success_btn;
    }
    //获取搜酷搜索框1位置
    public WebElement odb_carinfo_kuso_search1() {
	WebElement carinfo_kuso_Search1=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_poi_search");
	return carinfo_kuso_Search1;
	
    }
    //获取搜酷搜索框2位置
    public WebElement odb_carinfo_kuso_search2() {
	WebElement carinfo_kuso_search2=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/et_poi_search");
	return carinfo_kuso_search2;
    }
    //获取库搜搜索提交按钮位置
    public WebElement odb_carinfo_kuso_serarch_commit() {
	
	WebElement carinfo_kuso_serarch_commit=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/right_btn");
	return carinfo_kuso_serarch_commit;
	
    }
    //获取库搜→搜索后位置列表第一位位置			
    public WebElement odb_carinfo_kuso_serarch_content_NO1() {
	
	WebElement carinfo_kuso_serarch_content_NO1=ConfigurationAndroid.driver.findElementByXPath("//android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]");
	return carinfo_kuso_serarch_content_NO1;
	
    }
    //获取库搜→向车机端下发信息位置
    
    public WebElement odb_carinfo_kuso_serarch_location_Issued() {
	
	WebElement carinfo_kuso_serarch_location_Issued=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rl_poi_paper");
	return carinfo_kuso_serarch_location_Issued;
    }
    //获取库搜→确认向车机端下发信息按钮位置
    public WebElement odb_carinfo_kuso_serarch_location_Issued_yes() {
	
	WebElement carinfo_kuso_serarch_location_Issued_yes=ConfigurationAndroid.driver.findElementById("android:id/button1");
	return carinfo_kuso_serarch_location_Issued_yes;
	
    }
    //获取途虎商城位置
    public WebElement odb_carinfo_tuhu() {
	
	WebElement carinfo_tuhu=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/ll_c3_2");
	return	carinfo_tuhu;
    }
    
    
    
}
