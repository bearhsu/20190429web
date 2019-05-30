package bear.ws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import bear.config.RootConfig;
import bear.core.model.User;

@RestController
@RequestMapping(value="/ws",method=RequestMethod.POST
	,consumes="application/json",produces="application/json;charset=UTF-8")
public class WebServiceController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private ApplicationContext applicationContext;	
	
	@RequestMapping(value="/user")
	public User getUserInfo(@RequestBody User user) throws Exception {
		log.info("====== WebService getUser in =====");
		log.error("====== WebService getUser in =====");
		log.debug("====== WebService getUser in =====");
		log.warn("====== WebService getUser in =====");
		user.setId("root");

		return user;
	}
	

}
