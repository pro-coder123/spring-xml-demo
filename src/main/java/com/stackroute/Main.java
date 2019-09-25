package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.io.File;

public class Main {


    public static void main(String[] args) {



        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");


        System.out.println("Using Autowiring Byname");
        Movie m =  app.getBean("movie",Movie.class);

        m.display();

        System.out.println("Using Autowiring Constructor");

        Movie m1 =  app.getBean("m1",Movie.class);

        m1.display();





    }
}
