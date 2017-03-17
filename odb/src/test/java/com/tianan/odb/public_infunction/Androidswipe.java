package com.tianan.odb.public_infunction;

import org.openqa.selenium.WebElement;

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
     * This Method for swipe down  向下滑动
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
     * This Method for swipe Left  向左滑动
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
     * This Method for swipe Right  向右滑动
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

}
