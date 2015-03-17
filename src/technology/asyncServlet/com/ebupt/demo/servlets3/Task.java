package com.ebupt.demo.servlets3;


import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class Task<V> extends FutureTask<V> {

	public Task() {
		super(new Callable() {
		 
			public V call() throws Exception {
				return null;
			}
		});
	}

	public void set(V v) {
		super.set(v);
	}
}
	
	