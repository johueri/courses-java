package com.coursesjava;

public class CourseTopic {
	
	private Long id; // ???? Ask Alan why this is capitalized
	private String name;
	private String description;
	private String instructor;
	
	public CourseTopic(Long id, String name, String description, String instructor) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.instructor = instructor;
	}

	public CourseTopic(String name, String description, String instructor) {
		this.name =name;
		this.description = description;
		this.instructor = instructor;
		id = (long)(Math.random()) * 1000; // This line of code is to randomly generate a long id number. 
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getInstructor() {
		return instructor;
	}

}
