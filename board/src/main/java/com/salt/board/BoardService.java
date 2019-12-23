package com.salt.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	BoardMapper mapper;
	
	public int insertBoard(BoardVO param) {
		return mapper.insertBoard(param);
	}
	
	public List<BoardVO> getBoardList() {
		return mapper.getBoardList();
	}
}
