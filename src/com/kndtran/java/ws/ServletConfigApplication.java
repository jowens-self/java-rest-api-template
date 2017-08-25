package com.kndtran.java.ws;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class ServletConfigApplication extends Application {
	private final Set<Class<?>> classes;
	private final Set<Object > singletons;
	
	public ServletConfigApplication() {
		singletons = new HashSet<Object>();
		
		classes = new HashSet<Class<?>>();
		classes.add(FileUpload.class);
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}
	
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
