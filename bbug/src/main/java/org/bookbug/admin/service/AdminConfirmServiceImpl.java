package org.bookbug.admin.service;

import javax.inject.Inject;

import org.bookbug.admin.persistence.AdminConfirmPersistenceImpl;
import org.bookbug.user.vo.MemberVO;
import org.springframework.stereotype.Service;

@Service
public class AdminConfirmServiceImpl implements AdminConfirmService{

	@Inject
	private AdminConfirmPersistenceImpl persistence;
	
	@Override
	public MemberVO login(MemberVO mvo) {
		
		return persistence.login(mvo);
	}

}
