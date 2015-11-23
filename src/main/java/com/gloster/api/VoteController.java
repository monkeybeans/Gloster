package com.gloster.api;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VoteController {

	@RequestMapping(value = "/api/vote/", method = RequestMethod.GET)
	@ResponseBody
	public String vote(ModelMap model) {
		
		return "error";
	}
}
