package com.black.Maven2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.black.Maven2")
@PropertySource("classpath:Application.properties")
public class ConfigurationClass {

	
	
}
