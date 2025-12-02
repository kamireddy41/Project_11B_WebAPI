package com.telusko.WebApp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c2")
public class SecondController 
{
	@GetMapping("/info1")
	public String getSomeMessage(Model model)
	{
		model.addAttribute("focus", "Without Focus you annot master anything");
		return "focus";
	}

}
