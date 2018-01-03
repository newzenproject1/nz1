package com.kong.board;

import java.util.List;

import com.kong.board.DTO.KongDTO;
import com.kong.board.DTO.ReplyDTO;
import com.kong.board.DTO.UserLoginDTO;
import com.kong.board.DTO.BoardDTO;

public interface IKongService {

	
	List<BoardDTO> nlist();

	List<BoardDTO> nvlist(String boardseq);

	int add(BoardDTO dto);

	int del(String boardseq);

	int edit(BoardDTO dto);

	List<ReplyDTO> rlist();

	int radd(ReplyDTO dto);

	List<BoardDTO> ajaxlist();







	



}
