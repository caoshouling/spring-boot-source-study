package org.csl.study.springboot.source.build;

import org.csl.study.springboot.source.condition.MyConditionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class MyConfiguration {
	@Autowired
	Environment environment;
	
    @Bean
    @Conditional(MyOnPropertyCondition.class)
	public MyConditionBean createMyConditionBean(){
		
		return new MyConditionBean();
	}
    
    public int getSerPort(){
    	return  environment.getProperty("server.port", Integer.class);
    }
    @Bean("server")
    public Server getServer(){
    	int serverPort = getSerPort();
    	Server server = new Server();
    	server.setServerPort(serverPort);
    	return server;
    }
}
