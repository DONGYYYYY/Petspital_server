package com.sopoong.camp.mapper;

import com.sopoong.camp.vo.Member;

public interface MemberMapper {

	int signUpMember(Member member);
	
	Member signInMember(Member member);
	
	int deleteMember(Member member);
	
}
