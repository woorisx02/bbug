package org.bookbug.admin.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.bookbug.user.vo.MemberVO;
import org.springframework.stereotype.Repository;

@Repository
public class AdminConfirmPersistenceImpl implements AdminConfirmPersistence{
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "org.admin.mappers.confirm";
	
	@Override
	public MemberVO login(MemberVO mvo) {
		return sql.selectOne(namespace+".login", mvo);
	}

}
