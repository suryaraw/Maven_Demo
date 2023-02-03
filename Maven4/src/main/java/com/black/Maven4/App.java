package com.black.Maven4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Portal for Sim's" );
        
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        
        CommonClass commonClass= context.getBean("common",CommonClass.class);
        commonClass.common();
        
        
    }
}
