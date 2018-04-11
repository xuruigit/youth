package com.xurui;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class YouthApplication {

	public static void main(String[] args) {
		SpringApplication.run(YouthApplication.class, args);
	}
}
