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
	
	//보드 리스트 
	public List<BoardVO> getBoardList(SelectVO param) {
		int eidx = FinalObj.SHOW_CNT * param.getPage();
		int sidx = eidx - FinalObj.SHOW_CNT;
		
		param.setSidx(sidx);
		param.setEidx(eidx);
		
		System.out.println("sidx : " + sidx);
		System.out.println("eidx : " + eidx);
		
		return mapper.getBoardList(param);
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
	
	public int getTotalPageCnt() {
		return mapper.getTotalPageCnt(FinalObj.SHOW_CNT);
				
	}
	
	public void delBoard(int i_board) {
		mapper.delBoard(i_board);
	}
	
	public void modBoard(BoardVO param) {
		mapper.modBoard(param);
	}
}
