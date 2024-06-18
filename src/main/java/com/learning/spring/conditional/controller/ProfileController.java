package com.learning.spring.conditional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.spring.conditional.model.SystemProfile;

@RestController
@RequestMapping("/")
public class ProfileController {


	private final SystemProfile profile;


	public ProfileController(final SystemProfile profile) {
		this.profile = profile;
	}

	@GetMapping("profile")
	public String getProfile() {
		return profile.getProfile();
	}
}