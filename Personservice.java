package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.Persondao;
import com.example.demo.model.Person;


@Service
public class Personservice {
   
	@Autowired
	Persondao per;
	
	public  List<Person> getAllPersons(){
		return per.getAllpersons();
	}
}