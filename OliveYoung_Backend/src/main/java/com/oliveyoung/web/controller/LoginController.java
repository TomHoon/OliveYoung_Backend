package com.oliveyoung.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
		System.out.println("result >>>> " + list);
		return list;
	}
}
