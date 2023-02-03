package com.black.Maven3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
    	
        System.out.println( "Server running..." );
        
        ComClass cclass = context.getBean("Cclass",ComClass.class);
        
        cclass.common();
        
    }
}
