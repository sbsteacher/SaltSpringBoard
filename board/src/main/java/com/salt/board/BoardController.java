package com.salt.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ggg")
public class BoardController {
	
	@Autowired
	BoardService service;
	
	@RequestMapping("ddd.do")
	public String index() {
		
		System.out.println(service.ddd());	
		
		
		
		return "ddd";
	}
	
}
