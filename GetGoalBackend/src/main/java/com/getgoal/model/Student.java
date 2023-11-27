package com.getgoal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Student {

	@Id
	private String id;
	private String name;
	private Integer age;
	private String mobile;
	private String email;
	private String password;
	private String tech;
	private String level;
	private Boolean status;
}
