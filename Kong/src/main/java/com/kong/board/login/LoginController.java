package com.kong.board.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kong.board.DTO.LoginDTO;
import com.kong.board.DTO.UserLoginDTO;

@Controller
public class LoginController {
	
	@Autowired
	private ILoginService service;
	
	@RequestMapping(method={RequestMethod.GET}, value="/login.action")
	public String Login(HttpServletRequest req, String login) {
		
		req.setAttribute("login", login);
		
		return "login/login";
	}

	@RequestMapping(method={RequestMethod.POST}, value="/loginOk.action")
	public String LoginOk(HttpServletRequest req, LoginDTO ldto, HttpSession session) {
		
		
		LoginDTO dto = service.logIn(ldto);
		
		session.setAttribute("LoginDTO", ldto);
		
		return "login/loginOk";
	}
	
	@RequestMapping(method={RequestMethod.GET}, value="/userlogin.action")
	public String UserLogin(HttpServletRequest req, String clear) {
		
		req.setAttribute("clear", clear);
		
		return "login/userlogin";
	}
	
	@RequestMapping(method={RequestMethod.POST}, value="/userloginOk.action")
	public String UserLoginOk(HttpServletRequest req, UserLoginDTO udto, HttpSession session) {
		
		UserLoginDTO dto = service.log(udto);
		
		session.setAttribute("UserLoginDTO", dto);
		
		return "login/userloginOk";
	}

	//회원가입
	@RequestMapping(method= {RequestMethod.GET},value="/sign.action" )
	 public String sign(HttpServletRequest req) {

		  return "login/sign";
		  
	 }
	
	//회원가입 하는곳
	@RequestMapping(method= {RequestMethod.GET},value="/useradd.action" )
	 public String Useradd(HttpServletRequest req) {
		  
		  return "login/useradd";
		  
	 }
	  
	@RequestMapping(method= {RequestMethod.POST},value="/useraddOk.action" )
	 public String UseraddOk(HttpServletRequest req, UserLoginDTO udto) {
		
		
		int result = service.useradd(udto);
		
		
		  return "login/useraddOk";
		
	 }
	
	
	
	
	
	
}




















