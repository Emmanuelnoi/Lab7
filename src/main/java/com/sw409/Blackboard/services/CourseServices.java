package com.sw409.Blackboard.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.Blackboard.models.Course;
import com.sw409.Blackboard.repositories.CourseRepository;

@Service
public class CourseServices {

	@Autowired
	CourseRepository courseRepository;
	
	public ArrayList<Course>getAllCourse()
	{
		return(ArrayList<Course>) courseRepository.findAll();
	}
}
