package com.tianan.odb.configuration_adb;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class adbDevice {

	public void AdbDevice() {
		ShellUtils.cmd("wait-for-device");
	}
	/**
	 * 获取设备的uid号
	 * @return 
	 * 
	 * @return 返回设备uid号
	 */
	public List<String> AdbDeviceUid() {
		Process ps = ShellUtils.cmd("devices");
		List<String> DeviceUid = ShellUtils.getDevices(ps);
      
//        System.out.println(DeviceUid.get(0));
//        System.out.println(DeviceUid.get(1));
        
		return DeviceUid;
	}
	
	/**
	 * 获取设备的id号
	 * 
	 * @return 返回设备id号
	 */
	public String getDeviceId() {
		Process ps = ShellUtils.shell("getprop ro.boot.serialno");
		String serialno = ShellUtils.getShellOut(ps);
//		System.out.println("设备号"+serialno);
		return serialno;
	}
	/**
	 * 获取设备中Android的版本号，如4.4.2
	 * 
	 * @return 返回Android版本号
	 */
	public String getAndroidVersion() {
		Process ps = ShellUtils.shell("getprop ro.build.version.release");
		String androidVersion = ShellUtils.getShellOut(ps);

		return androidVersion;
	}
	//删除/storage/sdcard0/Android/data/com.tian.obd.android/files/image下的文件
	public void deleteImage(){
		
		ShellUtils.shell("rm -f  /storage/sdcard0/Android/data/com.tian.obd.android/files/image/*");
		
	}
	//获取/storage/sdcard0/Android/data/com.tian.obd.android/files/image下的文件
	public String getImagename(){
		
		Process ps = 	ShellUtils.shell("ls  /storage/sdcard0/Android/data/com.tian.obd.android/files/image/");
		
		String imagename = ShellUtils.getShellOut(ps);
		
		return imagename;
		
		
		
		
		
	}
	
	/**
	 * 获取设备中Android的版本号，如4.4.2
	 * 
	 * @return 返回Android版本号
	 */
	public String getAndroidModel() {
		Process ps = ShellUtils.shell("getprop ro.product.model");
		String androidModel = ShellUtils.getShellOut(ps);

		return androidModel;
	}
	/**
	 * 获取设备中SDK的版本号
	 * 
	 * @return 返回SDK版本号
	 */
	public int getSdkVersion() {
		Process ps = ShellUtils.shell("getprop ro.build.version.sdk");
		String sdkVersion = ShellUtils.getShellOut(ps);

		return new Integer(sdkVersion);
	}
	/**
	 * 卸载指定应用
	 * 
	 * @param packageName
	 *            应用包名，非apk名
	 */
	public void removeApp(String packageName) {
		ShellUtils.getShellOut(ShellUtils.cmd("uninstall " + packageName));
	}

	/**
	 * 清除应用的用户数据
	 * 
	 * @param packageName
	 *            应用的包名
	 * @return 清楚成功返回true, 否则返回false
	 */
	public boolean clearAppDate(String packageName) {
		Process ps = ShellUtils.shell("pm clear " + packageName);
		if (ShellUtils.getShellOut(ps).equals("Success")) {
			return true;
		}
		return false;
	}
	/**
	 * 获取设备中的系统应用列表
	 * 
	 * @return 返回系统应用列表
	 */
	public ArrayList<String> getSystemAppList() {
		ArrayList<String> sysApp = new ArrayList<String>();
		Process ps = ShellUtils.shell("pm list packages -s");
		StringBuilder sb = new StringBuilder();
		BufferedReader br = ShellUtils.shellOut(ps);

		String line;
		try {
			while ((line = br.readLine()) != null) {
				sb.append(line + System.getProperty("line.separator"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Pattern pattern = Pattern.compile(("[a-z]+:[a-zA-Z0-9.]+"));
		ArrayList<String> result = ReUtils.matchString(pattern, sb.toString());

		for (String string : result) {
			sysApp.add(string.split(":")[1]);
		}

		return sysApp;
	}
	/**
	 * 获取设备中的第三方应用列表
	 * 
	 * @return 返回第三方应用列表
	 */
	public ArrayList<String> getThirdAppList() {
		ArrayList<String> thirdApp = new ArrayList<String>();
		Process ps = ShellUtils.shell("pm list packages -3");
		StringBuilder sb = new StringBuilder();
		BufferedReader br = ShellUtils.shellOut(ps);

		String line;
		try {
			while ((line = br.readLine()) != null) {
				sb.append(line + System.getProperty("line.separator"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Pattern pattern = Pattern.compile(("[a-z]+:[a-zA-Z0-9.]+"));
		ArrayList<String> result = ReUtils.matchString(pattern, sb.toString());

		for (String string : result) {
			thirdApp.add(string.split(":")[1]);
		}

		return thirdApp;
	}
	/**
	 * 判断应用是否已经安装
	 * 
	 * @param packageName
	 *            应用的包名
	 * @return 已安装，返回true，否则返回false
	 */
	public boolean isInstalled(String packageName) {
		if (getThirdAppList().contains(packageName)
				|| getSystemAppList().contains(packageName)) {
			System.out.println(1);
			return true;
		}
		System.out.println(2);
		return false;
	}
	/**
	 * 获取设备上当前界面的package和activity
	 * 
	 * @return 返回package/activity
	 */
	public String getFocusedPackageAndActivity() {
		
		Process ps = ShellUtils.shell("dumpsys activity | grep mResumedActivity");
		
		Pattern pattern = Pattern.compile("([a-zA-Z0-9.]+/.[a-zA-Z0-9.]+)");
		
		ArrayList<String> component = ReUtils.matchString(pattern,ShellUtils.getShellOut(ps));
		
		
//		System.out.println("包名"+component);
		
		return component.get(0);
	}
		
//		//name=com.ruijie.anan.bizlayer/com.ruijie.anan.ui.im.IMContainner
//		Pattern pattern = Pattern.compile("^([a-zA-Z0-9])*[\\.][\\s\\S]*([a-zA-Z0-9])*$");
//		System.out.println(pattern);
////		Process ps = ShellUtils
////				.shell("dumpsys input | grep FocusedApplication");
//		
//		Process ps = ShellUtils.shell("dumpsys window w | grep \\/ | grep name=");
//		System.out.println("shell"+ps);
//		ArrayList<String> component = ReUtils.matchString(pattern,ShellUtils.getShellOut(ps));
//		
//		System.out.println(component);
//		// 会有FocusedApplication: <null>情况发生
////		if (component.isEmpty()) {
////			return ReUtils
////					.matchString(
////							pattern,
////							ShellUtils.getShellOut(ShellUtils
////									.shell("dumpsys window w | grep \\/ | grep name=")))
////					.get(0);
////		}

//		return component.get(0);

	/**
	 * 获取设备上当前界面的activity
	 * 
	 * @return 返回activity名
	 */
	public String getCurrentActivity() {
		return getFocusedPackageAndActivity().split("/")[1];
	}
	
	/**
	 * 获取设备屏幕的分辨率
	 * 
	 * @return 返回分辨率数组
	 */
	public int[] getScreenResolution() {
		Pattern pattern = Pattern.compile("([0-9]+)");
		Process ps = ShellUtils
				.shell("dumpsys display | grep PhysicalDisplayInfo");
		ArrayList<Integer> out = ReUtils.matchInteger(pattern,
				ShellUtils.getShellOut(ps));

		int[] resolution = new int[] { out.get(0), out.get(1) };

		return resolution;
	}
	/**
	 * x,y轴坐标
	 * 
	 * @return 
	 */
	private double[] ratio(double x, double y) {
		int[] display = getScreenResolution();
		double[] coords = new double[2];

		if (x < 1) {
			coords[0] = display[0] * x;
		} else {
			coords[0] = x;
		}

		if (y < 1) {
			coords[1] = display[1] * y;
		} else {
			coords[1] = y;
		}

		return coords;
	}
	private double[] ratio(double startX, double startY, double endX,
			double endY) {
		int[] display = getScreenResolution();
		double[] coords = new double[4];

		if (startX < 1) {
			coords[0] = display[0] * startX;
		} else {
			coords[0] = startX;
		}

		if (startY < 1) {
			coords[1] = display[1] * startY;
		} else {
			coords[1] = startY;
		}

		if (endX < 1) {
			coords[2] = display[0] * endX;
		} else {
			coords[2] = endX;
		}

		if (endY < 1) {
			coords[3] = display[1] * endY;
		} else {
			coords[3] = endY;
		}

		return coords;
	}
	/**
	 * 发送一个滑动事件
	 * 
	 * @param startX
	 *            起始x坐标
	 * @param startY
	 *            起始y坐标
	 * @param endX
	 *            结束x坐标
	 * @param endY
	 *            结束y坐标
	 * @param ms
	 *            持续时间
	 */
	public void swipe(double startX, double startY, double endX, double endY,
			long ms) {
		double[] coords = ratio(startX, startY, endX, endY);
		if (getSdkVersion() < 19) {
			ShellUtils.shell("input swipe " + coords[0] + " " + coords[1] + " "
					+ coords[2] + " " + coords[3]);
		} else {
			ShellUtils.shell("input swipe " + coords[0] + " " + coords[1] + " "
					+ coords[2] + " " + coords[3] + " " + ms);
		}

		sleep(500);
	}
	
	/**
	 * 左滑屏幕
	 */
	public void swipeToLeft() {
		swipe(0.8, 0.5, 0.2, 0.5, 500);
	}

	/**
	 * 右滑屏幕
	 */
	public void swipeToRight() {
		swipe(700, 1109, 10, 1140, 500);
	}
	
	/**
	 * 上滑屏幕
	 */
	public void swipeToUp() {
		swipe(0.5, 0.7, 0.5, 0.3, 500);
	}

	/**
	 * 下滑屏幕
	 */
	public void swipeToDown() {
		swipe(0.5, 0.3, 0.5, 0.7, 500);
	}
	
	/**
	 * 获取设备上当前界面的包名
	 * 
	 * @return 返回包名
	 */
	public String getCurrentPackageName() {
		return getFocusedPackageAndActivity().split("/")[0];
	}

	
	/**
	 * 退出当前应用
	 * 
	 */
	public void quitCurrentApp() {
		ShellUtils.shell("am force-stop " + getCurrentPackageName());
	}
	
	/**
	 * 等待时间
	 */
	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
