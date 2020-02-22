package com.example.demo.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository
public class Persondao {
	
	   List<Person> list = null;
	   public List<Person> getAllpersons(){
		   list = new ArrayList<Person>();
		   list.add(new Person(11, "Anil", 33));
		   list.add(new Person(12, "Banu", 31));
		   list.add(new Person(13, "Murali", 23));
		   
		   return list;
	   }
	

}
