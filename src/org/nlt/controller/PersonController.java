package org.nlt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class PersonController {
	//InternalResourceViewResolver
	public PersonController() {
		System.out.println("Person Controller Object Created");
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView home()
	{
		System.out.println("Home Page");
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/submitPerson",method=RequestMethod.POST)
	public ModelAndView submitPersonData(HttpServletRequest req,HttpServletResponse res)
	{
		System.out.println("Person Submit");
		return new ModelAndView("index");
	}
}
