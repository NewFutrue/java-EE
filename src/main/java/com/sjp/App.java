package com.sjp;

import com.sjp.service.PaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("service.xml");
        PaService serviceA = (PaService) context.getBean("serviceA");
        serviceA.add();
        serviceA.alter();
        serviceA.delete();
        serviceA.select();

        PaService serviceB = (PaService) context.getBean("serviceB");
        serviceB.add();
        serviceB.alter();
        serviceB.delete();
        serviceB.select();
    }
}
