package com.ebupt.demo.servlets3;
import java.util.ArrayList;
import java.util.HashMap;


public class STATICS {

	/**
	 * 锁住当前的servlet线程�?
	 */
	public static HashMap<String,Thread> threadMap = new HashMap<String,Thread>();
	
	/**
	 * 锁住当前的servlet线程�?
	 */
	public static HashMap<String,Object> threadMapReturnObject = new HashMap<String,Object>();
	
	/**
	 * 通过FutureTask的方式来�?
	 */
	public static HashMap<String, Task> FutureTaskMap = new HashMap<String, Task>();

	
	
}
