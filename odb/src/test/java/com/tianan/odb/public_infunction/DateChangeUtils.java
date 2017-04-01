package com.tianan.odb.public_infunction;
/**
 * 将日期由汉字转换成数字
 * 
 * @author: 张豆豆
 * @create: Mar 31, 2017
 */
public class DateChangeUtils {
  /**
   * 
   * @param month
   *          传入月份如：一月、二月
   * @return 返回月份如：01、02
   */
  public static String dateNumber(String month) {
	String months[] = new String[] { "一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月" };
	int index = JavaUtils.indexOf(months, month);
	String monthNum = "0";
	if ((index + 1) < 10) {
	  monthNum += index + 1;
	} else if (index >= months.length) {
	  throw new ArrayIndexOutOfBoundsException("要查找的月份不正确");
	} else {
	  monthNum = String.valueOf(index + 1);
	}
	return monthNum;
  }

  public static String da(int day) {
	String actualDay = "0";
	if (day < 10) {
	  actualDay += day;
	} else {
	  actualDay = String.valueOf(day);
	}
	return actualDay;
  }
}
