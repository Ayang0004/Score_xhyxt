package com.xhyxt.tools;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

public void contextInitialized(ServletContextEvent sce) {
		
		String path=sce.getServletContext().getContextPath();
		sce.getServletContext().setAttribute("app", path);
	}

	public void contextDestroyed(ServletContextEvent sce) {
		sce.getServletContext().removeAttribute("app");
	}

}
