package com.tianan.odb.public_infunction;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

/**
 * @author: 张豆豆
 * @create: Mar 21, 2017
 */
public class AndroidElementAttribute {
  /**
   * 
   * @param element
   * @return
   */

  public String getText(WebElement element) {
	return element.getAttribute("text");
  }

  public String getResourceID(WebElement element) {
	return element.getAttribute("resourceId");
  }

  public String getClass(WebElement element) {
	return element.getAttribute("className");
  }

  public String getContentDESC(WebElement element) {
	return element.getAttribute("name");
  }

  public boolean isCheckable(WebElement element) {
	boolean checked = Boolean.parseBoolean(element.getAttribute("checkable"));
	return checked;
  }

  /**
   * 获取元素选中状态。如复选框是否被选中
   * 
   * @param element
   * @return
   */
  public boolean isChecked(WebElement element) {
	boolean checked = Boolean.parseBoolean(element.getAttribute("checked"));
	return checked;
  }

  public boolean isClickable(WebElement element) {
	boolean checked = Boolean.parseBoolean(element.getAttribute("clickable"));
	return checked;
  }

  public boolean isEnabled(WebElement element) {
	boolean checked = Boolean.parseBoolean(element.getAttribute("enabled"));
	return checked;
  }

  public boolean isFocusable(WebElement element) {
	boolean checked = Boolean.parseBoolean(element.getAttribute("focusable"));
	return checked;
  }

  public boolean isFocused(WebElement element) {
	boolean checked = Boolean.parseBoolean(element.getAttribute("focused"));
	return checked;
  }

  public boolean isScrollable(WebElement element) {
	boolean checked = Boolean.parseBoolean(element.getAttribute("scrollable"));
	return checked;
  }

  public boolean isLongClickable(WebElement element) {
	boolean checked = Boolean.parseBoolean(element.getAttribute("longClickable"));
	return checked;
  }

  /**
   * 不知道有啥用，如果要获取元素选中状态使用isChecked方法。
   * 
   * @param element
   * @return
   */
  public boolean isSelected(WebElement element) {
	boolean checked = Boolean.parseBoolean(element.getAttribute("selected"));
	return checked;
  }

  public boolean isDisplayed(WebElement element) {
	return Boolean.parseBoolean(element.getAttribute("displayed"));
  }

  public Point getLocation(WebElement element) {
	return element.getLocation();
  }

  public Dimension getDimension(WebElement element) {
	return element.getSize();
  }
}
