package com.springbasicapp;

import com.springbasicapp.config.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInitializer implements WebApplicationInitializer {


  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    context.register(WebConfig.class);

    servletContext.addListener(new ContextLoaderListener(context));
    ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
    dispatcher.setLoadOnStartup(1);
    dispatcher.addMapping("/");
  }
}
