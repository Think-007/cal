package com.thinker.cal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.thinker.cal.dao.MysqlMapper;

@SpringBootApplication
@MapperScan(basePackageClasses = { MysqlMapper.class })
@ServletComponentScan
@ImportResource({ "classpath:config/shiro/shiro-config.xml","classpath:hessian/hessian-client.xml" })
public class CalculateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculateApplication.class, args);
	}
}
