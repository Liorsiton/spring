package com.spring.course.imdb.actors;

import com.spring.course.imdb.ego.EgoMetrics;

public class Actor {
	
	private int id;
	private String name;
	private int age;
	private GENDER gender;
	private EgoMetrics egoMetrics;
	
	
	
	public Actor(int id, String name, int age, GENDER gender) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	
	
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public GENDER getGender() {
		return gender;
	}
	public void setGender(GENDER gender) {
		this.gender = gender;
	}		
	
	public void setEgoMetrics(EgoMetrics egoMetrics) {
		this.egoMetrics = egoMetrics;
	}	
	
	public EgoMetrics getEgoMetrics() {
		return egoMetrics;
	}
	
	
	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", egoMetric" + egoMetrics + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actor other = (Actor) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
	

}
