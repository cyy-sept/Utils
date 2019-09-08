/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: RandomUtil.java 
 * @Prject: cyy-cmmmon
 * @Package: com.cyy.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月6日 下午3:47:27 
 * @version: V1.0   
 */
package com.cyy.common.utils;

import java.util.HashSet;
import java.util.Random;

/** 
 * @ClassName: RandomUtil 
 * @Description: TODO
 * @author: 程远扬
 * @date: 2019年9月6日 下午3:47:27  
 */
public class RandomUtil {

	/*
	 * //方法1：返回min-max之间的随机整数（包含min和max值）
	 * ，例如返回1-3之间的随机数，
	 * 那么返回1或2或3都是正确的，返回4就不对
	 */
	
	public static int random(int min,int max) {
		
		Random r = new Random();
		int i = r.nextInt(max-min+1)+min;
		return i;
	}
	
	/*方法2：在最小值min与最大值max之间截取subs个不重复的随机数。
	例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，
	因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。*/
	
	public static int[] subRandom (int min, int max, int subs){
		
		//创建要截取的随机的数的数组
		int[] x = new int[subs];
		int i = 0;
		//定义set用来过滤重复的数据
		HashSet<Integer> set = new HashSet<Integer>(subs);
		while(set.size()!=subs) {
			set.add(random(min,max));
		}
		for (Integer integer : set) {
			x[i] = integer;
			i++;
		}
		
		return x;
	}
	
	//方法3：返回1个1-9,a-Z之间的随机字符
	
	public static char randomCharacter (){
		
		String str= 
		"1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return str.charAt(random(0, str.length()-1));
	}
	
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法
	
	public static String randomString(int length){
		String str = "";
		for (int i = 0; i < length; i++) {
			str += randomCharacter();
		}
		return str;
	}
}
