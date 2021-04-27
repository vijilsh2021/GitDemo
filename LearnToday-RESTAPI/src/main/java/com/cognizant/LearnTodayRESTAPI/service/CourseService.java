package com.cognizant.LearnTodayRESTAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.LearnTodayRESTAPI.model.Course;
import com.cognizant.LearnTodayRESTAPI.repository.CourseRepository;

@Component
public class CourseService {
	@Autowired
	CourseRepository courseRepo;
	public List<Course> getAllCourses(){
		return courseRepo.findAll();
	}
	
	public Course getCourseByID(int id) {
		Course course=null;
		Optional<Course> p= courseRepo.findById(id);
		if(p.isPresent()) {
			course=p.get();
		}
		return course;
	}

}
