package com.myspring.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "home";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index() {
		
		return "home";
	}
	
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm() {
		
		return "joinForm";
	}
	
	/*
	@RequestMapping(value = "/joinPro", method = RequestMethod.POST)
	public String joinPro(HttpServletRequest request) {
		
		Member member = new Member();
		member.setId(request.getParameter("id"));
		member.setPw(request.getParameter("pw"));
		member.setName(request.getParameter("name"));
		
		String[] arr = request.getParameterValues("hobby");
		String hobby = "";
		for(int i=0; i<arr.length; i++) {
			hobby += arr[i];
			if(i < arr.length - 1) {
				hobby += ",";
			}
		}
		member.setHobby(hobby);
		
		request.setAttribute("member", member);
		
		System.out.println(member);
		
		return "joinPro";
	}
	*/
	
	@RequestMapping(value = "/joinPro", method = {RequestMethod.GET, RequestMethod.POST})
	public String joinPro(Member member, Model model) {
		
		System.out.println(member);
		
		model.addAttribute("member", member);
		
		return "joinPro";
	}

	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		
		return "loginForm";
	}
	
	@RequestMapping(value = "/loginPro", method = {RequestMethod.GET, RequestMethod.POST})
	public String loginPro(HttpServletRequest request, HttpSession session) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		
		session.setAttribute("log", id);
		
		return "loginPro";
	}
	
	@RequestMapping(value = "/logOut", method = {RequestMethod.GET, RequestMethod.POST})
	public String logOut(HttpSession session) {
		
		session.removeAttribute("log");
		
		
		return "logOut";
	}
	
}















