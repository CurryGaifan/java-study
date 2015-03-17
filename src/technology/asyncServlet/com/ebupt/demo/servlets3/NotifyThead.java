package com.ebupt.demo.servlets3;

public class NotifyThead extends Thread {
	private Thread t = null;
public void NotifyThead(Thread t){
	this.t = t;
}
public void run(){
	
	synchronized(t){
		t.notify();
	}
}
}
