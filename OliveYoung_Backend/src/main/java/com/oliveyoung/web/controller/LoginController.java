package com.oliveyoung.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oliveyoung.web.dao.MemberDao;
import com.oliveyoung.web.entity.MemberEntity;

@RestController
public class LoginController {

	@Autowired
	MemberDao mDao;
	
	@GetMapping("/getMemberAll")
	public List<MemberEntity> getMemberAll() {
		List<MemberEntity> list = mDao.getMemberAll();
		return list;
	}
	
	@PostMapping("/getMemberBySeq")
	public MemberEntity getMemberBySeq(@RequestBody MemberEntity mEnt) {
		MemberEntity result = mDao.getMemberBySeq(mEnt);
		return result;
	}
	
	@PostMapping("/joinMember")
	public int joinMember(@RequestBody MemberEntity mEnt) {
		int result = mDao.joinMember(mEnt);
		return result;
	}
	
	@PostMapping("/checkExist")
	public int checkExist(@RequestBody MemberEntity mEnt) {
		int result = mDao.checkExist(mEnt);
		return result;
	}
	
	@PostMapping("/checkExistNick")
	public int checkExistNick(@RequestBody MemberEntity mEnt) {
		int result = mDao.checkExistNick(mEnt);
		return result;
	}
	
	@PostMapping("/login")
	public MemberEntity login(@RequestBody MemberEntity mEnt) {
		MemberEntity result = new MemberEntity(); 
		result = mDao.login(mEnt);
		if (result == null){
			MemberEntity exception = new MemberEntity();
			exception.setMseq(-1);
			return exception;
		}
		return result;
	}
}
