package com.getgoal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getgoal.model.Student;
import com.getgoal.repository.StudentRepo;
import com.getgoal.temp.LoginCredentials;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	public String saveStudent(Student student) {
		Student st=studentRepo.save(student);
		if(st==null) {
			return "err";
		}
		return "Student "+student.getName()+" Registered Succesfully";
				
	}

	public Student loginStudent(LoginCredentials lc) {
		Student st=studentRepo.findByEmail(lc.getEmail());
		
		if (st != null && st.getPassword().toLowerCase().equals(lc.getPassword().toLowerCase())) {

			System.out.println(st.getEmail());
				return st;
			
		}
		
				
		
		return null;
	}
}
