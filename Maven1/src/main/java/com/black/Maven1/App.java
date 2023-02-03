package com.black.Maven1;

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
        System.out.println( "Spring Core..!" );
        
        @SuppressWarnings("resource")
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(ConfigClass.class);
        
//        Network network = ctxt.getBean("vi",Vi.class);
//        
//        network.sim();
//        
        Commonclass common =  ctxt.getBean("common",Commonclass.class);
        common.common();
        
//        Vi vi = new Vi();
        
//        vi.setSchmID(2);
//        vi.setSchmName("Black Chip...");
//           
    }
}
