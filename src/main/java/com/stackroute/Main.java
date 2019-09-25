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

        BeanFactory factory =  new XmlBeanFactory(new FileSystemResource("/home/cgi/Documents/Java/Spring/src/main/resources/beans.xml"));

//        Actor actor = (Actor) factory.getBean("actor");
//        actor.display();


        Movie movie = (Movie) factory.getBean("movie");
        System.out.println("Using XMLBeanFactory");
        movie.display();

        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");



        Movie m =  app.getBean("movie",Movie.class);
        System.out.println("Using ApplicationContext");

        m.display();


//
        Actor abc = app.getBean("a1",Actor.class);


        Movie m1 =  app.getBean("m1",Movie.class);
        m1.display();

       Movie m2 = app.getBean("m1",Movie.class);
       System.out.println(m1 == m2);





    }
}
