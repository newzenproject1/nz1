package com.kong.board.login;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kong.board.DTO.LoginDTO;
import com.kong.board.DTO.UserLoginDTO;

@Repository
public class LoginDAO {

	@Autowired
	private SqlSessionTemplate sql;

	public LoginDTO logIn(LoginDTO ldto) {
		
		return sql.selectOne("login.log", ldto);
	}

	public UserLoginDTO log(UserLoginDTO udto) {
		
		return sql.selectOne("login.ulog", udto);
	}

	public int useradd(UserLoginDTO udto) {
		
		return sql.insert("login.useradd", udto);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
