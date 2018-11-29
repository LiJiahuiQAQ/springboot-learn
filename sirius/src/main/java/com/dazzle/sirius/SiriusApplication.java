package com.dazzle.sirius;
;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SiriusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiriusApplication.class, args);
	}


}
