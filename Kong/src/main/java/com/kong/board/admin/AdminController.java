package com.kong.board.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kong.board.DTO.LoginDTO;
import com.kong.board.DTO.UserLoginDTO;

@Controller
public class AdminController {
	
	@Autowired
	private IAdminService service;
	
	@RequestMapping(method={RequestMethod.GET}, value="/admin.action")
	public String Admin(HttpServletRequest req) {
		
		List<UserLoginDTO> userlist = service.userlist();
		
		req.setAttribute("userlist", userlist);
		
		return "admin/admintest";
	}
	
	@RequestMapping(method={RequestMethod.POST}, value="/userdel.action")
	public String UserDel(HttpServletRequest req) {
				
		String[] list = req.getParameterValues("userid");
		
		int result = 0;
		
		for(int i=0; i<list.length; i++) {

			result = service.userdel(list[i]);
			         
		}
		
		req.setAttribute("result", result);
		
		return "admin/userdel";
		
	};
	
	
	@RequestMapping(method={RequestMethod.POST}, value="/writeo.action") 
	public String WriteO(HttpServletRequest req) {
		
		String[] wlist = req.getParameterValues("userid");
		
		int result = 0;
			
		
		for(int i=0; i<wlist.length; i++) {
			
			result = service.userwriteO(wlist[i]);	
			
			
		}
		 
		
		req.setAttribute("result", result);
		
		return "admin/write";
	}
	
	@RequestMapping(method={RequestMethod.POST}, value="/writex.action")
	public String WriteX(HttpServletRequest req) {
		
		String[] wlist = req.getParameterValues("userid");
		
		int result = 0;
			
		
		for(int i=0; i<wlist.length; i++) {
			
			result = service.userwriteX(wlist[i]);	
			
			
		}	 
		
		req.setAttribute("result", result);
		
		return "admin/write";
	}
	
	
	
	
	
	
	
	
	
	

	
}
