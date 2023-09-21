package com.oliveyoung.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oliveyoung.web.dao.ReviewDao;
import com.oliveyoung.web.entity.ReviewEntity;

@RestController
public class ReviewController {

	@Autowired
	ReviewDao rDao;
	
	// 리뷰리스트
	@GetMapping("/reviewList")
	public List<ReviewEntity> reviewList() {
		List<ReviewEntity> list = rDao.reviewList();
		return list;
	}
	
	// 리뷰등록
    @PostMapping("/reviewInsert")
	public int reviewInsert(@RequestBody ReviewEntity rEnt) {
		int result = rDao.reviewInsert(rEnt);
		return result;
	}
}
