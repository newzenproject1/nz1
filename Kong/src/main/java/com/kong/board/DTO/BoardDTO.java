package com.kong.board.DTO;

public class BoardDTO {

	public String getBoardseq() {
		return boardseq;
	}

	public void setBoardseq(String boardseq) {
		this.boardseq = boardseq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getEnrolltime() {
		return enrolltime;
	}

	public void setEnrolltime(String enrolltime) {
		this.enrolltime = enrolltime;
	}
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getCnt_hit() {
		return cnt_hit;
	}
	
	public void setCnt_hit(String cnt_hit) {
		this.cnt_hit = cnt_hit;
	}

	private String boardseq;
	private String title;
	private String ncontent;
	private String enrolltime;
	private String userid;
	private String cnt_hit;
	
	// 디버깅용 toString()

	
}
