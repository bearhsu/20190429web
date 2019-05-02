package bear.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import bear.model.User;

@Configuration
@ComponentScan(basePackages={"bear"})
public class SpringConfig {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringConfig.class);
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext();
		context2.register(SpringConfig.class);
		
		String[] beans = context.getBeanDefinitionNames();
		
		for(String bean : beans) {
			System.out.println(bean.toString());
		}
		User user = (User) context.getBean("user");
		User user2 = (User) context2.getBean("user");
		System.out.println(user);
		System.out.println(user2);
		System.out.println(user.equals(user2));

	}
	
	@Bean
	public User initUser() {
		User user = new User();
		System.out.println(user.getName());
		return user;
	}

}
