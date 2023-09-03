package com.oliveyoung.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.oliveyoung.web.entity.MemberEntity;

@Mapper
public interface MemberDao {
	
	public List<MemberEntity> getMemberAll();
}

