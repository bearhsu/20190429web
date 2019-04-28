package bear.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import bear.test.User;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= "bear")
public class SpringConfig {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("bear");
		
		String[] beans = context.getBeanDefinitionNames();
		
		for(String bean : beans) {
			System.out.println(bean.toString());
		}
		User user = (User) context.getBean("user");
		System.out.println(user.getName());

	}
	
	@Bean
	public User initUser() {
		User user = new User();
		System.out.println(user.getName());
		return user;
	}

}
