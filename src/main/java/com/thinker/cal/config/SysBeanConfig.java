/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2018年1月8日	| lipengfeia 	| 	create the file                       
 */

package com.thinker.cal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import utils.ConfigLoader;
import config.AppConfig;

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
@Configuration
public class SysBeanConfig {

	@Bean
	public AppConfig getAppConfig() {

		AppConfig config = ConfigLoader.load(ConfigLoader.ConfigType.Message);

		return config;
	}
}
