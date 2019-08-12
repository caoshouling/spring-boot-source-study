package org.csl.study.springboot.source.java8;

public class Test {

	public static void main(String[] args) {
		 Test test = new Test();
		 test.test(test);
	}
   public  void test(Test test){
	  
		System.out.println("开始");
		//MyInterface interface2 = getSelfInitializer3();
		sayHello(getSelfInitializer3());
		System.out.println("结束");
		
	}
   private void sayHello(MyInterface my){
   	System.out.println("sayHello");
   	my.onSetup();
   } 
   private void selfInitialize3(){
    	System.out.println("Test");
    }
    
    private MyInterface getSelfInitializer3(){
    	return this::selfInitialize3;
    }
    
   
}   
