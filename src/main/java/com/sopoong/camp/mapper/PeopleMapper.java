package com.sopoong.camp.mapper;

import com.sopoong.camp.vo.People;
import java.util.List;

public interface PeopleMapper {

	
	List<People> ShowPeople();
	
	int UpdatePeople(int camera, int count);
	
	People ShowCount(int camera);
}
