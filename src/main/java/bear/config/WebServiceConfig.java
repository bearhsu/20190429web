package bear.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"bear.ws"})
public class WebServiceConfig implements WebMvcConfigurer{
	
//	@Autowired
//	private LoggerInterceptor loggerInterceptor;
//	
//	
//	@Override
//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		configurer.enable();
//		
//	}
		
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(loggerInterceptor).addPathPatterns("/**");
//	}

	

}
