package com.student.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.CustomException.AgeIsLessThanEighteenException;
import com.student.demo.Entity.Student;
import com.student.demo.Service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	StudentService stuSer;

	@PostMapping(value = "/addStudentDetails")
	public Student addStudentDetails(@RequestBody Student s) throws AgeIsLessThanEighteenException{

		return stuSer.addStudentDetails(s);

	}
	
	@GetMapping(value = "/getStudentAllDetails")
	public List<Student> getStudentAllDetails() {

		return stuSer.getStudentDetails();

	}
	
	@PutMapping(value = "/updateStudentDetails")
	public Student updateStudentDetails(@RequestBody Student s) {

		return stuSer.updateStudentDetails(s);

	}
	
	@DeleteMapping(value = "/deleteStudentDetails/{s}")
	public String deleteStudentDetails(@PathVariable int s) {

		return stuSer.deleteStudentDetails(s);

	}
	
	@GetMapping(value = "/getById/{id}")
	public Student getSById(@PathVariable int id) {

		return stuSer.getSById(id);

	}




}
