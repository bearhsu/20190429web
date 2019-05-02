package bear.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("/test")
	public String test() {
		System.out.println("test in ");
		return "test";
	}
	
}
