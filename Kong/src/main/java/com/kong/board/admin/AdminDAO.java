package com.kong.board.admin;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kong.board.DTO.UserLoginDTO;

@Repository
public class AdminDAO {
	
	@Autowired
	private SqlSessionTemplate sql;

	public List<UserLoginDTO> userlist() {
		
		return sql.selectList("admin.userlist");
	}

	public int userdel(String userid) {
		
		return sql.delete("admin.userdel", userid);
	}

	public int userwriteO(String userid) {
		
		return sql.update("admin.userwriteO", userid);
	}
	
	public int userwriteX(String userid) {
		
		return sql.update("admin.userwriteX", userid);
	}

}
