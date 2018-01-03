package com.kong.board.DTO;

public class UserLoginDTO {

	private String userseq;
	private String userid;
	private String userpassword;
	public static String writeO;
	private String readO;
	
	
	

	public String getReadO() {
		return readO;
	}
	public void setReadO(String readO) {
		this.readO = readO;
	}
	public String getUserseq() {
		return userseq;
	}
	public void setUserseq(String userseq) {
		this.userseq = userseq;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getWriteO() {
		return writeO;
	}
	public void setWriteO(String writeO) {
		this.writeO = writeO;
	}
	
}
