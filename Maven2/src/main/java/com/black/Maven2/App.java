package com.black.Maven2;

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
        System.out.println( "Maven Sim Portal.." );
//        
//        Network network = new Airtel();
//        
//        network.sim();
        
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);		
        CNetwork cnetwork = context.getBean("Cnet",CNetwork.class);
        cnetwork.common();
        
    }
}
