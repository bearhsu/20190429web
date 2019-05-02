package bear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

	@RequestMapping("/test")
	@ResponseBody
	public void test() {
		System.out.println("test in ");
	}
	
}
