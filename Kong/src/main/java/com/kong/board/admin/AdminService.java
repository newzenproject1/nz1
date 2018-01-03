package com.kong.board.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kong.board.DTO.UserLoginDTO;

@Service
public class AdminService implements IAdminService{

	@Autowired
	private AdminDAO dao;
	
	@Override
	public List<UserLoginDTO> userlist() {
		
		return dao.userlist();
	}
	
	@Override
	public int userdel(String userid) {
		
		return dao.userdel(userid);
	}
	
	@Override
	public int userwriteO(String userid) {
		
		return dao.userwriteO(userid);
	}

	
	@Override
	public int userwriteX(String userid) {
		
		return dao.userwriteX(userid);
	}
	
}
