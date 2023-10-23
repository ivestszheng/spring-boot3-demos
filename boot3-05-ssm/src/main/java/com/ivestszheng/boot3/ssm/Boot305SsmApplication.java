package com.ivestszheng.boot3.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 告诉 MyBatis 扫描哪个包下面的所有接口
 * 2. 使用配置告诉 MyBatis，每个接口的 xml 文件都在哪里
 * 3. MyBatis 自动关联绑定。
 */
@MapperScan(basePackages = "com.ivestszheng.boot3.ssm.mapper")
@SpringBootApplication
public class Boot305SsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot305SsmApplication.class, args);
	}

}
