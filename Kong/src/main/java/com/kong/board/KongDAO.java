package com.kong.board;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kong.board.DTO.KongDTO;
import com.kong.board.DTO.ReplyDTO;
import com.kong.board.DTO.UserLoginDTO;
import com.kong.board.DTO.BoardDTO;

@Repository
public class KongDAO {

	@Autowired
	private SqlSessionTemplate sql;
	
	
	public List<BoardDTO> nlist() {
		
		return sql.selectList("kong.nlist");
	}


	public List<BoardDTO> nvlist(String boardseq) {
		
		return sql.selectList("kong.nvlist", boardseq);
	}


	public int add(BoardDTO dto) {
		
		return sql.insert("kong.add", dto);
	}


	public int del(String boardseq) {
		
		return sql.delete("kong.del", boardseq);
	}


	public int edit(BoardDTO dto) {
		
		return sql.update("kong.edit", dto);
	}


	public List<ReplyDTO> rlist() {
		
		return sql.selectList("kong.rlist");
	}


	public int radd(ReplyDTO dto) {
		
		return sql.insert("kong.radd", dto);
	}


	public List<BoardDTO> ajaxlist() {
		
		return sql.selectList("kong.ajaxlist");
	}










	
	
	
}