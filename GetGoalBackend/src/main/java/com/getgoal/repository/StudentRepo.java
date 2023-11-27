package com.getgoal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.getgoal.model.Student;
@Repository
public interface StudentRepo extends MongoRepository<Student,String>{
	public Student findByEmail(String email);

}
