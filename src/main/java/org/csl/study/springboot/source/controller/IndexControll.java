package org.csl.study.springboot.source.controller;

import org.csl.study.springboot.source.build.MyConfiguration;
import org.csl.study.springboot.source.build.Server;
import org.csl.study.springboot.source.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControll {
    @Autowired
    @Qualifier("indexService")
	private IndexService indexService;
    
    @Autowired
    ApplicationContext applicationContext;
    
	@RequestMapping("/hello")
	public String index(Model model) {
		 model.addAttribute("message", "Hello Spring MVC 5333!");
		 System.out.println("--hello2---");
		 
		 Server server = applicationContext.getBean(Server.class);
		 
		 System.out.println("--server---" +server);
		 
		 MyConfiguration MyConfiguration = applicationContext.getBean( MyConfiguration.class);
		 System.out.println("--MyConfiguration.getSerPort()---" +MyConfiguration.getSerPort());
		return "hello.html";
	}
	
	
}
