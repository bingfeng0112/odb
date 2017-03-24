package com.tianan.odb.android_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tianan.odb.configuration_device.ConfigurationAndroid;

public class CreateActivityPages {

    // 获取当前页面标题
    public WebElement odb_titlename() {
	WebElement titlename = ConfigurationAndroid.driver
		.findElementById("com.tian.obd.android:id/title_text");
	return titlename;
    }

    // 我的
    public WebElement odb_guide_Mine() {

	WebElement guide_Mine = ConfigurationAndroid.driver
		.findElementById("com.tian.obd.android:id/share_rd_btn");
	return guide_Mine;
    }

    // 登录页面用户名
    public WebElement odb_login_usernametxt() {

	WebElement login_usernametxt = ConfigurationAndroid.driver
		.findElementById("com.tian.obd.android:id/edt_user");

	return login_usernametxt;

    }

    // 登录页面密码
    public WebElement odb_login_passwdtxt() {

	WebElement login_passwdtxt = ConfigurationAndroid.driver
		.findElementById("com.tian.obd.android:id/edt_pass");
	return login_passwdtxt;

    }

    // 登录页面登录按钮
    public WebElement odb_login_btn() {

	WebElement login_btn = ConfigurationAndroid.driver
		.findElementById("com.tian.obd.android:id/btn_login");
	return login_btn;

    }

    // 主页面发现
    public WebElement odb_guide_finder() {

	WebElement guide_finder = ConfigurationAndroid.driver
		.findElementById("com.tian.obd.android:id/travel_rd_btn");
	return guide_finder;

    }

    // 我的页面退出
    public WebElement odb_guide_Mine_Quit() {

	WebElement guide_Mine_Quit = ConfigurationAndroid.driver
		.findElementById("com.tian.obd.android:id/btn_quit");
	return guide_Mine_Quit;
    }

    // 发现页面天天福利
    public WebElement odb_GridView_tiantianfuli() {
	WebElement GridView_tiantianfuli = ConfigurationAndroid.driver
		.findElementByXPath(
			"//android.widget.GridView[@resource-id='com.tian.obd.android:id/gridView']/android.widget.LinearLayout[5]");
	return GridView_tiantianfuli;
    }

    // 意外保险
    public WebElement odb_GridView_yiwaibaoxian() {
	WebElement GridView_yiwaibaoxian = ConfigurationAndroid.driver
		.findElementByXPath(
			"//android.widget.GridView[@resource-id='com.tian.obd.android:id/gridView']/android.widget.LinearLayout[4]");
	return GridView_yiwaibaoxian;
    }

    // 旅途路书-相机快门
    public WebElement odb_GridView_lvtu_xiangjikuaimen() {
	WebElement GridView_lvtu_xiangjikuaimen = ConfigurationAndroid.driver
		.findElementById("com.tian.obd.android:id/capture_picture");
	return GridView_lvtu_xiangjikuaimen;
    }

    // 旅途路书
    public WebElement odb_GridView_lvtu() {
	WebElement GridView_lvtu = ConfigurationAndroid.driver
		.findElementByXPath(
			"//android.widget.GridView[@resource-id='com.tian.obd.android:id/gridView']/android.widget.LinearLayout[2]");
	return GridView_lvtu;
    }

    // 周边出行
    public WebElement odb_GridView_zhoubian() {
	WebElement GridView_zhoubian = ConfigurationAndroid.driver
		.findElementByXPath(
			"//android.widget.GridView[@resource-id='com.tian.obd.android:id/gridView']/android.widget.LinearLayout[1]");
	return GridView_zhoubian;
    }

    // 周边出行→当前用户位置
    public WebElement odb_GridView_zhoubian_driveruser() {
	WebElement GridView_zhoubian_driveruser = ConfigurationAndroid.driver
		.findElementById("com.tian.obd.android:id/btn_drive_user");
	return GridView_zhoubian_driveruser;
    }

    // 周边出行→停车场
    public WebElement odb_GridView_zhoubian_park() {
	WebElement GridView_zhoubian_park = ConfigurationAndroid.driver
		.findElementById("com.tian.obd.android:id/ll_handler_park");
	return GridView_zhoubian_park;

    }

    // 周边出行→停车场→查看
    public WebElement odb_GridView_zhoubian_park_check() {

	// WebElement
	// GridView_zhoubian_park_check=ConfigurationAndroid.driver.findElementById("//android.widget.Button[resource-d='com.tian.obd.android:id/btn_park_map_detail'][1]");
	WebElement GridView_zhoubian_park_check = ConfigurationAndroid.driver
		.findElementByXPath(
			"//android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.Button[1]");
	return GridView_zhoubian_park_check;
    }

    // 周边出行→停车场→查看→停车场名称
    public WebElement odb_GridView_zhoubian_park_check_name() {

	WebElement GridView_zhoubian_park_check_name = ConfigurationAndroid.driver
		.findElementById("com.tian.obd.android:id/tv_park_name");

	return GridView_zhoubian_park_check_name;

    }

    // 周边出行→加油站
    public WebElement odb_GridView_zhoubian_gas() {
	WebElement GridView_zhoubian_gas = ConfigurationAndroid.driver
		.findElementById(
			"com.tian.obd.android:id/ll_handler_oil_station");
	return GridView_zhoubian_gas;

    }

