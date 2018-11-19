package com.sopoong.camp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sopoong.camp.dao.MemberDao;
import com.sopoong.camp.vo.Comment;
import com.sopoong.camp.vo.Member;


@RestController
@RequestMapping("/Pet")
public class PetController {
	
	@Autowired
	MemberDao memberDao;
	
	@RequestMapping(value = "/AddPet",method=RequestMethod.POST, produces="application/json;charset=UTF-8")
	public int signUpMember(@RequestBody Member member){
		
		return memberDao.signUpMember(member);
	}

	
	@RequestMapping(value = "/GetPetList",method=RequestMethod.POST, produces="application/json;charset=UTF-8")
	public Member signInMember(@RequestBody Member member){
		return memberDao.signInMember(member);
	}

	
	@RequestMapping(value = "/DelPet",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public int deleteMember(@RequestBody Member member) {
		return memberDao.deleteMember(member);
	}
}
