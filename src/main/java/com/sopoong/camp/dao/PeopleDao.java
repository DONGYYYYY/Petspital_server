package com.sopoong.camp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sopoong.camp.mapper.PeopleMapper;
import com.sopoong.camp.vo.People;

@Repository
public class PeopleDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<People> ShowPeople()
	{
		return sqlSession.getMapper(PeopleMapper.class).ShowPeople();
	}
	
	public int UpdatePeople(int camera, int count)
	{
		return sqlSession.getMapper(PeopleMapper.class).UpdatePeople(camera, count);
	}
	
	public People ShowCount(int camera)
	{
		return sqlSession.getMapper(PeopleMapper.class).ShowCount(camera);
	}
	
}
