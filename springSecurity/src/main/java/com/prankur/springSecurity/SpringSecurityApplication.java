package com.prankur.springSecurity;

import com.prankur.springSecurity.services.AppUserDetailsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringSecurityApplication.class, args);
        AppUserDetailsService appUserDetailsService = applicationContext.getBean(AppUserDetailsService.class);
        appUserDetailsService.initialiseDatabase();
	}

}