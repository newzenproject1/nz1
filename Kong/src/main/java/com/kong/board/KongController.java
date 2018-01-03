package com.kong.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kong.board.DTO.BoardDTO;
import com.kong.board.DTO.ReplyDTO;
import com.kong.board.DTO.UserLoginDTO;


@Controller
public class KongController {
	
	@Autowired
	private IKongService service;

	
	@RequestMapping(method={RequestMethod.GET}, value="/board.action")
	public String Board(HttpServletRequest req) {

		List<BoardDTO> nlist = service.nlist();
		
		req.setAttribute("nlist", nlist);
		
		return "boader/board";
	}//Board
	
	@RequestMapping(method={RequestMethod.GET}, value="/boardview.action")
	public String BoardView(HttpServletRequest req,String boardseq) {
 
		List<BoardDTO> nvlist = service.nvlist(boardseq);
		
		req.setAttribute("nvlist", nvlist);
		
		return "boader/boardview";
	}//Boardview
	
	@RequestMapping(method={RequestMethod.GET}, value="/boardadd.action")
	public String BoardAdd(HttpServletRequest req) {
		
		return "boader/boardadd";
	}//boardadd
	
	@RequestMapping(method={RequestMethod.POST}, value="/boardaddOk.action")
	public String BoardAddOk(HttpServletRequest req, BoardDTO dto) {
		
		int result = service.add(dto);
		
		return "boader/boardaddOk";
	}//boardaddOk
	
	
	@RequestMapping(method={RequestMethod.GET}, value="/boardDel.action")
	public String BoardDel(HttpServletRequest req, String boardseq) {

		int result = service.del(boardseq);
		
		req.setAttribute("result", result);
		
		return "boader/boardDel";
		
	}//boardDel
	
	@RequestMapping(method={RequestMethod.GET}, value="/boardEdit.action")
	public String BoardEdit(HttpServletRequest req, String boardseq) {

		List<BoardDTO> nvlist = service.nvlist(boardseq);
		
		req.setAttribute("nvlist", nvlist);
		
		return "boader/boardEdit";
		
	}//boardedit
	
	@RequestMapping(method={RequestMethod.POST}, value="/boardEditOk.action")
	public String BoardEditOk(HttpServletRequest req, BoardDTO dto) {

		int result = service.edit(dto);
		
		return "boader/boardEditOk";
		
	}//boardedit
	
	@RequestMapping(method={RequestMethod.GET}, value="/reply.action")
	public String Reply(HttpServletRequest req,String boardseq) {
		
		List<BoardDTO> nvlist = service.nvlist(boardseq);
		
		List<ReplyDTO> rlist = service.rlist();
		
		req.setAttribute("nvlist", nvlist);
		
		req.setAttribute("rlist", rlist);
		
		return "boader/reply";
	}//Reply
	
	@RequestMapping(method={RequestMethod.GET}, value="/replyadd.action")
	public String ReplyAdd(HttpServletRequest req,String boardseq) {
		
		return "boader/boardview";
	}//ReplyAdd
	
	@RequestMapping(method={RequestMethod.POST}, value="/replyaddOk.action")
	public String BoardAddOk(HttpServletRequest req, ReplyDTO dto) {
		
		int result = service.radd(dto);
		
		return "boader/replyaddOk";
	}//boardaddOk
	
	
	@RequestMapping(method={RequestMethod.GET}, value="/ajaxboard.action")
	public String AjaxBoard(HttpServletRequest req) {

		List<BoardDTO> ajaxlist = service.ajaxlist();
		
		req.setAttribute("ajaxlist", ajaxlist);
		
		return "boader/ajaxboard";
	}//Board
	
	
	
	
}




































