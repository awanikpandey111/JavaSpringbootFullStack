package com.in28Min.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28Min.springboot.learnjpaandhibernate.course.Course;
import com.in28Min.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28Min.springboot.learnjpaandhibernate.course.springDataJpa.CourseSpringDataJpaRepository;
import com.in28Min.springboot.learnjpaandhibernate.course.springDataJpa.CourseSpringDataJpaRepository;
@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//	@Autowired
//	private CourseJdbcRepository repository;
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		for CourseJpaRepository
//		repository.insert(new Course(1,"Learn Aws jpa","in28Min"));
//		repository.insert(new Course(2,"Learn Azure jpa","in28Min"));
//		repository.insert(new Course(3,"Learn Devops jpa","in28Min"));
		
		//For springDataJpARepository
		repository.save(new Course(1,"Learn Aws jpa","in28Min"));
		repository.save(new Course(2,"Learn Azure jpa","in28Min"));
		repository.save(new Course(3,"Learn Devops jpa","in28Min"));
		
		
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("in28Min"));
		System.out.println(repository.findByName("Learn Azure jpa"));

	}

}
