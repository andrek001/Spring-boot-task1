package com.learning.spring.conditional.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.spring.conditional.model.DevProfile;
import com.learning.spring.conditional.model.ProductionProfile;
import com.learning.spring.conditional.model.SystemProfile;

@Configuration
public class AppConfig2 {

	/*@Value("${netology.profile.dev}")
	private Boolean isDevProfile;

	@Bean
	public SystemProfile profile() {
		if (isDevProfile) {
			return new DevProfile();
		}
		return	new ProductionProfile();
	}
*/
}
