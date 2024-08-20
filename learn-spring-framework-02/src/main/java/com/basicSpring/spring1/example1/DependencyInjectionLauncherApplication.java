package com.basicSpring.spring1.example1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class YourBusinessClass{
	//@Autowired //filed injection
	Dependency1 dependency1;
	//@Autowired  //field injection
	Dependency2 dependency2;
	

	@Autowired   //even if we remove autowired it will work, spring will automatically inject.
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("constructor injection - set dependency");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}



	/*
	@Autowired   //setter injection
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("setter injection - dependency1");
		this.dependency1 = dependency1;
	}
	@Autowired // setter injection
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("setter injection - dependency2");
		this.dependency2 = dependency2;
	}
	*/
	public String toString() {
		return "using "+dependency1+" and "+dependency2;
	}
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try(		
				var context=new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class);

				){
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println(context.getBean(YourBusinessClass.class));
		}
		

	}

}
