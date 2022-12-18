package org.nlt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
public class TestController 
{
	//DispatcherServlet
	//CommonsMultipartResolver
	public TestController() {
		System.out.println("Test Controller Object Created");
	}
}
