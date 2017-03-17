package com.tianan.odb.grid_view;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.holmos.webtest.log.MyLogger;
import com.holmos.webtest.utils.HolmosBaseUtils;
import com.tianan.odb.android_pages.CreateActivityPages;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import com.tianan.odb.public_infunction.login_success;
import io.appium.java_client.TouchAction;
public class test_GridView_zhoubian_dirveruser_gas {
	private static MyLogger logger = MyLogger.getLogger(test_GridView_zhoubian_dirveruser_gas.class);
	@Test
	public void test_GridView_zhoubian_dirver_gas(){
		ConfigurationAndroid con = new ConfigurationAndroid();
		CreateActivityPages page = new CreateActivityPages();
		login_success login = new login_success();
		//调用ConfigurationAndroid预制方法
		con.SetUp();
		//进行登录
		login.login(con.driver);
		//使用appium下的TouchAction类中的，TouchAction方法，需要传driver
		TouchAction tac = new TouchAction(con.driver);
		HolmosBaseUtils.sleep(2000);
		//点击周边出行
		tac.tap(page.odb_GridView_zhoubian()).perform();
		HolmosBaseUtils.sleep(2000);
		//定位司机当前位置
		tac.tap(page.odb_GridView_zhoubian_driveruser()).perform();
		HolmosBaseUtils.sleep(2000);
		//点击加油站
		tac.tap(page.odb_GridView_zhoubian_gas()).perform();
		HolmosBaseUtils.sleep(2000);
		//点击查看
		tac.tap(page.odb_GridView_zhoubian_gas_check()).perform();
		HolmosBaseUtils.sleep(2000);
		//校验是否已进入加油站详情页面(执行脚本时，需要在硅谷亮城办公室)
		Assert.assertEquals(page.odb_GridView_zhoubian_gas_check_name().getText(), "北体加油站");
		HolmosBaseUtils.sleep(1000);
	}
	@AfterTest
	public void tearDown() throws Exception{
	
	ConfigurationAndroid.driver.quit();
	logger.info("资源释放成功");
}
}
