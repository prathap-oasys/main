package com.student.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.CustomException.AgeIsLessThanEighteenException;
import com.student.demo.Dao.StudentDao;
import com.student.demo.Entity.Student;
@Service
public class StudentService {
	
	@Autowired
	StudentDao stuDao;

	public Student addStudentDetails(Student s) throws AgeIsLessThanEighteenException{
		
		
		if(s.getAge()<=18) {
			throw new AgeIsLessThanEighteenException("Your Age is Less than 18");
			
		}else {
			return stuDao.addStudentDetails(s);
		}
		
		
			
	}

	public List<Student> getStudentDetails() {
	
		return stuDao. getStudentDetails();
	}

	public Student updateStudentDetails(Student s) {
		
		return stuDao.updateStudentDetails(s);
	}

	public String deleteStudentDetails(int s) {
		
		return stuDao.deleteStudentDetails(s);
	}

	public Student getSById(int id) {
		
		return stuDao.getSById(id);
	}


}
