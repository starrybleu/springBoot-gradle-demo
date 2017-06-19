package com.bean.controller;

import com.bean.vo.Board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/board")
public class BoardController {

	@RequestMapping("/hello")
	public String hello(Model model) {
		System.out.println("hello() 실행은 됨");
		model.addAttribute("message", "Hello, World!!!");
		return "hello";
	}
	
	@RequestMapping("/board/inputForm")
	public String inputForm() {
		return "/board/inputForm";
	}
	
	@RequestMapping("/board/inputPro")
	public ModelAndView inputPro(Board bVO, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("/board/inputPro");
		mv.addObject("bVO", bVO);

		return mv;
	}
}
