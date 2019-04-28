package bear.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class IndexController {

	@RequestMapping("test")
	public void test() {
		System.out.println("test in ");
	}
	
}
