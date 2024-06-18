package com.learning.spring.conditional;

import com.learning.spring.conditional.config.AppConfig;
import com.learning.spring.conditional.model.SystemProfile;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class Application {

	public static void main(final String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		System.setProperty("netology.profile.dev", "true");
		app.setBannerMode(Banner.Mode.OFF);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		SystemProfile profile = context.getBean(SystemProfile.class);
		System.out.println(profile.getProfile());
		app.run(args);
	}
}
