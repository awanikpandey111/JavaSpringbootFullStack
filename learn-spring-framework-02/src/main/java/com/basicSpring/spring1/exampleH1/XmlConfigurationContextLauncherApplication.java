package com.basicSpring.spring1.exampleH1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Configuration
//@ComponentScan
public class XmlConfigurationContextLauncherApplication {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try(var context=new ClassPathXmlApplicationContext("contextConfiguration.xml")

				){
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
		}
		

	}

}
