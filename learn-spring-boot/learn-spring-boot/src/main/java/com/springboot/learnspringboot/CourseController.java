package com.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
// courses
	//course, id , name, author
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourse(){
		return Arrays.asList(
				new Course(1,"Learn Aws","in28Minutes"),
				new Course(2,"Learn Devops","in28Minutes"),
				new Course(3,"Learn Spring","in 28Min")
						);
	}
}
