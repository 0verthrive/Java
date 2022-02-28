package com.example.first.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.first.entities.Category;

@Component
public class CategoryRepository {
	
	private Map<Long, Category> mp = new HashMap<Long, Category>(); //"persistência" provisória
	
	public void save(Category obj) {
		mp.put(obj.getId(), obj);
	}
	
	public List<Category> findAll(){
		return new ArrayList<Category>(mp.values());
	}
	
	public Category findById(Long id){
		return mp.get(id);
	}
	
	
}
