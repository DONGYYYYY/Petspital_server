package com.sopoong.camp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sopoong.camp.dao.PeopleDao;
import com.sopoong.camp.vo.People;


@RestController
@RequestMapping("/People")
public class PeopleController {
	
	@Autowired
	PeopleDao peopleDao;
	
	@RequestMapping(value = "/ShowAll",method=RequestMethod.GET, produces="application/json;charset=UTF-8")
	public List<People> ShowPeople(){
		return peopleDao.ShowPeople();
	}

	
	@RequestMapping(value = "/Update",method=RequestMethod.GET, produces="application/json;charset=UTF-8")
	public int UpdatePeople(@RequestParam int camera, int count){
		return peopleDao.UpdatePeople(camera,count);
	}
	
	@RequestMapping(value = "/ShowCount",method=RequestMethod.GET, produces="application/json;charset=UTF-8")
	public People UpdatePeople(@RequestParam int camera){
		return peopleDao.ShowCount(camera);
	}

}
