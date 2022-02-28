package com.example.demo.entities;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long Id;
	private String Name;

	public Category() {
		super();
		}	
	
	public Category(Long id, String name) {
		super();
		Id = id;
		Name = name;
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(Id, other.Id);
	}
}
