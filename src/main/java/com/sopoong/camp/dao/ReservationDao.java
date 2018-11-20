package com.sopoong.camp.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sopoong.camp.mapper.PetMapper;
import com.sopoong.camp.mapper.ReservationMapper;
import com.sopoong.camp.vo.Reservation;

@Repository
public class ReservationDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int InsertReservation(Reservation reservation)
	{
		return sqlSession.getMapper(ReservationMapper.class).InsertReservation(reservation);
	}
	public int CheckReservationAble(String petspital , String regdate)
	{
		return sqlSession.getMapper(ReservationMapper.class).CheckReservationAble(petspital,regdate);	
	}
}
