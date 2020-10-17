package com.sw409.Blackboard.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.Blackboard.models.Course;
import com.sw409.Blackboard.services.CourseServices;

@RestController
@CrossOrigin("*")
public class CourseControllers {
	@Autowired
	CourseServices courseService;
	@GetMapping("api/courses")
	public ArrayList<Course>getAllCourse()
	{
		return courseService.getAllCourse();
	}

}
