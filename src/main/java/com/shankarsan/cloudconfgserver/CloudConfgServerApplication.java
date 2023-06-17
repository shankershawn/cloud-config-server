package com.shankarsan.cloudconfgserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfgServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfgServerApplication.class, args);
	}

}
