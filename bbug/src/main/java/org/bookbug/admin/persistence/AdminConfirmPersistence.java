package org.bookbug.admin.persistence;

import org.bookbug.user.vo.MemberVO;

public interface AdminConfirmPersistence {

	public MemberVO login(MemberVO mvo);
	
}
