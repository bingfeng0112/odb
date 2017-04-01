package com.tianan.odb.public_infunction;

import java.util.Random;

/**
 * JAVA的一些工具方法
 * 
 * @author: 张豆豆
 * @create: Mar 31, 2017
 */
public class JavaUtils {
  /**
   * 查找字符串在数组中的位置
   * 
   * @param data
   *          字符串数组
   * @param value
   *          要查找的值
   * @return 所在位置的index
   */
  public static int indexOf(String[] data, String value) {
	int i = 0;
	for (; i < data.length; i++) {
	  if (data[i].equals(value)) {
		break;
	  }
	}
	return i;
  }

  /**
   * 
   * @param max 最大值，如传入5可获取0-4之间的随机数
   * @return 随机生成的数
   */
  public static int random(int max) {
	Random rd = new Random();
	int value = rd.nextInt(max);
	return value;
  }
}
