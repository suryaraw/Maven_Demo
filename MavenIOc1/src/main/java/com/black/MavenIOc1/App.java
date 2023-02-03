package com.black.MavenIOc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Sim Porting...");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
	
		CommonClass common = context.getBean("common",CommonClass.class);
		common.common();
		
		

//		network.sim();
		/*
		 * Jio jio = new Jio();
		 * 
		 * jio.sim();
		 * 
		 * Airtel airtel = new Airtel();
		 * 
		 * airtel.sim();
		 */

	}
}
