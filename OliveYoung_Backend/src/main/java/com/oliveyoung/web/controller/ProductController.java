package com.oliveyoung.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oliveyoung.web.dao.ProductDao;
import com.oliveyoung.web.entity.ProductEntity;

@RestController
public class ProductController {

	@Autowired
	ProductDao pDao;
	
	@GetMapping("/getProductAll")
	public List<ProductEntity> getProductAll() {
		List<ProductEntity> list = pDao.getProductAll();
		return list;
	}
	
}
