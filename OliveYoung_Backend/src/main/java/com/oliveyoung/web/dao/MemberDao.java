package com.oliveyoung.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.oliveyoung.web.entity.MemberEntity;

@Mapper
public interface MemberDao {
	public List<MemberEntity> getMemberAll();
	public MemberEntity getMemberBySeq(MemberEntity mEnt);
	public int joinMember(MemberEntity mEnt);
	public int checkExist(MemberEntity mEnt);
	public int checkExistNick(MemberEntity mEnt);
	public MemberEntity login(MemberEntity mEnt);
}

