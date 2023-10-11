package com.student.demo.Repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.demo.Entity.Student;

public interface StudentRepositary extends JpaRepository<Student, Integer>{

	
	@Query(value="select * from student where id=?",nativeQuery=true)
	Student getSById(int id);

	/*
	@Query(value="select * from student where id=?",nativeQuery=true)
	Student getByIdStudentDetails(int x);
	*/

}
