package com.example.web;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.UserVO;
import com.example.service.UserService;

@Controller
public class UserLoginController {

	@RequestMapping(value="/loginPost", method=RequestMethod.POST)
	public void loginPost(LoginDTO loginDTO, HttpSession httpSession, Model model) throws Exception {
		UserVO vo=UserService.login(loginDTO);
		
		if(vo==null|| !BCrypt.checkpw(loginDTO.getUpw(), vo.getUpw())) {
			return;
		}

		model.addAttribute("user", vo);
		
		if(loginDTO.isUseCookie()) {
			int amount = 60*60*24*7;
			Date sessionLimit=new Date(System.currentTimeMillis()+(1000*amount));
			UserService.keepLogin(vo.getUid(), httpSession.getId(), sessionLimit);
		}
	}
}
