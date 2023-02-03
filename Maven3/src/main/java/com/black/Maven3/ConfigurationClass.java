package com.black.Maven3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.black.Maven3")
@PropertySource("classpath:application.properties")
public class ConfigurationClass {

}
