package com.capg.ipl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.capg.*")
@ComponentScan("com.capg.*")
@EntityScan("com.capg.*")
@SpringBootApplication
public class IplFantasyLeagueApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplFantasyLeagueApplication.class, args);
	}

}
