package org.csl.study.springboot.source.dao;

import org.springframework.stereotype.Repository;

@Repository
public class IndexDao    {

	/**
	 * 
	 */
	public IndexDao() {
		super();
	}
	
	public String getParam() {
		System.out.println(" --IndexDao 执行getParam方法-- >");
		return "hello";
	}

	public  void setParam(String str) {
		// TODO Auto-generated method stub
		System.out.println(" --IndexDao 传送值 = "+str);
	}
	
}
