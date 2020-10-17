package com.sw409.Blackboard.models;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Courses")
public class Course {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	Integer id;
	String title;
	String authorName;
	@OneToMany(mappedBy = "course")
	private List<Module> modules;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Course(Integer id, String title, String authorName) {

		this.id = id;
		this.title = title;
		this.authorName = authorName;
	}
	public Course() {
		super();
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	

}
