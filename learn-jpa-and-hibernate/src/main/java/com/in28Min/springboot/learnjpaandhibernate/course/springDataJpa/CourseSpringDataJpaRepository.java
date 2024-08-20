package com.in28Min.springboot.learnjpaandhibernate.course.springDataJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28Min.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long>{
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
	
}
