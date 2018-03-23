package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class PageController {
	
	@RequestMapping("/")
    public String index()
    {
        return "home";
    }
	@RequestMapping("/home")
    public String home()
    {
        return "home";
    }
}
