package bear.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class IndexController {

	@RequestMapping("/test")
	public void test() {
		System.out.println("test in ");
	}
	
}
