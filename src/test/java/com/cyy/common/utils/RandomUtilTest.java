/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: RandomUtilTest.java 
 * @Prject: cyy-cmmmon
 * @Package: com.cyy.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月6日 下午4:22:41 
 * @version: V1.0   
 */
package com.cyy.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author: 程远扬
 * @date: 2019年9月6日 下午4:22:41  
 */
public class RandomUtilTest {

	@Test
	public void testRandom() {
		
		for (int i = 0; i < 10; i++) {
			int j = RandomUtil.random(1, 9);
			System.out.println(j);
		}
	}

	@Test
	public void testSubRandom() {
		
		int[] subRandom = RandomUtil.subRandom(1, 10, 3);
		for (int i : subRandom) {
			System.out.println(i+" ");
		}
	}

	@Test
	public void testRandomCharacter() {
		
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
		
		String string = RandomUtil.randomString(4);
		System.out.println(string);
	}

}
