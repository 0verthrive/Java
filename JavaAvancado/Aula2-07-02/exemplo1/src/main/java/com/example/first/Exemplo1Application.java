package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.first.entities.Category;
import com.example.first.repository.CategoryRepository;

@SpringBootApplication
public class Exemplo1Application implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository CR;
	
	public static void main(String[] args) {
		SpringApplication.run(Exemplo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category ct1 = new Category(1L, "Marca-texto pastel");
		Category ct2 = new Category(2L, "Suporte de post-it");
		
		CR.save(ct1);
		CR.save(ct2);
	}
}
