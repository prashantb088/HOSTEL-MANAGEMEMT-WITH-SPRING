package com.hmswithspring.advice;

import java.util.HashMap;

import java.util.Map;

import com.hmswithspring.exception.globalException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class exceptionHandler {
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	
	public Map<String,String> handleInvalidArgs(MethodArgumentNotValidException ex){
		
		Map<String,String> errorMap = new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach(error->{
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		
		return errorMap;
		
		
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(globalException.class)
	public Map<String,String> handleGlobal(globalException ge){
		
		Map<String,String> errorMap = new HashMap<>();
		
		errorMap.put("Error", ge.getMessage());
		
		return errorMap;
		
		
	}
	
	
	
	
	
	

}
