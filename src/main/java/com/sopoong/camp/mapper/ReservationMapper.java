package com.sopoong.camp.mapper;

import com.sopoong.camp.vo.Reservation;

public interface ReservationMapper {
	
	int InsertReservation(Reservation reservation);
	
	int CheckReservationAble(String petspital , String regdate);
}
