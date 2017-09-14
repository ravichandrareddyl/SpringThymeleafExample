package com.raviweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.raviweb.model.User;

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("recipient", "World");
        return "index";
    }
    
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public @ResponseBody User getUser() {
    	User user = new User();
    	user.setName("Ravi");
    	user.setRollNo("1221");
    	
    	return user;
    }
}
