/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtilTest.java 
 * @Prject: cyy-common
 * @Package: com.cyy.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月5日 上午10:51:26 
 * @version: V1.0   
 */
package com.cyy.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: DateUtilTest 
 * @Description: TODO
 * @author: 程远扬
 * @date: 2019年9月5日 上午10:51:26  
 */
public class DateUtilTest {

	@Test
	public void getDateByInitMonth() {
		
		Calendar c = Calendar.getInstance();
		c.set(2001, 8, 15);
		
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(sf.format(date));
	}
	
	@Test
	public void getDateByFullMonth() {
		
		Calendar c = Calendar.getInstance();
		//c.set(2001, 8, 15);
		
		Date date = DateUtil.getDateByFullMonth(new Date());
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(sf.format(date));
	}
}
