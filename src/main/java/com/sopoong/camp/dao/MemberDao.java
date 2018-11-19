package com.sopoong.camp.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sopoong.camp.mapper.MemberMapper;
import com.sopoong.camp.vo.Member;

@Repository
public class MemberDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int signUpMember(Member member)
	{
		return sqlSession.getMapper(MemberMapper.class).signUpMember(member);
	}
	
	public Member signInMember(Member member)
	{
		return sqlSession.getMapper(MemberMapper.class).signInMember(member);
	}
	
	public int deleteMember(Member member)
	{
		return sqlSession.getMapper(MemberMapper.class).deleteMember(member);
	}
	
}
