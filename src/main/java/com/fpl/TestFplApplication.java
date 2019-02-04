package com.fpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fpl.dao.UserRepository;
import com.fpl.entities.User;

@SpringBootApplication
public class TestFplApplication implements CommandLineRunner {
	
	@Autowired
  private UserRepository userRepository;
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };}
 
	public static void main(String[] args) {
		SpringApplication.run(TestFplApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		//userRepository.save(new User("Hassan", "Ben amara","1234"));
		//userRepository.save(new User("Rokaya", "bechri","123"));
		

	}
		
	}



