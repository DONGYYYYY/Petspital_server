package com.sopoong.camp.mapper;

import java.util.List;

import com.sopoong.camp.vo.Reservation;

public interface ReservationMapper {
	
	int InsertReservation(Reservation reservation);
	
	int CheckReservationAble(String petspital , String regdate);
	
	int CheckAlreadyReservation(Reservation reservtion);
	
	int DeleteReservation(Reservation reservation);
	
	List<Reservation> GetReservationList(String userid);
}
