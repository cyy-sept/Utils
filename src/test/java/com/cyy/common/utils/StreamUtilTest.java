/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StreamUtilTest.java 
 * @Prject: cyy-common
 * @Package: com.cyy.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月6日 上午9:24:52 
 * @version: V1.0   
 */
package com.cyy.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/** 
 * @ClassName: StreamUtilTest 
 * @Description: TODO
 * @author: 程远扬
 * @date: 2019年9月6日 上午9:24:52  
 */
public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
		
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		
		String string = StreamUtil.readTextFile(new FileInputStream("D:\\git/readme.txt"));
		
		System.out.println(string);
		
	}

	@Test
	public void testReadTextFileFile() {

		String string = StreamUtil.readTextFile(new File("D:\\git/readme.txt"));
		
		System.out.println(string);
	}

}
