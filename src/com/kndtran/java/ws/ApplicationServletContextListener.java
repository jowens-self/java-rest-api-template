package com.kndtran.java.ws;

import java.util.concurrent.Semaphore;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Initialise global variables before starting server.
 * 
 */

public class ApplicationServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		/*
		 * Clean up before server shuts down.
		 */
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		/*
		 * Initialise variables or load data here, before server starts.
		 */
	}
}
