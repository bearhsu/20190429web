package bear.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import bear.model.User;

@RestController
public class IndexController {

	@RequestMapping(value="/test",method={RequestMethod.GET})
	public String test() {
		System.out.println("test in ");
		return "test";
	}
	
	@RequestMapping(value="/test",method=RequestMethod.POST, consumes = "application/json", produces="application/json;charset=UTF-8")
	public User posttest(HttpServletResponse response) {
		System.out.println("post test in ");
		User user = new User();
		user.setName("bear");
		Gson gson = new Gson();
//		try{
//			response.setContentType("application/json");
//			response.setCharacterEncoding("UTF-8");
//			Writer writer = response.getWriter();
//			writer.write(gson.toJson(user));				
//			writer.flush();
//		} catch (UnsupportedEncodingException e){	
//			e.printStackTrace();
//		} catch (IOException e) {	
//			e.printStackTrace();
//		}
		return user;
	}
	
}
