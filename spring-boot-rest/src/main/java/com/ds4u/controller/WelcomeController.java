package com.ds4u.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ds4u.api.CallingRestApi;
import com.ds4u.beans.Welcome;
import com.ds4u.constant.View;

@Controller
public class WelcomeController {

	private static final String welcomemsg = "Welcome Mr. !";
	
	/**
	 * controller for get methodName and call to api method in CallingRestApi class 
	 * @param model
	 * @param methodName
	 * @return
	 */
    @GetMapping("/welcome/user")
    public String welcomeUser(ModelMap model, String methodName) {
    	Object object= CallingRestApi.callSSLRestAPI("http://10.0.1.47:5008/", methodName);
    	model.put("object", object);
        return View.INDEX;
    }
    
}
