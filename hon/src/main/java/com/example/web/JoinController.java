package com.example.web;


import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.CEOVO;
import com.example.domain.UserVO;
import com.example.persistence.CEODAO;
import com.example.persistence.UserDAO;

@Controller
public class JoinController {
	//����Ʈ
	@RequestMapping("list")
	public String list(String email, HttpSession session) {
		if(email != null) {
			session.setAttribute("uid", email);
		}
		return "list";
	}
	@RequestMapping("insert")
	public String insert() {
		return "insert";
	}
	
	//�α���
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	//������ ������
	@RequestMapping("rpage")
	public String rpage() {
		return "rpage";
	}
	//���̵�ã��
	@RequestMapping("findId")
	public String findId() {
		return "findId";
	}
	//��й�ȣ ã��
	@RequestMapping("findPw")
	public String findPw() {
		return "findPw";
	}
	
	@Inject
	UserDAO dao;
	
	@Inject
	CEODAO cdao;
	
	//�α���
	@RequestMapping("loginPost")
	public String loginPost(UserVO vo, CEOVO cvo, Model model, String uid, String upw, HttpSession session) throws Exception{
		UserVO user=dao.login(vo);
		CEOVO ceo=cdao.login(cvo);
		if(user != null) {	//ȸ���α���
			model.addAttribute("user", user);
			return "loginPost";
		}else if(ceo != null) {	//����α���
			model.addAttribute("ceo", ceo);
			return "cpage";
		}else if(uid.equals("root") && upw.equals("honkey")) {	//�����ڷα���
			session.setAttribute("uid", uid);
			return "redirect:rpage";
		}
		return "redirect:login";
	}
	
	
	//�α׾ƿ�
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("uid");
		session.removeAttribute("cid");
		return "redirect:login";
	}

	//���̹�
	@RequestMapping("naverLogin")
	public String naverLogin() {
		return "naverLogin";
	}
	
	//īī��
	@RequestMapping("kakaoLogin")
	public String kakaoLogin() {
		return "kakaoLogin";
	}
	
	
}
