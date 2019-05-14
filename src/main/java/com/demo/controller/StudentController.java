package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> theStudents=new ArrayList<Student>();
		
		theStudents.add(new Student("Yash","Grover"));
		theStudents.add(new Student("Rahul","Kumar"));
		theStudents.add(new Student("Nimish","Tuteja"));
		
		return theStudents;
	}
}
