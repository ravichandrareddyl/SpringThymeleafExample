package com.raviweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.raviweb.model.User;

@Controller
public class IndexController {

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String index(Model model) {
//        model.addAttribute("recipient", "World");
//        return "index";
//    }
    
    
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home1() {
        return "/home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "/home";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin() {
        return "/admin";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user() {
        return "/user";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about() {
        return "/about";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "/login";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String error403() {
        return "/error/403";
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public @ResponseBody User getUser() {
    	User user = new User();
    	user.setName("Ravi");
    	user.setRollNo("1221");
    	
    	return user;
    }
}
