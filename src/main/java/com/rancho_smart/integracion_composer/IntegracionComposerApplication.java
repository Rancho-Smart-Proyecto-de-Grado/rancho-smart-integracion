package com.rancho_smart.integracion_composer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class IntegracionComposerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegracionComposerApplication.class, args);
	}

}
