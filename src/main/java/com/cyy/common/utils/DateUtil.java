/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtil.java 
 * @Prject: cyy-common
 * @Package: com.cyy.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月5日 上午10:24:43 
 * @version: V1.0   
 */
package com.cyy.common.utils;

import java.util.Calendar;
import java.util.Date;

/** 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author: 程远扬
 * @date: 2019年9月5日 上午10:24:43  
 */
public class DateUtil {

	/*
	 * 方法1：(5分) 返回给定日期的月初 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	 * 则返回的结果为2019-05-01 00:00:00
	 */
	
	public static Date getDateByInitMonth(Date src) {
		
		//获取当前系统日历类
		Calendar c = Calendar.getInstance();
		//传入变量初始化日历类
		c.setTime(src);
		
		//设置日期
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
	}
	
	/*
	 * 方法2：(5分) 返回给定日期月末 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	 * 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	 * 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	 */
	
	public static Date getDateByFullMonth(Date src) {
		
		//获取当前系统日历类
		Calendar c = Calendar.getInstance();
		//传入变量初始化
		c.setTime(src);
		
		//月份加1
		c.add(Calendar.DAY_OF_MONTH, 1);
		
		//调用时间归0方法
		Date date = DateUtil.getDateByInitMonth(c.getTime());//获取是上一次的时间
		
		//新的时间
		c.setTime(date);
		
		//秒数-1
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	}
	
	//随机产生在某个时间段内的日期
			public static Date randomDate(Date minDate,Date maxDate) {
				
				Calendar c1 = Calendar.getInstance();
				
				//获取开始的时间的毫米数
				long l1 = minDate.getTime();
				//获取结束时间的毫米数
				long l2 = maxDate.getTime();
				
				//随机产生一个l1和l2之间的随机数据 l3
				
				long l3= (long) ((Math.random() * (l2-l1 +1 ))+l1);
				//用毫秒 初始化日历类
				c1.setTimeInMillis(l3);	
				
				return c1.getTime();
				
			}
}
