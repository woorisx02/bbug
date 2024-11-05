package org.bookbug.admin.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.bookbug.admin.service.AdminConfirmServiceImpl;
import org.bookbug.user.vo.MemberVO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin/confirm/*")
public class AdminConfirmController {

	@Inject
	private AdminConfirmServiceImpl service;
	
	@Inject
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	//로그인 화면처리
	@GetMapping("/login")
	public void login() {}
	
	//로그인 데이터처리
	@PostMapping("/login")
	public String login(MemberVO mvo, HttpSession session, RedirectAttributes rttr) {
		MemberVO dbmvo = service.login(mvo);
		
		String url = null;
		if(dbmvo!=null) {
			boolean passMatch = bCryptPasswordEncoder.matches(mvo.getUser_pwd(), dbmvo.getUser_pwd());
			if(passMatch) {
				session.setAttribute("member", dbmvo);
				url = "redirect:/admin/member/mypage";
			}else {
				session.setAttribute("member", null);
				rttr.addAttribute("user_pwd", false);
				url = "redirect:/admin/confirm/login";
			}
			
		}else {
			session.setAttribute("member", null);
			rttr.addAttribute("user_id", false);
			url = "redirect:/admin/confirm/login";
		}
		
		return url;
	}
}
