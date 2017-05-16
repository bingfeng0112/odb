package com.tianan.odb.public_infunction;

import org.openqa.selenium.WebElement;
import com.tianan.odb.configuration_device.ConfigurationAndroid;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Androidswipe {

  /**
   * This Method for swipe up 向上滑动
   * 
   * @author Young
   * @param driver
   * @param during
   */

  public void swipeToUp(AndroidDriver<AndroidElement> driver, int during) {
	int width = driver.manage().window().getSize().width;
	int height = driver.manage().window().getSize().height;
	driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
	// wait for page loading
  }

  /**
   * 向上滑动，从10分之9的位置滑动到10分之一的位置
   * 
   * @param during
   *          滑动时间
   */
  public static void swipeToUp(int during) {
	int[] size = windowSize();
	ConfigurationAndroid.driver.swipe(size[0] / 2, size[1] * 9 / 10, size[0] / 2, size[1] / 10, during);
  }

  /**
   * This Method for swipe down 向下滑动
   * 
   * @author Young
   * @param driver
   * @param during
   */
  public void swipeToDown(AppiumDriver<WebElement> driver, int during) {
	int width = driver.manage().window().getSize().width;
	int height = driver.manage().window().getSize().height;
	driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
	// wait for page loading
  }

  /**
   * 向下滑动 9/10
   * 
   * @param during
   *          滑动时间
   */
  public static void swipeToDown(int during) {
	int[] size = windowSize();
	ConfigurationAndroid.driver.swipe(size[0] / 2, size[1] / 10, size[0] / 2, size[1] * 9 / 10, during);
  }

  /**
   * This Method for swipe Left 向左滑动
   * 
   * @author Young
   * @param driver
   * @param during
   */
  public void swipeToLeft(AndroidDriver<AndroidElement> driver, int during) {
	int width = driver.manage().window().getSize().width;
	int height = driver.manage().window().getSize().height;
	driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
	// wait for page loading
  }

  /**
   * 向左滑动 9/10
   * 
   * @param during
   *          滑动时间
   */
  public static void swipeToLeft(int during) {
	int[] size = windowSize();
	ConfigurationAndroid.driver.swipe(size[0] * 9 / 10, size[1] / 2, size[0] * 1 / 10, size[1] / 2, during);
  }

  /**
   * This Method for swipe Right 向右滑动
   * 
   * @author Young
   * @param driver
   * @param during
   */
  public void swipeToRight(AndroidDriver<AndroidElement> driver, int during) {
	int width = driver.manage().window().getSize().width;
	int height = driver.manage().window().getSize().height;
	driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
	// wait for page loading
  }

  /**
   * 向右滑动 9/10
   * 
   * @param during
   *          滑动时间
   */
  public static void swipeToRight(int during) {
	int[] size = windowSize();
	ConfigurationAndroid.driver.swipe(size[0] / 10, size[1] / 2, size[0] * 9 / 10, size[1] / 2, during);
  }

  /**
   * 自定义滑动范围， 示例 customSwipe(9, 1, 10, 500)表示从10分之9滑到10分之一的位置
   * 
   * @param x
   *          分子（开始位置）
   * @param y
   *          分子（结束位置）
   * @param z
   *          分母（屏幕分多少份，必须比x, y大）
   * @param during
   *          滑动时间
   */
  public static void customSwipe(int x, int y, int z, int during) {
	int size[] = windowSize();
	ConfigurationAndroid.driver.swipe(size[0] * x / z, size[1] / 2, size[0] * y / z, size[1] / 2, during);
  }

  /**
   * 指定元素向上滑动 , 从元素中央位置滑动到屏幕Y轴200的位置。
   * 
   * @param element
   *          要滑动的元素
   * @param during
   *          滑动时长
   */
  public static void elementSwipeToUp(WebElement element, int during) {
	int elementStartY = element.getLocation().getY();// 获取当前元素y的像素点
	int swipeX = element.getSize().getWidth() / 2; // 确定x的像素点，当前元素宽度像素的一半儿
	int elementHeight = element.getSize().getHeight();// 获取当前元素高度
	int startY = elementStartY + elementHeight / 2;// 确定y的像素点，当前元素高度的一半
	ConfigurationAndroid.driver.swipe(swipeX, startY, swipeX, 200, during);
  }

  /**
   * 指定元素向下滑动 , 从元素中央位置滑动到屏幕Y轴 - 200的位置。
   * 
   * @param element
   *          要滑动的元素
   * @param during
   *          滑动时长
   */
  public static void elementSwipeToDown(WebElement element, int during) {
	int winHeight = windowSize()[1];
	int elementStartY = element.getLocation().getY();
	int swipeX = element.getSize().getWidth() / 2;
	int elementHeight = element.getSize().getHeight();
	int startY = elementStartY + elementHeight / 2;
	ConfigurationAndroid.driver.swipe(swipeX, startY, swipeX, winHeight - 200, during);
  }

  private static int[] windowSize() {
	int width = ConfigurationAndroid.driver.manage().window().getSize().width;
	int height = ConfigurationAndroid.driver.manage().window().getSize().height;
	int size[] = new int[] { width, height };
	return size;
  }

}
