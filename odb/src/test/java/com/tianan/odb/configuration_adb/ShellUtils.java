package com.tianan.odb.configuration_adb;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ShellUtils {

	public static Process cmd(String command) {
		return process("adb " + command);
	}

	 public static Process shell(String command) {
	 return process("adb shell " + command);
	 }

//	 public static Process shell(String id,String command) {
//		 return process("adb -s " + id + " shell " + command);
//		 }
	
	public static BufferedReader shellOut(Process ps) {
		BufferedInputStream in = new BufferedInputStream(ps.getInputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		return br;
	}

	public static String getShellOut(Process ps) {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = shellOut(ps);
		String line;

		try {
			while ((line = br.readLine()) != null) {
				sb.append(line);
//				 sb.append(line + System.getProperty("line.separator"));
//				if (line.trim().length() > 0) {
//					sb.append(line);
//					break;
//
//				}
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}

	 //获取多个iud的方法
	 public static List<String> getDevices(Process ps) {
	 List<String> list = new ArrayList<String>();
	 StringBuilder sb = new StringBuilder();
	 BufferedReader br = shellOut(ps);
	 String line;
	 int a=0;
	 try {
	 while ((line = br.readLine()) != null) {
	 a++;
	 if(a>1){
	 list.add(line.split("	")[0]);
	 }
	
	 }
	 } catch (IOException e) {
	 e.printStackTrace();
	 }
	
	 try {
	 br.close();
	 } catch (IOException e) {
	 e.printStackTrace();
	 }
	
	 return list;
	 }

	private static Process process(String command) {
		Process ps = null;
		try {
			ps = Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ps;
	}
}
