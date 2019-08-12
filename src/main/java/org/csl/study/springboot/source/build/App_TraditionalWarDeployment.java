package org.csl.study.springboot.source.build;

import org.csl.study.springboot.source.App2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.web.WebApplicationInitializer;

/**
 * 此处例子：传统方式部署，需要有个类继承SpringBootServletInitializer
 * 注意：
 * 1、传统方式部署（打包成war部署到外部的Tomcat），那么必须继承SpringBootServletInitializer。
 *    嵌入式部署，则不需要。
 * 2、如果是WebLogic还必须实现WebApplicationInitializer接口，而tomcat容器不需要。
 * 
 * @author Administrator
 * 
 *
 */
public class App_TraditionalWarDeployment extends SpringBootServletInitializer implements WebApplicationInitializer {

	/***
	 * 如果本类是@SpringBootApplication配置类配置类，那么就不需要重写此方法。
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(App2.class);
	}

	

}
