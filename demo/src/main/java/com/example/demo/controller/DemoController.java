package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DemoController { //기본페이지 요청 메서드
	
	@GetMapping("/")//이 기본적인 주소가 요청이 오면 이 메서드가 호출이 된다.
	public String demo(Model model) {
		log.info("home");
		//model.addAttribute("arg","인자");
		return "home";//templates 폴더의 home.html이라는 파일을 호출한다.
	}
}
