package bear.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class WebProjectConfigInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		// TODO Auto-generated method stub
		initializeSpringConfig(arg0);

	}

	private void initializeSpringConfig(ServletContext container) {
		// Create the 'root' Spring application context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(SpringConfig.class);
		// Manage the life cycle of the root application context
		container.addListener(new ContextLoaderListener(rootContext));
	}


}
