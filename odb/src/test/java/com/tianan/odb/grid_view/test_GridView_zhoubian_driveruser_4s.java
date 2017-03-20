package com.tianan.odb.grid_view;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CreateActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.TouchActionUtils;
import com.tianan.odb.public_infunction.login_success;
public class test_GridView_zhoubian_driveruser_4s {
    private static MyLogger logger = MyLogger.getLogger(test_GridView_zhoubian_driveruser_4s.class);
	@Test
	public void test_GridView_zhoubian_driveruser_4s(){
		ConfigurationAndroid con = new ConfigurationAndroid();
		CreateActivityPages page = new CreateActivityPages();
		login_success login = new login_success();
		//调用ConfigurationAndroid预制方法
		con.SetUp();
		//调用登录方法，传driver[传int3指的是第一次安装时，有4页欢迎页，需要滑动3次
		login.login(3);
		//调取点击方法
		TouchActionUtils tau = new TouchActionUtils();
		HolmosBaseUtils.sleep(2000);
		//点击发现
		tau.tap(page.odb_guide_finder());
		HolmosBaseUtils.sleep(2000);
		//点击周边出行
		tau.tap(page.odb_GridView_zhoubian());
		HolmosBaseUtils.sleep(2000);
		//定位司机当前位置
		tau.tap(page.odb_GridView_zhoubian_driveruser());
		HolmosBaseUtils.sleep(2000);
		//点击维修点
		tau.tap(page.odb_GridView_zhoubian_4s());
		HolmosBaseUtils.sleep(2000);
		//点击查看按钮
		tau.tap(page.odb_GridView_zhoubian_4s_check());
		HolmosBaseUtils.sleep(2000);
		//校验是否已进入维修点详情页面(执行脚本时，需要在硅谷亮城办公室)
		Assert.assertEquals(page.odb_GridView_zhoubian_4s_check_name().getText(), "北京上地四方汽车销售服务有限公司");
		HolmosBaseUtils.sleep(1000);
			
	}
	@AfterTest
	public void tearDown() throws Exception{
	
	ConfigurationAndroid.driver.quit();
	logger.info("资源释放成功");
	}

}
