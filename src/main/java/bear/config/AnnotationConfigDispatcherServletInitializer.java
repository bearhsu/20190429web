package bear.config;

import javax.servlet.ServletContext;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import ch.qos.logback.ext.spring.web.LogbackConfigListener;
import ch.qos.logback.ext.spring.web.WebLogbackConfigurer;

public class AnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
	@Override
	protected void registerContextLoaderListener(ServletContext servletContext) {
		servletContext.setInitParameter(WebLogbackConfigurer.CONFIG_LOCATION_PARAM, "/WEB-INF/logback.xml");
		servletContext.addListener(LogbackConfigListener.class);
		super.registerContextLoaderListener(servletContext);
	}

}
