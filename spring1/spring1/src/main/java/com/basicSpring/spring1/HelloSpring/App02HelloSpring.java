package com.basicSpring.spring1.HelloSpring;



import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 */
public class App02HelloSpring {

	public static void main(String[] args) {
		 //Launch a Spring Context
		//configure the things that we want spring to manage- @configuration(HelloWorldconfiguration)
		try(
				var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			//retrieving Beans managed by Spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3MethodParameter"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean(Person.class));

			Arrays.stream(context.getBeanDefinitionNames())
		        	.forEach(System.out::println);
		}
		
		
	}

}
