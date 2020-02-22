package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.Personservice;

@RestController

public class WecomeController {
	@Autowired
	Personservice person;
	@RequestMapping("/listUsers")
	String getUsers(Model model) {
		List<Person> list = person.getAllPersons();
		model.addAttribute("list", list);
		
		return "listusers";
	}

}
