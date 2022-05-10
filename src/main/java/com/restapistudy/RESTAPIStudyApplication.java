package com.restapistudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.restapistudy.repositories")
@EntityScan("com.restapistudy.entities")
@SpringBootApplication
public class RESTAPIStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(RESTAPIStudyApplication.class, args);
    }
}
