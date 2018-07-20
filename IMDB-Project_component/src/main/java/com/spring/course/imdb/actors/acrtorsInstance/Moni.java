package com.spring.course.imdb.actors.acrtorsInstance;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.course.imdb.actors.Actor;
import com.spring.course.imdb.actors.GENDER;

@Component
public class Moni extends Actor {

	@Value("${moni.id}")
    private int id;
	
	@Value("${moni.name}")
    private String  name;
	
	@Value("${moni.age}")
    private int age;
	
	@Value("${moni.gender}")
    private GENDER gender; 
		
		
	
@PostConstruct
public void init() {
    this.setId(id);
    this.setName(name);
    this.setAge(age);
    this.setGender(gender);    
    
}
}


