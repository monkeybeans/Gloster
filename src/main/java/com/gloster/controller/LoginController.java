package com.gloster.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import com.gloster.data.Login;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	

	
	@RequestMapping(value = "/login/apa", method = RequestMethod.GET)
	public @ResponseBody Login login(){
		logger.info("Returning Login...");
		return new Login(2, "apan");
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model){
		
		return "login";
	}
	
	@RequestMapping(value = "/start", method = RequestMethod.POST)
	public String start(ModelMap model,
			@RequestParam(value="username", required=true) String username,
			@RequestParam(value="password", required=true) String password
			){
		
		model.addAttribute("username", username);
		
		return "start";
	}

}
