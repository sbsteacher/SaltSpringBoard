package com.salt.board;

import java.util.List;

public interface BoardMapper {
	int insertBoard(BoardVO p);
	List<BoardVO> getBoardList();
	BoardVO getBoardDetail(BoardVO p);
	int updViewCnt(BoardVO p);
}
