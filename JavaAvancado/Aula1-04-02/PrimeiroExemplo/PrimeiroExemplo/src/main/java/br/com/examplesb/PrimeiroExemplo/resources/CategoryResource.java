package br.com.examplesb.PrimeiroExemplo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.examplesb.PrimeiroExemplo.entities.Category;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> lista = new ArrayList<Category>();
		
		lista.add(null);
		
		return ResponseEntity.ok().body(lista);
	}
	
	
}
