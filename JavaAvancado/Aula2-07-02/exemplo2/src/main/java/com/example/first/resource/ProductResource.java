package com.example.first.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.entities.Product;
import com.example.first.repository.ProductRepository;

@RestController
@RequestMapping(value="/product")
public class ProductResource {
	@Autowired
	private ProductRepository productRepository;  //Não instanciado diretamente.
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		
		List<Product> lista = productRepository.findAll();

		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		
		Product cat = productRepository.findById(id);
		
		return ResponseEntity.ok().body(cat);
	}
}
