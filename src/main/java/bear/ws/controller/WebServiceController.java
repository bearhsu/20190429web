package bear.ws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bear.model.User;

@RestController
@RequestMapping(value="/ws",method=RequestMethod.POST
	,consumes="application/json",produces="application/json;charset=UTF-8")
public class WebServiceController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/user")
	public User getUserInfo(@RequestBody User user) throws Exception {
		logger.info("====== WebService getUser in =====");
		logger.error("====== WebService getUser in =====");
		logger.debug("====== WebService getUser in =====");
		logger.warn("====== WebService getUser in =====");
		user.setId("root");

		return user;
	}
	

}
