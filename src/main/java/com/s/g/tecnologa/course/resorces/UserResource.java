package com.s.g.tecnologa.course.resorces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.s.g.tecnologa.course.entities.User;

@RestController
@RequestMapping(value = "/uses")
public class UserResource {
	
	@GetMapping
	//end point
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
