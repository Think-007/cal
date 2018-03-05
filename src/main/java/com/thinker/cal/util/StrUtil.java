/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2018年1月22日	| lipengfeia 	| 	create the file                       
 */

package com.thinker.cal.util;

/**
 * 
 * 类简要描述
 * 
 * <p>
 * 类详细描述
 * </p>
 * 
 * @author lipengfeia
 * 
 */

public class StrUtil {

	public static boolean isNull(String str) {

		return (null == str || "".equals(str.trim())) ? true : false;
	}

}
