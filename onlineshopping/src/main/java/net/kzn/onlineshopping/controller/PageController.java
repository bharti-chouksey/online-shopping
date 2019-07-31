package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Greeting", "Welcome to Spring MVC");
		return mv;
		
	}
	/*@RequestMapping(value = "/test")
	public ModelAndView test( @RequestParam(value="Greeting",required= false)String Greeting)
	{
		if(Greeting == null)
		{
			Greeting ="Hello World";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Greeting", Greeting);
		return mv;
	}
	@RequestMapping(value = "/test/{Greeting}")
	public ModelAndView test( @PathVariable("Greeting")String Greeting)
	{
		if(Greeting == null)
		{
			Greeting ="Hello World";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Greeting", Greeting);
		return mv;
	}*/
	

}