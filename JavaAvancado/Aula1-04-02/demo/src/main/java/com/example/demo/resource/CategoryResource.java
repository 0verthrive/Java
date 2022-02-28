package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Category;
import com.example.demo.repository.CategoryRepository;

@RestController
@RequestMapping(value="/test")
public class CategoryResource {
	/* Exemplo com "gambiarra":
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> ls = new ArrayList<Category>();
		
		ls.add(new Category(1L, "Caderno"));
		ls.add(new Category(2L, "Lápis"));
		
		return ResponseEntity.ok().body(ls);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		
		Category cat = new Category(1L, "Post-it");
	
		return ResponseEntity.ok().body(cat);
	}
	*/
	
	/*Exemplo com repositório*/
	@Autowired
	private CategoryRepository CR;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> ls = CR.findAll();
		
		return ResponseEntity.ok().body(ls);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		
		Category cat = CR.findById(id);
	
		return ResponseEntity.ok().body(cat);
	}
}
