package com.salt.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class BoardService {
	
	@Autowired
	BoardMapper mapper;
	
	public int insertBoard(BoardVO param) {
		HttpServletRequest req = ((ServletRequestAttributes)
				RequestContextHolder.currentRequestAttributes()).getRequest();
        String ip = req.getHeader("X-FORWARDED-FOR");
        if (ip == null) {
            ip = req.getRemoteAddr();
        }
        param.setIpaddr(ip);
		return mapper.insertBoard(param);
	}
	
	public List<BoardVO> getBoardList() {
		return mapper.getBoardList();
	}
	
	public BoardVO getBoardDetail(BoardVO param) {
		HttpServletRequest req = ((ServletRequestAttributes)
				RequestContextHolder.currentRequestAttributes()).getRequest();
        String ip = req.getHeader("X-FORWARDED-FOR");
        if (ip == null) {
            ip = req.getRemoteAddr();
        }
        System.out.println("ip : " + ip);
        
        param.setIpaddr(ip);
		
		mapper.updViewCnt(param);
		return mapper.getBoardDetail(param);
	}
	
	public void delBoard(int i_board) {
		mapper.delBoard(i_board);
	}
	
	public void modBoard(BoardVO param) {
		mapper.modBoard(param);
	}
}
