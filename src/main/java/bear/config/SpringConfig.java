package bear.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import bear.test.User;

@Configuration
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

}
