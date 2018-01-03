package com.kong.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.kong.board.DTO.BoardDTO;
import com.kong.board.DTO.ReplyDTO;
import com.kong.board.DTO.UserLoginDTO;

@Service
public class KongService implements IKongService {
	
	@Autowired
	private KongDAO dao;
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	public List<BoardDTO> nlist() {
		
		return dao.nlist();
	}

	@Override
	public List<BoardDTO> nvlist(String boardseq) {
		
		return dao.nvlist(boardseq);
	}


	@Override
	public int add(BoardDTO dto) {
	
		return dao.add(dto);
	}
	
	@Override
	public int del(String boardseq) {
		
		return dao.del(boardseq);
	}
	
	
	@Override
	public int edit(BoardDTO dto) {
		
		return dao.edit(dto);
	}
	

	@Override
	public List<ReplyDTO> rlist() {
		// TODO Auto-generated method stub
		return dao.rlist();
	}
	
	@Override
	public int radd(ReplyDTO dto) {
		
		return dao.radd(dto);
	}
	

	@Override
	public List<BoardDTO> ajaxlist() {
		
		return dao.ajaxlist();
	}
	
	
	
	
}
