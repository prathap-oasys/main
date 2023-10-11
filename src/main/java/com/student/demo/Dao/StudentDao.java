package com.student.demo.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.demo.Entity.Student;
import com.student.demo.Repositary.StudentRepositary;



@Repository
public class StudentDao {
	
	@Autowired
	StudentRepositary stuRepo;

	public Student addStudentDetails(Student s) {
		
		stuRepo.save(s);
		
		return s;
	}

	public List<Student> getStudentDetails() {
		
		return stuRepo.findAll();
	}

	public Student updateStudentDetails(Student s) {
		
		stuRepo.findById(s.getId());
		stuRepo.save(s);
	
		return s;
	}

	public String deleteStudentDetails(int s) {
	
		stuRepo.deleteById(s);
		return "Deleted Success";
	}

	public Student getSById(int id) {
		
		return stuRepo.getSById(id);
	}

	

}
