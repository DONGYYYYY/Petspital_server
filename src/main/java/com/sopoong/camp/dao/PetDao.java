package com.sopoong.camp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sopoong.camp.mapper.PetMapper;
import com.sopoong.camp.vo.Pet;

@Repository
public class PetDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int AddPet(Pet pet)
	{
		return sqlSession.getMapper(PetMapper.class).AddPet(pet);
	}
	
	public List<Pet> GetPetList(String UserId)
	{
		return sqlSession.getMapper(PetMapper.class).GetPetList(UserId);
	}
	
	public int DeletePet(Pet pet) {
		return sqlSession.getMapper(PetMapper.class).DeletePet(pet);
	}
	
	public int UpdatePet(Pet pet)
	{
		return sqlSession.getMapper(PetMapper.class).UpdatePet(pet);
	}
	
	public Pet GetPet(String userid,String name, String birth, String kind , int flag , int sex)
	{
		return sqlSession.getMapper(PetMapper.class).GetPet(userid,name,birth,kind,flag,sex);
	}
}
