package com.poc.runtimeconfiglogger;

import com.poc.runtimeconfiglogger.config.LogConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(LogConfig.class)
public class RuntimeConfigLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RuntimeConfigLoggerApplication.class, args);
	}
}
