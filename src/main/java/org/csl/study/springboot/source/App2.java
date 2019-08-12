package org.csl.study.springboot.source;

import org.csl.study.springboot.source.build.MyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages={"org.csl.study.springboot.source.controller",
		"org.csl.study.springboot.source.service",
		"org.csl.study.springboot.source.dao"})
@Import(MyConfiguration.class)
public class App2 {

	public static void main(String[] args) {
		
		SpringApplication.run(App2.class, args);
	}

}
