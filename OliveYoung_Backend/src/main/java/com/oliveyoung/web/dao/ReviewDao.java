package com.oliveyoung.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.oliveyoung.web.entity.ReviewEntity;

@Mapper
public interface ReviewDao {

    // 제품리스트
    public List<ReviewEntity> reviewList();
    
    // 제품등록
    public int reviewInsert(ReviewEntity rEnt);

	
}

