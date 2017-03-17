package com.tianan.odb.configuration_device;

import com.tianan.odb.configuration_adb.adbDevice;

public class GetAndroidDevice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		adbDevice adb = new adbDevice();
		//设备UID
		adb.AdbDeviceUid().get(0);
		adb.AdbDeviceUid().get(1);
//		System.out.println("11111111111111111111");
//		System.out.println(adb.getDeviceId());
//		System.out.println(adb.AdbDeviceUid().get(0));
//		System.out.println(adb.AdbDeviceUid().get(1));
//		adb.getDeviceId(adb.AdbDeviceUid().get(0));
//		System.out.println(adb.getDeviceId(adb.AdbDeviceUid().get(0)));
//		System.out.println(adb.getDeviceId(adb.AdbDeviceUid().get(1)));
		
		System.out.println(adb.getAndroidModel());
		System.out.println(adb.getAndroidVersion());
		System.out.println(adb.getDeviceId());
		
		
		
		//设备版本号
	}

}
