package com.example.first.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.first.entities.Product;

@Component
public class ProductRepository {
	
private Map<Long, Product> mp = new HashMap<Long, Product>(); // "Persistência" provisória
	
	public void save(Product obj) {
		mp.put(obj.getId(), obj);
	}

    public List<Product> findAll() {
		return new ArrayList<Product>(mp.values());
	}
	
    public Product findById(Long id) {
		return mp.get(id);
	}

}
