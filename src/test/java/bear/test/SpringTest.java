package bear.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@Configuration
//@ComponentScan(basePackages= {"bear.test"})
public class SpringTest {

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
