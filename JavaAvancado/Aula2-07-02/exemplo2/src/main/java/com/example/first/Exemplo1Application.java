package com.example.first;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.first.entities.Category;
import com.example.first.entities.Product;
import com.example.first.repository.CategoryRepository;
import com.example.first.repository.ProductRepository;

@SpringBootApplication
public class Exemplo1Application implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository CR;
	@Autowired
	private ProductRepository PR;
	
	public static void main(String[] args) {
		SpringApplication.run(Exemplo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category ct1 = new Category(null, "Papelaria");
		Category ct2 = new Category(null, "Eletronicos");

		Product p1 = new Product(null, "Post-it", 2.99, ct1);
		Product p2 = new Product(null, "Notebook Lenovo", 1020.00, ct2);
		Product p3 = new Product(null, "Caderno mágico", 20.00, ct1);
		Product p4 = new Product(null, "Ventuinho com fan", 159.00, ct2);
		
		ct1.getProducts().addAll(Arrays.asList(p1, p3));
		ct2.getProducts().addAll(Arrays.asList(p2, p4));
	
		CR.save(ct1);
		CR.save(ct2);

		PR.save(p1);
		PR.save(p2);
		PR.save(p3);
		PR.save(p4);
	}
}
