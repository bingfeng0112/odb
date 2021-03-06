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
    //获取周边门店位置
    public WebElement odb_carinfo_zhoubian() {
	
	WebElement carinfo_zhoubian=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rl_around_mall");
	return carinfo_zhoubian;
	
    }
    //获取加油站位置
    public WebElement odb_carinfo_gas() {
	
	WebElement carinfo_gas=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rl_c2_1");
	return carinfo_gas;
	
    }
    //加油站→发送到我的智能系统
    public WebElement odb_carinfo_gas_Issued() {
	
	WebElement carinfo_gas_Issued=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rl_poi_paper");
	return carinfo_gas_Issued;
	
    }
    //加油站→发送到我的智能系统→确定按钮
    public WebElement odb_carinfo_gas_Issued_yes() {
	WebElement carinfo_gas_Issued_yes=ConfigurationAndroid.driver.findElementById("android:id/button1");
	return carinfo_gas_Issued_yes;
	
    }
    //加油站→发送到我的智能系统→验证是否下发成功
    public WebElement odb_carinfo_gas_Issued_success() {
	
	WebElement carinfo_gas_Issued_success=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_result");
	return carinfo_gas_Issued_success;
	
    }
  //加油站→发送到我的智能系统→验证是否下发成功→确定按钮
    public WebElement odb_carinfo_gas_Issued_success_submit() {
	WebElement carinfo_gas_Issued_success_submit=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_poi_conform");
	return carinfo_gas_Issued_success_submit;
	
    }
  //获取停车场位置

    public WebElement odb_carinfo_park() {
	WebElement carinfo_park=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rl_c2_2");
	return carinfo_park;
	
    }
  //停车场→发送到我的智能系统
    public WebElement odb_carinfo_park_Issued() {
	
	WebElement carinfo_park_Issued=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rl_poi_paper");
	return carinfo_park_Issued;
	
    }
    //停车场→发送到我的智能系统→确定按钮
    public WebElement odb_carinfo_park_Issued_yes() {
	
	WebElement carinfo_park_Issued_yes=ConfigurationAndroid.driver.findElementById("android:id/button1");
	return carinfo_park_Issued_yes;
    }
    //停车场→发送到我的智能系统→验证发送成功
    public WebElement odb_carinfo_park_Issued_success() {
	
	WebElement carinfo_park_Issued_success=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_result");
	return carinfo_park_Issued_success;
	
    }
    //停车场→发送到我的智能系统→验证发送成功→确定按钮
    public WebElement odb_carinfo_park_Issued_success_submit() {
	
	WebElement carinfo_park_Issued_success_submit=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_poi_conform");
	return carinfo_park_Issued_success_submit;
	
    }
    //获取当月行驶里程位置
    public WebElement odb_carinfo_Mmileage() {
	
	WebElement carinfo_Mmileage=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/ll_c_1");
	return carinfo_Mmileage;
	
    }
    //获取当月行驶里程位置→本周行驶里程
    public WebElement odb_carinfo_Mmileage_mileage() {
	
	
	WebElement carinfo_Mmileage_mileage=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rb_3");
	return carinfo_Mmileage_mileage;
	
    }
    
    //获取当月行驶里程→行驶里程→本周共行驶公里数
    public WebElement odb_carinfo_Mmileage_mileage_number() {
	
	WebElement carinfo_Mmileage_mileage_Column=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_times");
	return carinfo_Mmileage_mileage_Column;
	
    }
    //获取当月行驶里程→行驶里程→上周行驶里程
    public WebElement odb_carinfo_Mmileage_mileage_lefttab() {
	
	WebElement carinfo_Mmileage_mileage_number_next=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/imv_left_tab");
	return carinfo_Mmileage_mileage_number_next;
	
    }
    
    //获取当月行驶里程→行驶里程→上周周共行驶公里数
    public WebElement odb_carinfo_Mmileage_mileage_number_next() {
	
	WebElement carinfo_Mmileage_mileage_number_next=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_times");
	return carinfo_Mmileage_mileage_number_next;
	
    }
  //获取当月行驶里程位置→本周驾乘次数
    public WebElement odb_carinfo_Mmileage_driver_num() {
	
	WebElement carinfo_Mmileage_driver_num=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rb_1");
	return carinfo_Mmileage_driver_num;
    }
  //获取显示手机号码位置
    public WebElement odb_carinfo_phonenumber() {
	
	WebElement carinfo_phonenumber=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_username");
	return carinfo_phonenumber;
	
    }
    
    //向上滑动手机号后，弹出隐藏页面中的驾驶统计
    public WebElement odb_carinfo_phonenumber_drivernum() {
	
	WebElement carinfo_phonenumber_drivernum=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/iv_statice_icon");
	return carinfo_phonenumber_drivernum;
	
    }
    
}
