package com.black.Maven4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.black.Maven4")
@PropertySource("classpath:application.properties")
public class ConfigClass {

}
