package com.qk.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.qk.Repository.DemoRepository;
import com.qk.model.Application;

@Controller
public class Controller1 {
	
	@Autowired
	private DemoRepository Repository;
//	@Autowired
//	private AppService service;

//   @RequestMapping("/test")
//    public String home(Map<String, Object> model) {
//        model.put("message", "HowToDoInJava Reader !!");
//        return "test";
//    }
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	@ResponseBody
	public String index(Model model) {
	ModelAndView m= new ModelAndView();
		model.addAttribute("test", "bhjkhgkjsghsldg");
		//Application app=new Application();
		//app.setCode("123");
		//model.addAttribute("application",app);
		m.setViewName("redirect:/jsp/index.jsp");
		return "index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	@ResponseBody
	public String add(@RequestParam String name,@RequestParam String code,@RequestParam String desg) {
		
		System.out.println("add @@@@@@@@@@@@");
		
		ModelAndView m = new ModelAndView(); ;
		
		Application app= new Application();
			app.setName(name);
			app.setCode(code);
			app.setDesg(desg); 
			Repository.saveAndFlush(app); 
		
			m.setViewName("redirect:/jsp/list.jsp");
		return "Added successfully";
	}
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list() {
		
		ModelAndView m = new ModelAndView();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Iterable<Application> obj1 = Repository.findAll();
	 
		m.addObject("objects1", obj1);

		System.out.println("List is :"+obj1);
		System.out.println("Model is :"+m);
		//model.addAttribute("obj", obj) ;
		m.setViewName("redirect:/jsp/list.jsp");
		m.isEmpty();
		return "sca";
	}
	
//	 @RequestMapping(value = "/list", method = RequestMethod.GET)
//	public ModelAndView handle1(Model model) {
//		ModelAndView m = new ModelAndView();
//		List<Application> obj = Repository.findAll();
//		m.addObject("objects1", obj);
//		 System.out.println("list"+obj);
	
//		// you can add any Collection Objects to ModelMap
//		// including JSON, String, Array, Map, List, etc...
//		m.setViewName("redirect:/jsp/list.jsp");
//		return m;
//	}
}
