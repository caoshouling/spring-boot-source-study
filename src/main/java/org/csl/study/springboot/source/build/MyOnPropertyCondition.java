package org.csl.study.springboot.source.build;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;

public class MyOnPropertyCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		ClassLoader classLoader =  context.getClassLoader();
		if (classLoader == null) {
			classLoader = ClassUtils.getDefaultClassLoader();
		}
		try {
			forName("org.csl.study.springboot.source.condition.MyConditionBean", classLoader);
			return true;
		}
		catch (Throwable ex) {
			return false;
		}
		
	}
	
	private static Class<?> forName(String className, ClassLoader classLoader)
			throws ClassNotFoundException {
		if (classLoader != null) {
			return classLoader.loadClass(className);
		}
		return Class.forName(className);
	}

}
