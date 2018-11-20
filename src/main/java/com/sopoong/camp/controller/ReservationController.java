package com.sopoong.camp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sopoong.camp.dao.ReservationDao;
import com.sopoong.camp.vo.Reservation;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	 @Autowired
	   ReservationDao reservationDao;
	   
	 @RequestMapping(value = "/insertReservation",method=RequestMethod.POST, produces="application/json;charset=UTF-8")
	 public int InsertReservation(@RequestBody Reservation reservation)
	 {
		 return reservationDao.InsertReservation(reservation);
	 }
	 
	 @RequestMapping(value = "/checkReservationAble",method=RequestMethod.GET, produces="application/json;charset=UTF-8")
	 public int CheckReservationAble(@RequestParam String petspital , String regdate)
	 {
		 return reservationDao.CheckReservationAble(petspital,regdate);
	 }
	 
	 @RequestMapping(value = "/checkAlreadyReservation",method=RequestMethod.POST, produces="application/json;charset=UTF-8")
	 public int CheckAlreadyReservation(@RequestBody Reservation reservation)
	 {
		 return reservationDao.CheckAlreadyReservation(reservation);
	 }
	 
	 @RequestMapping(value = "/deleteReservation" ,method=RequestMethod.POST, produces="application/json;charset=UTF-8")
	 public int DeleteReservation(Reservation reservation)
	 {
		 return reservationDao.DeleteReservation(reservation);
	 }
	 
	 @RequestMapping(value = "/getReservationList",method=RequestMethod.GET, produces="application/json;charset=UTF-8")
	 public List<Reservation> GetReservationList(String userid)
	 {
		 return reservationDao.GetReservationList(userid);
	 }
}
