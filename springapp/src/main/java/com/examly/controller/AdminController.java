package com.examly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.dao.IUser;
import com.examly.model.User;
import com.examly.dao.IMovie;
import com.examly.model.Movie;

@RestController
public class AdminController {
	@Autowired
	IUser user;
	IMovie movie;
	@GetMapping("admin")
	public String findAll() {
		user.findAll(); 
		return "Array of Movie";
	}
	@DeleteMapping("admin/delete/{id}")
	public String delete(@PathVariable("id")int id) {
		user.deleteById(id);
		return "User deleted";
	}
	
	@PutMapping("admin/userEdit/{id}")
	public String update(@RequestBody User u,@PathVariable("id")int id) {
		user.findById(id).map(us->{
			us.setEmail(u.getEmail());
			us.setPassword(u.getPassword());
			us.setUsername(u.getUsername());
			us.setActive(u.isActive());
			us.setRole(u.getRole());
			us.setMobileNumber(u.getMobileNumber());
			return user.save(us);
		});
		
		return "Save the Changes";
	}
	@PostMapping("admin/addUser")
	public String add(@RequestBody User u) {
		user.saveAndFlush(u);
		return "User added";
	}

}