package com.example.first.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.entities.Category;
import com.example.first.repository.CategoryRepository;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryRepository CR;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> ls = CR.findAll();
		
		return ResponseEntity.ok().body(ls);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category ct = CR.findById(id);
		return ResponseEntity.ok().body(ct);
	}

}
