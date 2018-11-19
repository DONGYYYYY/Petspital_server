package com.sopoong.camp.mapper;

import java.util.List;

import com.sopoong.camp.vo.Pet;

public interface PetMapper {
	
	int AddPet(Pet pet);
	
	List<Pet> GetPetList(String UserId);
	
	int DeletePet(Pet pet);
	
	int UpdatePet(Pet pet);

}
