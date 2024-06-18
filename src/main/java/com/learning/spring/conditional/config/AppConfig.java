package com.learning.spring.conditional.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.spring.conditional.model.DevProfile;
import com.learning.spring.conditional.model.ProductionProfile;
import com.learning.spring.conditional.model.SystemProfile;

@Configuration
public class AppConfig {

	@Bean
	@ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "true")
	public SystemProfile devProfile() {
		return new DevProfile();
	}

	@Bean
	@ConditionalOnProperty(prefix = "", name = "netology.profile.dev", havingValue = "false")
	public SystemProfile prodProfile() {
		return new ProductionProfile();
	}
}
