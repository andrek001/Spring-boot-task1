package com.learning.spring.conditional.model;

public class DevProfile implements SystemProfile {

	@Override
	public String getProfile() {
		return "Current profile is dev";
	}
}