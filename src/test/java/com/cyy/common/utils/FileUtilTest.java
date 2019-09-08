/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtilTest.java 
 * @Prject: cyy-common
 * @Package: com.cyy.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月6日 上午9:24:15 
 * @version: V1.0   
 */
package com.cyy.common.utils;

import java.io.File;

import org.junit.Test;

/** 
 * @ClassName: FileUtilTest 
 * @Description: TODO
 * @author: 程远扬
 * @date: 2019年9月6日 上午9:24:15  
 */
public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		
		String str = "test.txt.doc";
		String string = FileUtil.getExtendName(str);
		System.out.println(string);
	}

	@Test
	public void testGetTempDirectory() {
		
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}

}
