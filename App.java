package com.assigment.demo2;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;

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
        System.out.println( "Hello" );
        
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Car obj=(Car) context.getBean("car");

        System.out.println("Choose your brand");
        Scanner sc=new  Scanner(System.in);
        obj.setBrand(sc.nextLine());

        System.out.println(obj);


        System.out.println("Choose your color:");
        Color obj1=(Color) context.getBean("color");
        Scanner scan=new  Scanner(System.in);
        obj1.setColor(scan.nextLine());
        System.out.println(obj1);

        System.out.println("Choose your Tyrebrand:");
        Tyre obj2=(Tyre) context.getBean("tyre");
        Scanner scanner=new  Scanner(System.in);
        obj2.setTyre(scanner.nextLine());
        System.out.println(obj2);

        System.out.println("You have choosen :"  +obj + obj1 + obj2);

        	

    }
}
