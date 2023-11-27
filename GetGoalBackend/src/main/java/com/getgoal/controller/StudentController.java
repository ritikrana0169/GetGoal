package com.getgoal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.getgoal.model.Student;
import com.getgoal.service.StudentService;
import com.getgoal.temp.LoginCredentials;
@CrossOrigin
@RestController
public class StudentController {
@Autowired
private StudentService studentService;

@PostMapping("/add")
public ResponseEntity<String> saveStudentHandler(@RequestBody Student student) {
String st=studentService.saveStudent(student);
if(st=="err") {
	return new ResponseEntity<>("Error",HttpStatus.BAD_REQUEST);
}
return new ResponseEntity<>(st,HttpStatus.CREATED);
}

@PostMapping("/login")
public ResponseEntity<String> loginStudentHandler(@RequestBody LoginCredentials lc) {
System.out.println(lc.getEmail());
	String st=studentService.loginStudent(lc);
	if(st=="wrong credentials") {
		return new ResponseEntity<>(st,HttpStatus.BAD_REQUEST);
	}
	return new ResponseEntity<>(st,HttpStatus.ACCEPTED);
}


}
