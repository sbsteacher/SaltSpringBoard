package com.salt.board;

import java.util.List;

public interface BoardMapper {
	int insertBoard(BoardVO p);
	List<BoardVO> getBoardList(SelectVO p);
	BoardVO getBoardDetail(BoardVO p);
	int updViewCnt(BoardVO p);
	void delBoard(int p);
	void modBoard(BoardVO p);
}
