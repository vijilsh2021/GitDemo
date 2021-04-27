package com.cognizant.LearnTodayRESTAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.cognizant.LearnTodayRESTAPI.model.Course;
import com.cognizant.LearnTodayRESTAPI.model.CourseComparator;

public class Main {
	
	public static void main(String[] args) throws ParseException {
		Course c1=new Course();
		c1.setCourseId(1);
		c1.setStartDate(new Date());
		Course c2=new Course();
		c2.setCourseId(2);
		String str="2014-12-19";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(str);
		c2.setStartDate(new Date());
		List<Course> lst=new ArrayList<Course>();
		Course c3=new Course();
		c3.setCourseId(3);
		 str="2013-12-19";
		 sdf=new SimpleDateFormat("yyyy-MM-dd");
		 d=sdf.parse(str);
		c3.setStartDate(d);
		
		lst.add(c1);
		lst.add(c2);
		lst.add(c3);
		Collections.sort(lst,new CourseComparator());
		System.out.println(lst);
	}

}
