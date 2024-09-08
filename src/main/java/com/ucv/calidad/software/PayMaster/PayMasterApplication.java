package com.ucv.calidad.software.PayMaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ucv.calidad.software.PayMaster"})
public class PayMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayMasterApplication.class, args);
	}

}
