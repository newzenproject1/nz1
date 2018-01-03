package com.kong.board.login;

import com.kong.board.DTO.LoginDTO;
import com.kong.board.DTO.UserLoginDTO;

public interface ILoginService {

	LoginDTO logIn(LoginDTO ldto);

	UserLoginDTO log(UserLoginDTO udto);

	int useradd(UserLoginDTO udto);

	
	
	
	
	
	
	
	

}
