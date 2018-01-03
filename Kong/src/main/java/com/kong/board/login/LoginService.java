package com.kong.board.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.kong.board.DTO.LoginDTO;
import com.kong.board.DTO.UserLoginDTO;

@Service
public class LoginService implements ILoginService{
	
	@Autowired
	private LoginDAO dao;
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	public LoginDTO logIn(LoginDTO ldto) {
		
		return dao.logIn(ldto);
	}
	
	@Override
	public UserLoginDTO log(UserLoginDTO udto) {
		
		return dao.log(udto);
	}

	@Override
	public int useradd(UserLoginDTO udto) {
		
		return dao.useradd(udto);
	}
	
	
	
	
	
	
	
	
	
	
	
}
