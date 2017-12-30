package com.load.util;

import java.util.Random;

/**   
*    
* 项目名称：loadMore   
* 类名称：Test   
* 类描述：   
* 创建人：edwarder   
* 创建时间：2017年8月15日 下午12:01:24   
*       
*/
public class Test {

	public static void main(String[] args) {
		//char c = '`';
		//System.out.println((int)(c));
		//System.out.println(randomString(-229985452) + " " + randomString(-147909649));
		System.out.println(new Random(12).nextInt());
	}
	
	public static String randomString(int seed){
		Random random = new Random(seed);
		StringBuffer sb = new StringBuffer();
		while(true){
			int n = random.nextInt(27);
			System.out.println(n);
			if(n == 0)break;
			sb.append((char)(96 + n));
		}
		return sb.toString();
		
	}

}
