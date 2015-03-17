package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//		Class<Student> clazz = (Class<Student>) Class.forName("com.reflect.Student");
//		Class<Student> clazz = Student.class;
		Class<Student> clazz = (Class<Student>) new Student().getClass();
		
		Student s = new Student();
		Field f = clazz.getDeclaredField("num");
		f.setInt(s, 20);
		Method m = clazz.getDeclaredMethod("getScore");
		System.out.println(m.invoke(s));
//		clazz.i
		
		System.out.println(s.num);
	}
}
