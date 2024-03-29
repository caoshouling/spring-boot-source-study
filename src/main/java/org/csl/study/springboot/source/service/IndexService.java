package org.csl.study.springboot.source.service;

import javax.annotation.PostConstruct;

import org.csl.study.springboot.source.dao.IndexDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class IndexService  implements InitializingBean, ApplicationContextAware{
	
	private String name = "123";
	
	
	private ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(this.getClass().getSimpleName()+" - 实现了ApplicationContextAware接口，对属性ApplicationContext赋值-->");
		this.applicationContext = applicationContext;
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Autowired
	private IndexDao indexDao;
	
	/**
	 * @param indexDao the indexDao to set
	 */
	public void setIndexDao(IndexDao indexDao) {
		System.out.println(" --IndexService -- 依赖注入属性indexDao ");
		this.indexDao = indexDao;
	}

	public IndexService() {
		super();
		System.out.println(" --IndexService -- 构造器 ");
	}

	public String getParam() {
		return indexDao.getParam();
	}
	/**
	 * 
	 */
	
	@PostConstruct
	public void init() {
		System.out.println(" --IndexService -- @PostConstruct - init() ");
	}
	
	public void initMethod() {
		System.out.println(" --IndexService -- init-method(XML定义) - initMethod() ");
	}
    public void afterPropertiesSet() throws Exception {
		
		System.out.println(" --IndexService -- InitializingBeanBean的afterPropertiesSet()方法 ");
	}
	public void setName(String name) {
		
		this.name = name;
	}
}
