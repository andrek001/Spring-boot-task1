package com.learning.spring.conditional.model;

public class ProductionProfile implements SystemProfile {

	@Override
	public String getProfile() {
		return "Current profile is production";
	}
}