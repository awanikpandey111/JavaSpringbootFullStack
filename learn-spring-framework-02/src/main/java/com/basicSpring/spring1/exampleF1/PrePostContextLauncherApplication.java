package com.basicSpring.spring1.exampleF1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency someDependency;
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency=someDependency;
		System.out.println("All dependencies are ready");
	}
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("cleanup");
	}
}

@Component
class SomeDependency{
	public void getReady() {
		System.out.println("some logic using someDependency");
	}
}
@Configuration
@ComponentScan
public class PrePostContextLauncherApplication {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try(		
				var context=new AnnotationConfigApplicationContext(PrePostContextLauncherApplication.class);

				){
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		}
		

	}

}
