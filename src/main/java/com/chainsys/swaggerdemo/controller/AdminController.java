package com.chainsys.swaggerdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.swaggerdemo.user.model.User;

@RestController
public class AdminController {
	private static List<User> users = new ArrayList<User>();

	@GetMapping("/updateuser")
	public String userList() {
		return "userList";
	}

	@GetMapping("/deleteuser")
	public String deleteUser() {
		return "to delete user";
	}

	@GetMapping("/listusers")
	public List<User> listOfUsers() {
		System.out.println("listing users" + users);
		return users;

	}
	// when somebody else checks code, we need to say/document what args // has
	/*
	 * 
	 * to be passed- manual documentation- manual update needed // Swagger -
	 * Automatic autogenerate documentation
	 */

	@PostMapping
	public User addUser(@RequestBody User user) {
		users.add(user);
		System.out.println("User added");
		return user;
	}
}
