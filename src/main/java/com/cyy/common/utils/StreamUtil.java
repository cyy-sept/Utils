/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StreamUtil.java 
 * @Prject: cyy-common
 * @Package: com.cyy.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月5日 上午10:25:14 
 * @version: V1.0   
 */
package com.cyy.common.utils;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.portable.InputStream;

/** 
 * @ClassName: StreamUtil 
 * @Description: TODO
 * @author: 程远扬
 * @date: 2019年9月5日 上午10:25:14  
 */
public class StreamUtil {

	/*
	 * 方法1：批量关闭流，参数能传无限个。(3分) 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	 */
	
	//无限参数
	public static void closeAll(AutoCloseable... ables) {
		
		//不为空
		if(ables!=null && ables.length>0) {
			//多个循环关流
			for (AutoCloseable ac : ables) {
				try {
					ac.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	 * 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	 */
	
	public static String readTextFile(FileInputStream fileInputStream) {
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		
		byte[] b = new byte[1024];
		int len = 0;
		
		try {
			while((len=fileInputStream.read(b))!=-1) {
				os.write(b);
			}
			return os.toString("utf-8");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//关闭流
			closeAll(fileInputStream,os);
		}
		return null;
	}
	
	/*
	 * 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	 */
	
	public static String readTextFile(File txtFile) {
		
		try {
			FileInputStream fs = new FileInputStream(txtFile);
			return readTextFile(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 一行行读取数据返回的结果集
	 * @Title: readFile 
	 * @Description: TODO
	 * @param in
	 * @return
	 * @return: List<String>
	 */
	public static List<String> readFile(InputStream in) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		List<String> list = new ArrayList<>();
		String lineText = null;
		try {
			while ((lineText = reader.readLine()) != null) {

				list.add(lineText);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;

	}
}
