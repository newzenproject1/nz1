package com.kong.board.admin;

import java.util.List;

import com.kong.board.DTO.UserLoginDTO;

public interface IAdminService {

	List<UserLoginDTO> userlist();

	int userdel(String userid);

	int userwriteO(String userid);
	
	int userwriteX(String userid);



}
