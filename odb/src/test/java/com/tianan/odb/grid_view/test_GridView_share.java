package com.tianan.odb.grid_view;

import java.util.NoSuchElementException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CreateActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.TouchActionUtils;
import com.tianan.odb.public_infunction.login_success;

public class test_GridView_share {
	private static MyLogger logger = MyLogger.getLogger(test_GridView_lvtulushu.class);
  @Test
  public void test_GridView_share() {

	ConfigurationAndroid con = new ConfigurationAndroid();
	CreateActivityPages page = new CreateActivityPages();
	login_success login = new login_success();
	//设置分享内容文字描述
	String ShareTxt ="亲爱的，我在这里哦~，快来找我！";
	//调用ConfigurationAndroid预制方法
	con.SetUp();
	//调用登录方法，传driver[传int3指的是第一次安装时，有4页欢迎页，需要滑动3次
	login.login(3);
	//调取点击方法
	TouchActionUtils tau = new TouchActionUtils();
	//点击发现
	tau.tap(page.odb_guide_finder());
	HolmosBaseUtils.sleep(2000);
	//点击分享
	tau.tap(page.odb_share());
	HolmosBaseUtils.sleep(2000);
	//点击我的分享
	tau.tap(page.odb_myShare());
	HolmosBaseUtils.sleep(6000);
	//验证是否成功获取了当前位置信息（测试时，需要在硅谷亮城办公室)
	if(page.odb_share_positionName().getText().equals("靠近招商银行(上地支行)")) {
	    //点击向朋友分享当前地理位置
	    tau.tap(page.odb_share_positionShareFriends());
	    HolmosBaseUtils.sleep(2000);
	    //点击分享按钮
	    tau.tap(page.odb_share_shareBtn());
	    HolmosBaseUtils.sleep(2000);
	    //选择好友的手机号
	    tau.tap(page.odb_share_shareBtn_FriendsPhoneNum());
	    HolmosBaseUtils.sleep(2000);
	    //输入分享内容
	    page.odb_share_shareBtn_FriendsPhoneNum_ShareTxt().sendKeys(ShareTxt);
	    HolmosBaseUtils.sleep(2000);
	    //点击分享发送按钮
	    tau.tap(page.odb_share_shareBtn_FriendsPhoneNum_ShareTxt_Send());
	    HolmosBaseUtils.sleep(8000);
	    //验证分享是否成功

	    //点击好友的分享
	    tau.tap(page.odb_friendsShare());
	    HolmosBaseUtils.sleep(2000);
	    //点击第一个消息
	    tau.tap(page.odb_friendsShare_No1news());
	    HolmosBaseUtils.sleep(2000);
	    //点击分享信息的向上的三角箭头，弹出隐藏的详细信息
	    tau.tap(page.odb_friendsShare_No1news_detailed());
	    HolmosBaseUtils.sleep(2000);
	    //获取好友分享的位置信息文字内容并与之前发送的内容进行对比校验
	    if(page.odb_friendsShare_No1news_detailed_gettxt().getText().equals(ShareTxt)) {
		
		    logger.info("分享位置成功！");
		    HolmosBaseUtils.sleep(2000);
		
	    }else {
		
		    logger.error("分享功能存在问题，请检查！");
		    HolmosBaseUtils.sleep(1000);
		    ConfigurationAndroid.driver.quit();
		    HolmosBaseUtils.sleep(1000);
		    throw new NoSuchElementException();
		
	    }
	    
	    
	    
	}else {
	    logger.error("分享功能存在问题，请检查！");
	    HolmosBaseUtils.sleep(1000);
	    ConfigurationAndroid.driver.quit();
	    HolmosBaseUtils.sleep(1000);
	    throw new NoSuchElementException();
	    
	}
	
  }
  @AfterTest
	public void tearDown() throws Exception{
	ConfigurationAndroid.driver.quit();
	logger.info("资源释放成功");
  }
  
}
