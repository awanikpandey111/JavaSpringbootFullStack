package com.basicSpring.spring1.exampleD1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}
@Component
@Lazy
class ClassB{
	ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("some initialisation Logic");
		this.classA=classA;
	}
	public void doSomething() {
		System.out.println("doing something");
	}
}
@Configuration
@ComponentScan
public class LazyInitialisationLauncherApplication {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try(		
				var context=new AnnotationConfigApplicationContext(LazyInitialisationLauncherApplication.class)) {

		System.out.println("Initialisation of context is completed");
		context.getBean(ClassB.class).doSomething();
		}
		

	}

}
