package com.raviweb.config;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 * Spring configuration and Spring MVC bootstrapping.
 */
//public class ApplicationInitializer extends WebMvcConfigurerAdapter implements WebApplicationInitializer {
//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.register(ApplicationConfig.class);
//        context.setServletContext(servletContext);
//        // Spring MVC front controller
//        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
//        servlet.addMapping("/");
//        servlet.setLoadOnStartup(1);
//    }
//    
//    @Override
//    protected Filter[] getServletFilters() {
//    	Filter [] singleton = { new CORSFilter() };
//    	return singleton;
//	}
//}

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { ApplicationConfig.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
    
    @Override
    protected Filter[] getServletFilters() {
    	Filter [] singleton = { new CORSFilter() };
    	return singleton;
	}
 
}