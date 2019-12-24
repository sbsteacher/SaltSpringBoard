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
	public String list(Model model, @RequestParam(defaultValue="1") int page) {
		SelectVO param = new SelectVO();
		param.setPage(page);
		model.addAttribute("list", service.getBoardList(param));
		return "list";
	}
	
	@RequestMapping("write.do")
	public String write(@RequestParam(defaultValue="0") int i_board, Model model) {
		if(i_board != 0) {
			BoardVO param = new BoardVO();
			param.setI_board(i_board);
			model.addAttribute("detail", service.getBoardDetail(param));
		}
		return "write";
	}
	
	@RequestMapping(value="write.do", method=RequestMethod.POST)
	public String writePost(BoardVO param) {
		if(param.getI_board() == 0) {
			int result = param.getI_board();
			System.out.println("before result : " + result);
			int result2 = service.insertBoard(param);
			result = param.getI_board();		
			System.out.println("after result : " + result);
			System.out.println("result2 : " + result2);
			
			return "redirect: list.do";
		}else {
			service.modBoard(param);
			return "redirect: detail.do?i_board="+param.getI_board();
		}
		
	}
	
	@RequestMapping("detail.do")
	public String detail(@RequestParam int i_board, Model model) {
		BoardVO param = new BoardVO();
		param.setI_board(i_board);
		model.addAttribute("detail", service.getBoardDetail(param));
		return "detail";
	}
	
	@RequestMapping("delBoard.do")
	public String delBoard(@RequestParam int i_board) {
		service.delBoard(i_board);
		return "redirect:list.do";
	}
}
