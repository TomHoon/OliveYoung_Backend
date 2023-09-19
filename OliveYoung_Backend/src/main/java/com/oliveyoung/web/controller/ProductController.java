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
	
	// 제품리스트
	@PostMapping("/productList")
	public List<ProductEntity> productList() {
		List<ProductEntity> list = pDao.productList();
		return list;
	}
	// 제품등록
    @PostMapping("/productInsert")
	public int productInsert(@RequestBody ProductEntity pEnt) {
		int result = pDao.productInsert(pEnt);
		return result;
	}
}
