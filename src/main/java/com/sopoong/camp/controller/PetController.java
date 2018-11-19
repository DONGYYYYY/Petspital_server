package com.sopoong.camp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sopoong.camp.dao.PetDao;
import com.sopoong.camp.vo.Pet;


@RestController
@RequestMapping("/Pet")
public class PetController {
   
   @Autowired
   PetDao petDao;
   
   @RequestMapping(value = "/AddPet",method=RequestMethod.POST, produces="application/json;charset=UTF-8")
   public int AddPet(@RequestBody Pet pet){
      
      return petDao.AddPet(pet);
   }

   
   @RequestMapping(value = "/GetPetList",method=RequestMethod.GET, produces="application/json;charset=UTF-8")
   public List<Pet> GetPetList(@RequestParam String userid){
      return petDao.GetPetList(userid);
   }

   
   @RequestMapping(value = "/UpdatePet",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
   public int UpdatePet(@RequestBody Pet pet) {
      return petDao.UpdatePet(pet);
   }
   
   @RequestMapping(value = "/DeletePet",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
   public int DeletePet(@RequestBody Pet pet) {
	   return petDao.DeletePet(pet);
   }
}