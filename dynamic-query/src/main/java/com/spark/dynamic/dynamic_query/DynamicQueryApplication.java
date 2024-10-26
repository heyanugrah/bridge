package com.spark.dynamic.dynamic_query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration;

@SpringBootApplication
public class DynamicQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicQueryApplication.class, args);
	}

}
