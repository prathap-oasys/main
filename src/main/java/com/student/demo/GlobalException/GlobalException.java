package com.student.demo.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.student.demo.CustomException.AgeIsLessThanEighteenException;

@RestControllerAdvice
public class GlobalException {
	
	
	@ExceptionHandler(AgeIsLessThanEighteenException.class)
    ResponseEntity<Object> Agelessthan(AgeIsLessThanEighteenException s1){
		return new ResponseEntity<>(s1.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	

}
