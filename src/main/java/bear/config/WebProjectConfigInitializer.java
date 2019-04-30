package bear.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebProjectConfigInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		// TODO Auto-generated method stub
//		initializeSpringConfig(arg0);
//
//		initializeDispatcher(arg0);
	}

	private void initializeSpringConfig(ServletContext container) {
		// Create the 'root' Spring application context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(SpringConfig.class);
		// Manage the life cycle of the root application context
		container.addListener(new ContextLoaderListener(rootContext));
	}
	
	private void initializeDispatcher(ServletContext container) {
		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(SpringConfig.class);
		webContext.setServletContext(container);
		ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet(webContext));
		registration.addMapping("/");
		registration.setLoadOnStartup(1);
	}


}
