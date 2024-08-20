package com.basicSpring.spring1.HelloSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//record eliminates verbosity in creating java beans
//public accessor method, constructor
//equals, hashnode and toString are automaticlly created
//released in jdk16
record Person(String name,int age,Address address) {};
record Address(String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
	@Bean	
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean(name="address2")
	public Address address() {
		return  new Address("Baker Street","London");
	}
	
	@Bean
	@Primary
	public Person person() {
		return new Person("Ravi",20,address());
	}
		
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person person3MethodParameter(String name, int age, Address address) {
		return new Person(name,age,address);
	}
	
	
}
