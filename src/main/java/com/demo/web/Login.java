package com.demo.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class Login {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");

        return "/login";
    }
	
	@RequestMapping("/welcome")
	public String welcomePage(HttpServletRequest request) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = "";
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			currentPrincipalName = authentication.getName();
		}
		System.out.println("Current username: "+currentPrincipalName+"--"+ConfigPropertiesDemo.getLocation()+"<==");
		request.setAttribute("username", currentPrincipalName);
		return "/welcome";
	}
	
	@RequestMapping("/")
	public String welcome(HttpServletRequest request) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = "";
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			currentPrincipalName = authentication.getName();
		}
		System.out.println("Current username: "+currentPrincipalName+"--"+ConfigPropertiesDemo.getLocation()+"<==");
		request.setAttribute("username", currentPrincipalName);
		
		return "/welcome";
	}
	
	@RequestMapping("/403")
	public String permissionDeny() {
		return "/permissionDeny";
	}
}
