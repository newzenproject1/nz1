package com.kong.board.DTO;

public class ReplyDTO {

	public String getReplyseq() {
		return replyseq;
	}
	public void setReplyseq(String replyseq) {
		this.replyseq = replyseq;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	private String replyseq;
	private String reply;
	private String boardseq;
	public String getBoardseq() {
		return boardseq;
	}
	public void setBoardseq(String boardseq) {
		this.boardseq = boardseq;
	}
	
}
 