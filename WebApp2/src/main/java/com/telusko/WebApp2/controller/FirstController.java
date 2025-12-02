package com.telusko.WebApp2.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c1")
public class FirstController 
{
	@GetMapping("/info1")
    public String getInfo(Model model)
    {
		System.out.println("Model is implemented by "+ model.getClass().getName());
		model.addAttribute("names", "Navin Reddy and Hyder Abbas are the course instructors");
    	return "home";//LVN
    }

	@GetMapping("/info2")
    public String getMoreInfo(Model model)
    {
		
		//System.out.println("Model is implemented by "+ model.getClass().getName());
		model.addAttribute("content", "Java + SpringBoot + Microservices");
    	return "telusko";//LVM
    }
	
	@GetMapping("/message")
    public String getMoreInfo2(Map<String, Object> map)
    {
		
		map.put("focus", "Focus is the key to master any skills");
    	return "focus";//LVM
    }
	
	@GetMapping("/alien")
    public void getMoreInfo3(Map<String, Object> map)
    {
		
		System.out.println("Model is implemented by "+ map.getClass().getName());
		map.put("a", "Welcome back aliens! My Name is Navin reddy in this video ......");
    	return ;
    }
}
