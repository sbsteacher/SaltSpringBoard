package com.salt.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
	@Autowired
	BoardService service;
	
	@RequestMapping("list.do")
	public String list(Model model) {		
		model.addAttribute("list", service.getBoardList());
		return "list";
	}
	
	@RequestMapping("write.do")
	public String write() {
		return "write";
	}
	
	@RequestMapping(value="write.do", method=RequestMethod.POST)
	public String writePost(BoardVO param) {
		int result = param.getI_board();
		System.out.println("before result : " + result);
		int result2 = service.insertBoard(param);
		result = param.getI_board();		
		System.out.println("after result : " + result);
		System.out.println("result2 : " + result2);
		return "write";
	}
	
	@RequestMapping("detail.do")
	public String detail(@RequestParam int i_board, Model model) {
		BoardVO param = new BoardVO();
		param.setI_board(i_board);
		model.addAttribute("detail", service.getBoardDetail(param));
		return "detail";
	}
}