    // 周边出行→加油站→查看
    public WebElement odb_GridView_zhoubian_gas_check() {

	WebElement GridView_zhoubian_gas_check = ConfigurationAndroid.driver
		.findElementByXPath("\r\n"
			+ "//android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.Button[1]");
	return GridView_zhoubian_gas_check;
    }

    // 周边出行→停车场→查看→加油站名称
    public WebElement odb_GridView_zhoubian_gas_check_name() {

	WebElement GridView_zhoubian_gas_check_name = ConfigurationAndroid.driver
		.findElementById("com.tian.obd.android:id/txv_oil_station");

	return GridView_zhoubian_gas_check_name;

    }

    // 周边出行→维修点
    public WebElement odb_GridView_zhoubian_4s() {

	WebElement GridView_zhoubian_4s = ConfigurationAndroid.driver
		.findElementById(
			"com.tian.obd.android:id/ll_handler_maintenance_station");
	return GridView_zhoubian_4s;

    }

    // 周边出行→维修点→查看
    public WebElement odb_GridView_zhoubian_4s_check() {

	WebElement GridView_zhoubian_4s_check = ConfigurationAndroid.driver
		.findElementByXPath(
			"//android.widget.ListView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.Button[1]");
	return GridView_zhoubian_4s_check;
    }

    // 周边出行→维修点→查看→维修点名称
    public WebElement odb_GridView_zhoubian_4s_check_name() {

	WebElement GridView_zhoubian_4s_check_name = ConfigurationAndroid.driver
		.findElementById("com.tian.obd.android:id/tv_park_name");
	return GridView_zhoubian_4s_check_name;
    }

    public WebElement odb_canale() {
	WebElement canle = ConfigurationAndroid.driver.findElement(
		By.id("com.tian.obd.android:id/sdl__negative_button"));
	return canle;
    }
    //分享
    public WebElement odb_share() {
	WebElement share=ConfigurationAndroid.driver.findElementByXPath("//android.widget.GridView[@resource-id='com.tian.obd.android:id/gridView']/android.widget.LinearLayout[3]");
	return  share;
    }
    //分享→我的的分享
    public WebElement odb_myShare() {
	
	WebElement myShare = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_my_share");
	return myShare;
	
    }
    //分享→验证是否获取了地理位置
    public WebElement odb_share_positionName() {
	
	WebElement share_positionName=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_my_share_name");
	return share_positionName;
	
    }
    //分享→向好友分享你的地理位置按钮
    public WebElement odb_share_positionShareFriends() {
	
	WebElement share_positionShareFriends=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/rl_my_share_detail");
	return share_positionShareFriends;
    }
    //分享→分享发送按钮
    public WebElement odb_share_shareBtn() {
	
	WebElement share_shareBtn=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/btn_my_share");
	return share_shareBtn;
	
    }
    
    //分享→分享发送→选择好友手机号码(联系人中的第一个）
    public WebElement odb_share_shareBtn_FriendsPhoneNum() {
	
	WebElement share_shareBtn_FriendsPhoneNum=ConfigurationAndroid.driver.findElementByXPath("//android.widget.ListView/android.view.View[1]/android.view.View[1]");
	return share_shareBtn_FriendsPhoneNum;
	
    }
    //分享→分享发送→选择好友手机号码→输入分析内容文字
    public WebElement odb_share_shareBtn_FriendsPhoneNum_ShareTxt() {
	
	WebElement share_shareBtn_FriendsPhoneNum_ShareTxt=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/edt_share_content");
	return share_shareBtn_FriendsPhoneNum_ShareTxt;
    }
    //分享→分享发送→选择好友手机号码→输入分析内容文字_发送
    public WebElement odb_share_shareBtn_FriendsPhoneNum_ShareTxt_Send() {
	
	WebElement share_shareBtn_FriendsPhoneNum_ShareTxt_Send=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/right_btn");
	return share_shareBtn_FriendsPhoneNum_ShareTxt_Send;
    }
    //分享→好友的分享
    public WebElement odb_friendsShare() {
	
	WebElement odb_friendsShare = ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/tv_friend_share");
	return odb_friendsShare;
	
    }
    //获取第一条好友分享消息的位置
    
    public WebElement odb_friendsShare_No1news() {
	
	WebElement friendsShare_No1news = ConfigurationAndroid.driver.findElementByXPath("//android.widget.ListView[1]/android.widget.RelativeLayout[1]");
	return friendsShare_No1news;
	
    }
    //获取分享消息导航区域的位置
    public WebElement odb_friendsShare_No1news_detailed() {
	
	WebElement friendsShare_No1news_detailed=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/imb_flag");
	return friendsShare_No1news_detailed;
    }
    //获取好友的分享位置信息文字内容
    public WebElement odb_friendsShare_No1news_detailed_gettxt() {
	
	WebElement friendsShare_No1news_detailed_gettxt=ConfigurationAndroid.driver.findElementById("com.tian.obd.android:id/txv_share_content");
	return friendsShare_No1news_detailed_gettxt;
	
	
    }
}
